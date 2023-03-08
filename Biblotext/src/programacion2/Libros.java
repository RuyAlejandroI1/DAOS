
package programacion2;

public class Libros {

	private int id;
	private int ISBN;
	private String NombreL;
	private String Editorial;
	private String Categoria;
	private int stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getNombreL() {
		return NombreL;
	}

	public void setNombreL(String nombreL) {
		NombreL = nombreL;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;

	}

	@Override
	public String toString() {
		return "id=" + id + ", ISBN=" + ISBN + ", Nombre del libro=" + NombreL + ", Editorial=" + Editorial + ", Categoria="
				+ Categoria + ", stock=" + stock;
	}
}