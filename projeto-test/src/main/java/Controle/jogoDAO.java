package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.jogo;

public class jogoDAO {
	
	// metodo que recebe um jogo 
	
	public boolean inserir(jogo j) {
		
		// instanciar a classe
		conexao c = conexao.getInstancia();
		
		// Abrir a conexão com banco de dados
		Connection con = c.conectar();
		
		String query = "INSERT INTO jogo (idJogo, nomeJogo ) VALUES(?, ? )";
		
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, j.getId_jogo());
			ps.setString(2, j.getNome_jogo());
			
			ps.executeUpdate();
			
			c.fecharConexao();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
