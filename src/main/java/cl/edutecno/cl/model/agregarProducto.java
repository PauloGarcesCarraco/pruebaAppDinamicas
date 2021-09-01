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
import cl.edutecno.dao.ProductoCategoriaDAOImpl;
import cl.edutecno.dao.ProductoDAOImpl;
import cl.edutecno.model.Categoria;
import cl.edutecno.model.Producto;
import cl.edutecno.model.ProductoCategoria;

/**
 * Servlet implementation class agregarProducto
 */
@WebServlet("/agregarProducto")
public class agregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public agregarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    CategoriaDAOImpl categoriaDAO= new CategoriaDAOImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Categoria>listaCategoria=new ArrayList<Categoria>();
		listaCategoria=categoriaDAO.listarCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.getRequestDispatcher("agregarProducto.jsp").forward(request, response);
	}
	
	ProductoDAOImpl productoDAO = new ProductoDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Producto producto= new Producto();
		producto.setIdProducto(0);
		producto.setNombreProducto(req.getParameter("nombre_producto"));
		producto.setPrecioProducto(Integer.parseInt(req.getParameter("precio_producto")));
		producto.setIdCategoria(Integer.parseInt(req.getParameter("categoria_producto")));//llama por el name y no id
		producto.setDescripcionProducto(req.getParameter("descripcion_producto"));
		
		int retorno= productoDAO.agregarProducto(producto);
		if(retorno==1) {
			req.getRequestDispatcher("listarProducto").forward(req, resp);
		}else {
			
		}
		

	}


}
