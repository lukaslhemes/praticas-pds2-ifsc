package visão;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.jogoDAO;
import modelo.jogo;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(329, 47, 339, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID jogo");
		lblNewLabel.setBounds(10, 11, 65, 27);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 11, 244, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(1040, 47, 339, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 11, 244, 27);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nome_jogo");
		lblNewLabel_1.setBounds(10, 11, 65, 27);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(327, 155, 1537, 854);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton bntCadastrar = new JButton("Cadastrar");
		bntCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bntCadastrar.setBounds(37, 155, 243, 49);
		contentPane.add(bntCadastrar);
		
		JButton bntAlterar = new JButton("Alterar");
		bntAlterar.setBounds(37, 233, 243, 49);
		contentPane.add(bntAlterar);
		
		JButton bntExcluir = new JButton("Excluir");
		bntExcluir.setBounds(37, 302, 243, 49);
		contentPane.add(bntExcluir);
	}
}
