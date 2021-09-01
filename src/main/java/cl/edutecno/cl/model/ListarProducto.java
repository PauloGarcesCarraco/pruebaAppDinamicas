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
import cl.edutecno.dao.ProductoCategoriaDAOImpl;
import cl.edutecno.model.ProductoCategoria;

/**
 * Servlet implementation class ListarProductoControlador
 */
@WebServlet("/listarProducto")
public class ListarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	private IProductoCategoriaDAO categoriaProductoDAO=new ProductoCategoriaDAOImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ProductoCategoria>listaPC=new ArrayList<ProductoCategoria>();
		listaPC=categoriaProductoDAO.listarCategoria();
		request.setAttribute("listaPC", listaPC);
		request.getRequestDispatcher("listarProducto.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
