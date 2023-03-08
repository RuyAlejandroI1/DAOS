/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAIR
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.*;

public class Snake extends JFrame implements KeyListener, Runnable {

    private static final long serialVersionUID = 1L;
    JPanel p1, p2;
    JButton[] lb = new JButton[200];
    JButton bonusfood;
    JTextArea t;
    int x = 600, y = 250, gu = 2, dirx = 1, diry = 0, speed = 50, dif = 0, oldx, oldy, score = 0;
    int[] lbx = new int[300];
    int[] lby = new int[300];
    Point[] lbp = new Point[300];
    Point bfp = new Point();
    Thread myt;
    boolean food = false, runl = false, runr = true, runu = true, rund = true, bonusflag = true;
    Random r = new Random();
    JMenuBar mymbar;
    JMenu juego, ayuda, nivel;

    public void initializeValues() {
        gu = 3;
        lbx[0] = 100;
        lby[0] = 150;
        dirx = 10;
        diry = 0;
        dif = 0;
        score = 0;
        food = false;
        runl = false;
        runr = true;
        runu = true;
        rund = true;
        bonusflag = true;
    }

    public Snake() {
        super("Snake");
        setSize(600, 330);
        creatBar();
        initializeValues();
        p1 = new JPanel();
        p2 = new JPanel();
        t = new JTextArea("Score ==>" + score);
        t.setEnabled(false);
        t.setBackground(Color.blue);
        bonusfood = new JButton();
        bonusfood.setEnabled(false);
        creaSnake();
        p1.setLayout(null);
        p2.setLayout(new GridLayout(0, 1));
        p1.setBounds(0, 0, x, y);
        p1.setBackground(Color.black);
        p2.setBounds(0, y, x, 30);
        p2.setBackground(Color.gray);
        p2.add(t);
        getContentPane().setLayout(null);
        getContentPane().add(p1);
        getContentPane().add(p2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        myt = new Thread(this);
        myt.start();
    }

    public void creaSnake() {
        for (int i = 0; i < 3; i++) {
            lb[i] = new JButton("lb" + i);
            lb[i].setEnabled(false);
            p1.add(lb[i]);
            lb[i].setBounds(lbx[i], lby[i], 10, 10);
            lbx[i + 1] = lbx[i] - 10;
            lby[i + 1] = lbx[i] - 10;
        }
    }

    public void creatBar() {
        mymbar = new JMenuBar();
        juego = new JMenu("Juego");
        JMenuItem nuevojuego = new JMenuItem("Nuevo juego");
        JMenuItem salir = new JMenuItem("Salir");

        nuevojuego.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        reset();
                    }
                });
        juego.add(nuevojuego);
        juego.addSeparator();
        juego.add(salir);

        mymbar.add(juego);
        setJMenuBar(mymbar);
    }

    void reset() {
        initializeValues();
        p1.removeAll();
        myt.stop();
        creaSnake();
        t.setText("Score ==>" + score);
        myt = new Thread(this);
        myt.start();
    }

    void growup() {
        lb[gu] = new JButton();
        lb[gu].setEnabled(false);
        p1.add(lb[gu]);
        int a = 10 + (10 * r.nextInt(48));
        int b = 10 + (10 * r.nextInt(23));

        lbx[gu] = a;
        lby[gu] = b;
        lb[gu].setBounds(a, b, 10, 10);
        gu++;
    }

    void moveForward() {
        for (int i = 0; i < gu; i++) {
            lbp[i] = lb[i].getLocation();
        }

        lbx[0] += dirx;
        lby[0] += diry;
        lb[0].setBounds(lbx[0], lby[0], 10, 10);

        for (int i = 1; i < gu; i++) {
            lb[i].setLocation(lbp[i - 1]);
        }

        if (lbx[0] == x) {
            lbx[0] = 10;
        } else if (lbx[0] == 0) {
            lbx[0] = x - 10;
        } else if (lby[0] == y) {
            lby[0] = 10;
        } else if (lby[0] == 0) {
            lby[0] = y - 10;
        }

        if (lbx[0] == lbx[gu - 1] && lby[0] == lby[gu - 1]) {
            food = false;
            score += 5;
            t.setText("Score ==>" + score);
            if (score % 50 == 0 && bonusflag == true) {
                p1.add(bonusfood);
                bonusfood.setBounds((10 * r.nextInt(50)), (10 * r.nextInt(25)), 15, 15);
                bfp = bonusfood.getLocation();
                bonusflag = false;
            }
        }

        if (bonusflag == false) {
            if (bfp.x <= lbx[0] && bfp.y <= lby[0] && bfp.x + 10 >= lbx[0] && bfp.y + 10 >= lby[0]) {
                p1.remove(bonusfood);
                score += 100;
                t.setText("Score ==>" + score);
                bonusflag = true;
            }
        }

        if (food == false) {
            growup();
            food = true;
        } else {
            lb[gu - 1].setBounds(lbx[gu - 1], lby[gu - 1], 10, 10);
        }
        for (int i = 1; i < gu; i++) {
            if (lbp[0] == lbp[i]) {
                t.setText("GAME OVER      " + score);
                try {
                    myt.join();
                } catch (InterruptedException ie) {
                }
                break;
            }
        }

        p1.repaint();
        show();
    }

    public void keyPressed(KeyEvent e) {
        //Direccion izquierda

        //Direccion arriba
        if (runu == true && e.getKeyCode() == 38) {
            dirx = 0;
            diry = -10;
            rund = false;
            runr = true;
            runu = true;
        }
        //Direccion derecha
        if (runr == true && e.getKeyCode() == 39) {
            dirx = +10;
            diry = 0;
            runl = false;
            runu = true;
            rund = true;
        }
        //Direccion abajo
        if (rund == true && e.getKeyCode() == 40) {
            dirx = 0;
            diry = +10;
            runu = false;
            runr = true;
            runl = true;
        }

    }

    public void run() {
        // TODO Auto-generated method stub
        for (;;) {
            moveForward();
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ie) {

            }
        }

    }

    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

}
