package programacion2;

public class Persona  {
	
	protected String Nombre;
	protected String Apellidos;
	private String Genero;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return "\n[Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Genero=" + Genero + "]";
	}

	}
