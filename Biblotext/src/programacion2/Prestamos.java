package programacion2;

import java.util.List;

public class Prestamos {

	private int id;
	private int Folio;
	private int F_inicio;
	private int F_devolucion;
	private String Estatus;
	private List<Libros> Libros;
	private Persona persona;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFolio() {
		return Folio;
	}

	public void setFolio(int folio) {
		Folio = folio;
	}

	public int getF_inicio() {
		return F_inicio;
	}

	public void setF_inicio(int f_inicio) {
		F_inicio = f_inicio;
	}

	public int getF_devolucion() {
		return F_devolucion;
	}

	public void setF_devolucion(int f_devolucion) {
		F_devolucion = f_devolucion;
	}

	public String getEstatus() {
		return Estatus;
	}

	public void setEstatus(String estatus) {
		Estatus = estatus;
	}

	public List<Libros> getLibros() {
		return Libros;
	}

	public void setLibros(List<Libros> libros) {
		Libros = libros;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "\nPrestamos [id=" + id + ", Folio=" + Folio + ", F_inicio=" + F_inicio + ", F_devolucion="
				+ F_devolucion + ", Estatus=" + Estatus + "]" + "\n Libros=" + Libros + "" + persona + "]";
	}
}
