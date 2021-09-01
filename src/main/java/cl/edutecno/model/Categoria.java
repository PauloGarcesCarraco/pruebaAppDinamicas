package cl.edutecno.model;

public class Categoria {
	private int idCategoria;
	private String nombreCategoria;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	//G&S
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombrCategoria() {
		return nombreCategoria;
	}

	public void setNombrCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + "]";
	}
	
	
	

}
