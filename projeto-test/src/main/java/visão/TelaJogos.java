package visão;

import java.util.ArrayList;

import Controle.jogoDAO;
import modelo.jogo;

public class TelaJogos {
	
	public static void main(String[] args ) {
		
		jogoDAO dao = new jogoDAO();
		ArrayList <jogo> jogo = dao.listar();	
		
			for (jogo Jogo: jogo) {
				
			}
		}
	

}
