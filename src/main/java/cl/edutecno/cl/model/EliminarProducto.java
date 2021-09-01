package cl.edutecno.cl.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.edutecno.dao.IProductoCategoriaDAO;
import cl.edutecno.dao.IProductoDAO;
import cl.edutecno.dao.ProductoCategoriaDAOImpl;
import cl.edutecno.dao.ProductoDAOImpl;
import cl.edutecno.model.ProductoCategoria;




/**
 * Servlet implementation class EliminarProducto
 */
@WebServlet("/EliminarProducto")
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

    private IProductoCategoriaDAO categoriaProductoDAO = new ProductoCategoriaDAOImpl(); // se instancia la clase
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ProductoCategoria> listaPC= new ArrayList<ProductoCategoria>();// se crea una lista para rellenar con ProductoCategoria
		listaPC= categoriaProductoDAO.listarCategoria(); // se rellena la lista PC
		request.setAttribute("listaPC", listaPC); // se le entrega la lista al atributo
		request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response); // se envia al jsp
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	IProductoDAO productoDAO= new ProductoDAOImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		productoDAO.eliminarProducto(Integer.parseInt(request.getParameter("id_producto")));
		doGet(request, response);
	}

}
