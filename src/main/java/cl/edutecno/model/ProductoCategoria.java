package cl.edutecno.model;

//Establece relacion entre producto y categoria
public class ProductoCategoria {
	private Producto producto;
	private Categoria categoria;

	public ProductoCategoria() {
		// TODO Auto-generated constructor stub
	}

	//G&S
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ProductoCategoria [producto=" + producto + ", categoria=" + categoria + "]";
	}
	
	
}
