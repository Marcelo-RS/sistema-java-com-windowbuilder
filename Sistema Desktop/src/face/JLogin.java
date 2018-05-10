package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.UIManager;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastroResponsavel frame = new JCadastroResponsavel();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLogin() {
		super("Tela de Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\login (1).png"));
		setTitle("LOGIN");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBounds(100, 100, 416, 336);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("USU\u00C1RIO:");
		lblUsurio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsurio.setBounds(41, 103, 78, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSenha.setBounds(41, 153, 69, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Insira sua senha");
		passwordField.setBounds(111, 151, 207, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setToolTipText("Insira seu nome de usu\u00E1rio");
		textField.setBounds(111, 101, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogar = new JButton("ENTRAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPrincipal JCH = new JPrincipal();
				JCH.setVisible(true);
				setVisible(false);
			}
		});
		btnLogar.setToolTipText("Acesso ao sistema");
		btnLogar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogar.setBounds(61, 216, 78, 23);
		contentPane.add(btnLogar);
		
		JTextPane txtpnCopyrigthByGrupo = new JTextPane();
		txtpnCopyrigthByGrupo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtpnCopyrigthByGrupo.setBackground(UIManager.getColor("Button.background"));
		txtpnCopyrigthByGrupo.setText("DEVELOPMENTED BY GROUP 3");
		txtpnCopyrigthByGrupo.setBounds(138, 281, 157, 20);
		contentPane.add(txtpnCopyrigthByGrupo);
		
		JButton btnCadastrarse = new JButton("PRIMEIRO ACESSO?");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JCadastroResponsavel JCR = new JCadastroResponsavel();
				JCR.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrarse.setToolTipText("Cadastre-se aqui");
		btnCadastrarse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarse.setBounds(175, 216, 143, 23);
		contentPane.add(btnCadastrarse);
		
		JLabel lblEntreComSeus = new JLabel("ENTRE COM SEUS DADOS");
		lblEntreComSeus.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEntreComSeus.setBounds(96, 36, 219, 16);
		contentPane.add(lblEntreComSeus);
		
		JLabel lblEsqueciMinhaSenha = new JLabel("Esqueci minha senha");
		lblEsqueciMinhaSenha.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblEsqueciMinhaSenha.setBounds(192, 170, 131, 16);
		contentPane.add(lblEsqueciMinhaSenha);
		
		lblEsqueciMinhaSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JOptionPane.showInputDialog(null, "Insira um e-mail para recuperar sua senha");
			}
		});
	}
}
