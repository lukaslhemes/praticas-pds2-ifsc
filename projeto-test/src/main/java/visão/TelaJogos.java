package visão;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.jogoDAO;
import modelo.jogo;

public class TelaJogos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		jogoDAO dao = new jogoDAO();
		ArrayList <jogo> Jogo = dao.listar();	
		
			for (jogo jogo: Jogo) {
				
			}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogos frame = new TelaJogos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1982, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
		


}
