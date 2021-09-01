package cl.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.edutecno.conexion.AdministradorConexiones;
import cl.edutecno.model.Categoria;
import cl.edutecno.model.Producto;

public class ProductoDAOImpl extends AdministradorConexiones implements IProductoDAO {

	
	public ProductoDAOImpl() {
		Connection conn;
		conn = obtenerConexion();
}
	
	
	@Override
	public List<Producto> listarProducto() {
		String query = "SELECT * FROM PRODUCTO order by id_producto asc" ;
		List<Producto> productos = new ArrayList<Producto>();
		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Producto producto = new Producto();
				producto.setIdProducto(rs.getInt("id_producto"));
				producto.setNombreProducto(rs.getString("nombre_producto"));
				producto.setPrecioProducto(rs.getInt("precio_producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_producto"));
				producto.setIdCategoria(rs.getInt("id_categoria"));
				productos.add(producto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return productos;

	}

	@Override
	public Producto buscarProducto(int idProducto) {
		String query = "SELECT * FROM producto WHERE id_producto=" + idProducto;

		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			Producto producto = new Producto();

			if (rs.next()) {
				// los nombres deben ser igual a los parametros de la tabla
				producto.setIdProducto(rs.getInt("id_producto"));
				producto.setNombreProducto(rs.getString("nombre_producto"));
				producto.setPrecioProducto(rs.getInt("precio_producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_producto"));
				producto.setIdCategoria(rs.getInt("id_categoria"));
			}
			return producto;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int agregarProducto(Producto producto) {
		String query = "insert into producto values(producto_sec.NEXTVAL,?,?,?,?)";
		int result=0;
		try {
			pstm = conn.prepareStatement(query);
			pstm.setString(1, producto.getNombreProducto());
			pstm.setInt(2, producto.getPrecioProducto());
			pstm.setString(3, producto.getDescripcionProducto());
			pstm.setInt(4, producto.getIdCategoria());
			result = pstm.executeUpdate();//ejecuta una actualizacion en BBDD
			if(result==1) {
				System.out.println("Producto agregado Satisfactoriamente");
			}else {
				System.out.println("Producto no agregado");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

	@Override
	public Producto modificarProducto(Producto producto) {
		String query= "UPDATE producto SET nombre_producto=?,precio_producto=?,descripcion_producto=?,id_categoria=? WHERE id_producto=? ";
		
		try {
			pstm=conn.prepareStatement(query);
			pstm.setString(1, producto.getNombreProducto());
			pstm.setInt(2, producto.getPrecioProducto());
			pstm.setString(3, producto.getDescripcionProducto());
			pstm.setInt(4,producto.getIdCategoria());
			pstm.setInt(5, producto.getIdProducto());
			
			int result=pstm.executeUpdate();//ejecuta una actualizacion en base de datos
			if(result==1) {
				System.out.println("Producto modificado Satisfactoriamente");
			}else {
				System.out.println("Producto no modificado");
			}
			
		} catch (Exception e) {

		}
		return producto;

		
	}

	@Override
	public boolean eliminarProducto(int idProducto) {
		String query="delete from producto where id_producto=?";
        boolean resultado=false;
        
        try {
            pstm=conn.prepareStatement(query);
            pstm.setInt(1, idProducto);//aca asigno ID de la query
            int result=pstm.executeUpdate();
            if(result==1) {
            	resultado=true;
            	System.out.println("Eliminacion de registro exitosa");
            }else {
            	resultado=false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
	}

}
