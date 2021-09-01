package cl.edutecno.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import cl.edutecno.conexion.AdministradorConexiones;
import cl.edutecno.model.Categoria;

public class CategoriaDAOImpl extends AdministradorConexiones implements ICategoriaDAO {

	public CategoriaDAOImpl() {
		Connection conn;
		conn = obtenerConexion();
	}

	@Override
	public List<Categoria> listarCategoria() {
		String query = "SELECT * FROM CATEGORIA";
		List<Categoria> categorias = new ArrayList<Categoria>();
		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Categoria categoria = new Categoria(rs.getInt("id_categoria"), rs.getString("nombre_categoria"));
				categorias.add(categoria);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return categorias;

	}

	@Override
	public Categoria buscarCategoria(int idCategoria) {

		String query = "SELECT * FROM categoria WHERE id_categoria=" + idCategoria;

		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			Categoria categoria = new Categoria();

			if (rs.next()) {
				//los nombres deben ser igual a los parametros de la tabla
				categoria.setIdCategoria(rs.getInt("id_categoria"));
				categoria.setNombrCategoria(rs.getString("nombre_categoria"));
			}
			return categoria;

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

}
