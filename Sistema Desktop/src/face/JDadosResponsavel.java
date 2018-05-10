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

public class JDadosResponsavel extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDadosResponsavel frame = new JDadosResponsavel();
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
	public JDadosResponsavel() {
		super("Tela de Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\cadastro.png"));
		setTitle("DADOS DO RESPONS\u00C1VEL");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBounds(100, 100, 805, 443);
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
		
		JButton btnLogar = new JButton("VOLTAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPrincipal JVoltar = new JPrincipal();
				setVisible(false);
				JVoltar.setVisible(true);
			}
		});
		btnLogar.setToolTipText("");
		btnLogar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogar.setBounds(10, 11, 81, 23);
		contentPane.add(btnLogar);
		
		JTextPane txtpnCopyrigthByGrupo = new JTextPane();
		txtpnCopyrigthByGrupo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtpnCopyrigthByGrupo.setBackground(UIManager.getColor("Button.background"));
		txtpnCopyrigthByGrupo.setText("DEVELOPMENTED BY GROUP 3");
		txtpnCopyrigthByGrupo.setBounds(331, 385, 157, 20);
		contentPane.add(txtpnCopyrigthByGrupo);
		
		JButton btnCadastrarse = new JButton("SAIR");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLogin JLogin = new JLogin();
				setVisible(false);
				JLogin.setVisible(true);
			}
		});
		btnCadastrarse.setToolTipText("");
		btnCadastrarse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarse.setBounds(101, 11, 100, 23);
		contentPane.add(btnCadastrarse);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"RJ", "SP", "MG", "ES", "RS", "GO", "PR"}));
		comboBox.setBounds(718, 131, 46, 19);
		contentPane.add(comboBox);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCep.setBounds(396, 277, 38, 14);
		contentPane.add(lblCep);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEndereo.setBounds(536, 84, 88, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUf.setBounds(692, 132, 38, 14);
		contentPane.add(lblUf);
		
		JLabel label = new JLabel("123.456.789-00");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBackground(Color.WHITE);
		label.setBounds(137, 132, 121, 14);
		contentPane.add(label);
		
		JLabel lblDerick = new JLabel("DERICK");
		lblDerick.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDerick.setBackground(Color.WHITE);
		lblDerick.setBounds(137, 179, 121, 14);
		contentPane.add(lblDerick);
		
		JLabel lblNolan = new JLabel("NOLAN CARTHER");
		lblNolan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNolan.setBackground(Color.WHITE);
		lblNolan.setBounds(137, 229, 121, 14);
		contentPane.add(lblNolan);
		
		JLabel label_1 = new JLabel("219978-5632");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(137, 277, 121, 14);
		contentPane.add(label_1);
		
		JLabel lblCarlosGulart = new JLabel("CARLOS GULART ");
		lblCarlosGulart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCarlosGulart.setBackground(Color.WHITE);
		lblCarlosGulart.setBounds(459, 132, 121, 14);
		contentPane.add(lblCarlosGulart);
		
		JLabel lblBalaNaCabea = new JLabel("DUQUE DE CAXIAS");
		lblBalaNaCabea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBalaNaCabea.setBackground(Color.WHITE);
		lblBalaNaCabea.setBounds(459, 179, 134, 14);
		contentPane.add(lblBalaNaCabea);
		
		JLabel lblRioDeJaneiro = new JLabel("RIO DE JANEIRO");
		lblRioDeJaneiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRioDeJaneiro.setBackground(Color.WHITE);
		lblRioDeJaneiro.setBounds(459, 229, 121, 14);
		contentPane.add(lblRioDeJaneiro);
		
		JLabel label_2 = new JLabel("3045-120");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(459, 276, 121, 14);
		contentPane.add(label_2);
	}
}
