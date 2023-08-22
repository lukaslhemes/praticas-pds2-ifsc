package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.jogo;

public class jogoDAO {
	
	public ArrayList<jogo> listar () {
		
		conexao c = conexao.getInstancia();
		
		// Abrir a conexão com banco de dados
		Connection con = c.conectar();
		
		ArrayList<jogo> jogo = new ArrayList();
		
		String query = "SELECT * FROM jogo";
		try {
			PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps. executeQuery();
		while(rs.next()) {
			int idjogo = rs.getInt("id_jogo");
			
			String nomejogo = rs.getString("nome_jogo");
			
			jogo j = new jogo();
			j.setId_jogo(idjogo);
			j.setNome_jogo(nomejogo);
			
			jogo.add(j);
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		c.fecharConexao();
	}
		
		
		return jogo;
			
	}
	
	
	
	// metodo que recebe um jogo 
	
	public boolean inserir(jogo j) {
		
		// instanciar a classe
		conexao c = conexao.getInstancia();
		
		// Abrir a conexão com banco de dados
		Connection con = c.conectar();
		
		String query = "INSERT INTO jogo (id_Jogo, nome_Jogo ) VALUES(?, ? )";
		
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, j.getId_jogo());
			ps.setString(2, j.getNome_jogo());
			
			ps.executeUpdate();
			
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.fecharConexao();
		}
		
		return false;
	}
	public boolean excluir(jogo j) {
		conexao c = conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "DELETE FROM jogo WHERE id_jogo = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, j.getId_jogo());
			ps.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.fecharConexao();
		}
		
		return false;
	}
	
	public boolean atualizar (jogo j) {
		conexao c = conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE jogo SET" + "nome_jogo = ? WHERE id_jogo IN (?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, j.getNome_jogo());
			ps.setInt(1, j.getId_jogo());
			ps.executeUpdate();
			
			c.fecharConexao();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.fecharConexao();		
			}
		
		return false;
	}

}
