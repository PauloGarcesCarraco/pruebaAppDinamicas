package cl.edutecno.main;

import java.util.List;

import cl.edutecno.dao.CategoriaDAOImpl;
import cl.edutecno.dao.ProductoDAOImpl;
import cl.edutecno.model.Categoria;
import cl.edutecno.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CategoriaDAOImpl pruebaCategoriaDAO = new CategoriaDAOImpl();
		List<Categoria> listCategoria = pruebaCategoriaDAO.listarCategoria();
		System.out.println(listCategoria);
//
//		System.out.println(pruebaCategoriaDAO.buscarCategoria(1));

//		ProductoDAOImpl pruebaProductoDAO = new ProductoDAOImpl();
//		Producto producto = new Producto(2,"Ariel",5990,"Detergente en polvo",1);
//		pruebaProductoDAO.agregarProducto(producto);
//		Producto producto2 = new Producto(3,"Drive",8990,"Detergente liquido",1);
//		pruebaProductoDAO.agregarProducto(producto2);
		
		//pruebaProductoDAO.eliminarProducto(2);
		
		
		
	//	List<Producto> listproducto = pruebaProductoDAO.listarProducto();
	//	System.out.println(listproducto);
//
//		System.out.println(pruebaProductoDAO.buscarProducto(1));

	}

}
