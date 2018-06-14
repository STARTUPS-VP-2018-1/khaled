package br.com.khaled.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.khaled.dominio.Tabacaria;
import br.com.khaled.repositorio.dao.TabacariaDAO;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InterfaceTabacariaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JLabel lblEndereo;
	private JLabel lblTelefone;
	private JTextField txtBairro;
	private JLabel lblBairro;
	private JTextField txtTelefone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField txtUf;
	private JLabel lblUf;
	private JTextField txtCidade;
	private JLabel lblCidade;
	private JLabel lblCadastroDeTabacaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceTabacariaCadastro frame = new InterfaceTabacariaCadastro();
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
	public InterfaceTabacariaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(15, 68, 113, 14);
		
		txtNome = new JTextField();
		txtNome.setBounds(15, 88, 127, 20);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(15, 144, 126, 20);
		txtEndereco.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(403, 194, 27, 0);
		
		lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereo.setBounds(15, 124, 127, 14);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(268, 124, 127, 14);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(268, 88, 127, 20);
		txtBairro.setColumns(10);
		
		lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBairro.setBounds(268, 68, 127, 14);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(269, 144, 126, 20);
		txtTelefone.setColumns(10);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(121, 306, 104, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tabacaria tabacaria = new Tabacaria();
				tabacaria.setNome(txtNome.getText());
				tabacaria.setTelefone(txtTelefone.getText());
				tabacaria.setBairro(txtBairro.getText());
				tabacaria.setUF(txtUf.getText());
				tabacaria.setEndereço(txtEndereco.getText());
				if((txtNome.getText().isEmpty()) || (txtEndereco.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}else {
					TabacariaDAO dao = new TabacariaDAO();
					dao.adiciona(tabacaria);
					JOptionPane.showMessageDialog(null, "Tabacaria cadastrado com sucesso!!!");
					txtNome.setText(null);
					txtTelefone.setText(null);
					txtBairro.setText(null);
					txtEndereco.setText(null);
					txtUf.setText(null);
					txtCidade.setText(null);
				}
			}
		});
		
		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(231, 306, 81, 23);
		contentPane.setLayout(null);
		contentPane.add(txtNome);
		contentPane.add(txtEndereco);
		contentPane.add(lblEndereo);
		contentPane.add(label);
		contentPane.add(lblBairro);
		contentPane.add(txtBairro);
		contentPane.add(txtTelefone);
		contentPane.add(lblTelefone);
		contentPane.add(lblNome);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		txtUf.setBounds(269, 211, 126, 20);
		contentPane.add(txtUf);
		
		lblUf = new JLabel("UF\r\n");
		lblUf.setHorizontalAlignment(SwingConstants.CENTER);
		lblUf.setBounds(268, 191, 125, 14);
		contentPane.add(lblUf);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(15, 211, 126, 20);
		contentPane.add(txtCidade);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setBounds(15, 191, 127, 14);
		contentPane.add(lblCidade);
		
		lblCadastroDeTabacaria = new JLabel("Cadastro de Tabacaria");
		lblCadastroDeTabacaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeTabacaria.setBounds(10, 21, 414, 14);
		contentPane.add(lblCadastroDeTabacaria);
	}
}
