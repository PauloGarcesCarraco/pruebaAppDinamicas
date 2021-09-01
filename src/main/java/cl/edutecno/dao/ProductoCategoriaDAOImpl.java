package cl.edutecno.dao;

import java.util.ArrayList;
import java.util.List;

import cl.edutecno.model.Producto;
import cl.edutecno.model.ProductoCategoria;

public class ProductoCategoriaDAOImpl implements IProductoCategoriaDAO{

	@Override
	public List<ProductoCategoria> listarCategoria() {
		List<ProductoCategoria>listaProductoCategoria= new ArrayList<ProductoCategoria>();
		List<Producto>listaProducto=new ArrayList<Producto>();
	//	List<Categoria>listaCategoria=new ArrayList<Categoria>();
		
		
		try {
			ProductoDAOImpl productoDAO=new ProductoDAOImpl();
			CategoriaDAOImpl categoriaDAO= new CategoriaDAOImpl();
			listaProducto=productoDAO.listarProducto();
			
			for(Producto productoTemp: listaProducto) {//se reocrren la lista producto para setear categoria
				ProductoCategoria productoCategoria=new ProductoCategoria();
				productoCategoria.setProducto(productoTemp);
				
				productoCategoria.setCategoria(categoriaDAO.buscarCategoria(productoTemp.getIdCategoria()));//se setea la categoria a producto categoria
				listaProductoCategoria.add(productoCategoria);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return listaProductoCategoria;
	}

}
