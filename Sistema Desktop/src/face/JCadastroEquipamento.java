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

public class JCadastroEquipamento extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTable table;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastroEquipamento frame = new JCadastroEquipamento();
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
	public JCadastroEquipamento() {
		super("Tela de Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\add-97617_960_720.png"));
		setTitle("CADASTRO DE EQUIPAMENTOS");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBounds(100, 100, 427, 472);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("EQUIPAMENTO:");
		lblUsurio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsurio.setBounds(41, 100, 102, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("MARCA:");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSenha.setBounds(41, 152, 68, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Insira sua senha");
		passwordField.setBounds(153, 150, 207, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setToolTipText("Insira seu nome de usu\u00E1rio");
		textField.setBounds(153, 98, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogar = new JButton("SALVAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListarEquipamento JLE = new JListarEquipamento();
				setVisible(false);
				JLE.setVisible(true);
			}
		});
		btnLogar.setToolTipText("");
		btnLogar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogar.setBounds(72, 355, 100, 23);
		contentPane.add(btnLogar);
		
		JTextPane txtpnCopyrigthByGrupo = new JTextPane();
		txtpnCopyrigthByGrupo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtpnCopyrigthByGrupo.setBackground(UIManager.getColor("Button.background"));
		txtpnCopyrigthByGrupo.setText("DEVELOPMENTED BY GROUP 3");
		txtpnCopyrigthByGrupo.setBounds(143, 416, 157, 20);
		contentPane.add(txtpnCopyrigthByGrupo);
		
		JButton btnCadastrarse = new JButton("CANCELAR");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListarEquipamento JLE = new JListarEquipamento();
				setVisible(false);
				JLE.setVisible(true);
			}
		});
		btnCadastrarse.setToolTipText("");
		btnCadastrarse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarse.setBounds(246, 355, 100, 23);
		contentPane.add(btnCadastrarse);
		
		JLabel lblEntreComSeus = new JLabel("CADASTRO DE EQUIPAMENTOS");
		lblEntreComSeus.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEntreComSeus.setBounds(67, 35, 279, 16);
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
		
		JLabel lblTelefone = new JLabel("GARANTIA:");
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTelefone.setBounds(40, 255, 81, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSobrenome = new JLabel("COR:");
		lblSobrenome.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSobrenome.setBounds(41, 203, 55, 14);
		contentPane.add(lblSobrenome);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("Insira sua senha");
		passwordField_1.setBounds(153, 201, 207, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setToolTipText("Insira sua senha");
		passwordField_2.setBounds(153, 253, 207, 20);
		contentPane.add(passwordField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "110 VOLTS", "220 VOLTS"}));
		comboBox.setBounds(153, 304, 88, 19);
		contentPane.add(comboBox);
		
		JLabel lblUf = new JLabel("VOLTAGEM:");
		lblUf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUf.setBounds(41, 305, 88, 14);
		contentPane.add(lblUf);
	}
}
