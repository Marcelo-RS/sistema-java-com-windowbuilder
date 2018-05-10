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
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JCadastroResponsavel extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTable table;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
	public JCadastroResponsavel() {
		super("Tela de Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\cadastro.png"));
		setTitle("CADASTRO DO RESPONS\u00C1VEL");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBounds(100, 100, 805, 455);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("CPF:");
		lblUsurio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsurio.setBounds(41, 133, 38, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("NOME:");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSenha.setBounds(41, 180, 55, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(137, 177, 207, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(137, 130, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogar = new JButton("SALVAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLogin JLogin = new JLogin();
				setVisible(false);
				JLogin.setVisible(true);
			}
		});
		btnLogar.setToolTipText("");
		btnLogar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogar.setBounds(248, 338, 81, 23);
		contentPane.add(btnLogar);
		
		JTextPane txtpnCopyrigthByGrupo = new JTextPane();
		txtpnCopyrigthByGrupo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtpnCopyrigthByGrupo.setBackground(UIManager.getColor("Button.background"));
		txtpnCopyrigthByGrupo.setText("DEVELOPMENTED BY GROUP 3");
		txtpnCopyrigthByGrupo.setBounds(331, 396, 157, 20);
		contentPane.add(txtpnCopyrigthByGrupo);
		
		JButton btnCadastrarse = new JButton("CANCELAR");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLogin JLogin = new JLogin();
				setVisible(false);
				JLogin.setVisible(true);
			}
		});
		btnCadastrarse.setToolTipText("");
		btnCadastrarse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarse.setBounds(427, 338, 100, 23);
		contentPane.add(btnCadastrarse);
		
		JLabel lblEntreComSeus = new JLabel("INFORMA\u00C7\u00D5ES PARA CADASTRO DO RESPONS\u00C1VEL");
		lblEntreComSeus.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEntreComSeus.setBounds(190, 32, 444, 16);
		contentPane.add(lblEntreComSeus);
		
		table = new JTable();
		table.setBounds(95, 163, 88, -41);
		contentPane.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(396, 230, 38, -111);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(UIManager.getColor("Button.focus"));
		separator_1.setForeground(UIManager.getColor("Button.foreground"));
		separator_1.setBounds(479, 201, -129, -41);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(387, 201, -16, -41);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(374, 84, 10, 248);
		contentPane.add(separator_3);
		
		JLabel lblDadosPrincipais = new JLabel("DADOS PRINCIPAIS");
		lblDadosPrincipais.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDadosPrincipais.setBounds(124, 84, 134, 14);
		contentPane.add(lblDadosPrincipais);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTelefone.setBounds(41, 278, 81, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSobrenome = new JLabel("SOBRENOME:");
		lblSobrenome.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSobrenome.setBounds(41, 230, 100, 14);
		contentPane.add(lblSobrenome);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setBounds(137, 227, 207, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setToolTipText("");
		passwordField_2.setBounds(137, 275, 207, 20);
		contentPane.add(passwordField_2);
		
		JLabel lblRua = new JLabel("RUA:");
		lblRua.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRua.setBounds(396, 133, 38, 14);
		contentPane.add(lblRua);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBairro.setBounds(396, 180, 53, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCidade.setBounds(396, 230, 60, 14);
		contentPane.add(lblCidade);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(459, 130, 207, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(458, 177, 207, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(458, 227, 207, 20);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "RJ", "SP", "MG", "ES", "RS", "GO", "PR"}));
		comboBox.setBounds(718, 131, 46, 19);
		contentPane.add(comboBox);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCep.setBounds(396, 277, 38, 14);
		contentPane.add(lblCep);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(10);
		textField_4.setBounds(459, 275, 207, 20);
		contentPane.add(textField_4);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEndereo.setBounds(536, 84, 88, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUf.setBounds(692, 132, 38, 14);
		contentPane.add(lblUf);
	}
}
