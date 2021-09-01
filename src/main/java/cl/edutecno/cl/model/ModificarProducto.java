package cl.edutecno.cl.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.edutecno.dao.CategoriaDAOImpl;
import cl.edutecno.dao.IProductoCategoriaDAO;
import cl.edutecno.dao.ProductoCategoriaDAOImpl;
import cl.edutecno.dao.ProductoDAOImpl;
import cl.edutecno.model.Categoria;
import cl.edutecno.model.Producto;
import cl.edutecno.model.ProductoCategoria;

/**
 * Servlet implementation class ModificarProducto
 */
@WebServlet("/ModificarProducto")
public class ModificarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModificarProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private CategoriaDAOImpl categoriaDAO = new CategoriaDAOImpl(); // se intancia la clase
	private IProductoCategoriaDAO categoriaProductoDAO = new ProductoCategoriaDAOImpl(); // se instancia la clase

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Categoria> listaCategoria = new ArrayList<Categoria>();// declaracion lista para las categorias
		listaCategoria = categoriaDAO.listarCategoria(); // se rellena la lista
		request.setAttribute("listaCategoria", listaCategoria); // se envia la lista
		List<ProductoCategoria> listaPC = new ArrayList<ProductoCategoria>();// se crea una lista para rellenar con
																				// ProductoCategoria
		listaPC = categoriaProductoDAO.listarCategoria(); // se rellena la lista PC
		request.setAttribute("listaPC", listaPC); // se le entrega la lista al atributo
		request.getRequestDispatcher("modificarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	ProductoDAOImpl productoDAO = new ProductoDAOImpl();// instancia glo

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Producto producto = new Producto();
		producto.setIdProducto(Integer.parseInt(request.getParameter("id_producto")));
		producto.setIdCategoria(Integer.parseInt(request.getParameter("categoria_producto")));
		producto.setNombreProducto(request.getParameter("nombre_producto"));
		producto.setPrecioProducto(Integer.parseInt(request.getParameter("precio_producto")));
		producto.setDescripcionProducto(request.getParameter("descripcion_producto"));
		productoDAO.modificarProducto(producto);
		doGet(request, response);
	}

}
