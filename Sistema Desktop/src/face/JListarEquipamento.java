package face;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class JListarEquipamento extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_8;
	private JTable table_9;
	private JLabel lblTeleviso;
	private JLabel lblGeladeira;
	private JLabel lblVentilador;
	private JTable table_7;
	private JLabel lblLigado;
	private JLabel lblSim;
	private JLabel lblDlink;
	private JLabel lblConsul;
	private JTable table_10;
	private JLabel lblKwt;
	private JLabel lblLimiteDeConsumo;
	private JLabel lblKwh;
	private JLabel lblKwh_1;
	private JTable table_11;
	private JLabel lblConsumo;
	private JLabel lblKwh_2;
	private JLabel lblKwh_3;
	private JLabel lblKwh_4;
	private JTable table_12;
	private JTable table_13;
	private JLabel lblStatus;
	private JLabel lblIrregular;
	private JLabel lblPositivo;
	private JLabel lblMeses;
	private JTextPane textPane;
	private JButton btnVoltar;
	private JLabel lblPesquisar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListarEquipamento frame = new JListarEquipamento();
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
	public JListarEquipamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\icon_texteditor.png"));
		setTitle("LISTAR EQUIPAMENTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLogin JLogin = new JLogin();
				setVisible(false);
				JLogin.setVisible(true);
			}
		});
		
		lblMeses = new JLabel("  6 MESES");
		lblMeses.setBounds(681, 224, 60, 14);
		contentPane.add(lblMeses);
		
		lblPositivo = new JLabel("24 MESES");
		lblPositivo.setBounds(681, 187, 60, 14);
		contentPane.add(lblPositivo);
		
		lblIrregular = new JLabel("12 MESES");
		lblIrregular.setBounds(681, 152, 60, 14);
		contentPane.add(lblIrregular);
		
		table_13 = new JTable();
		table_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_13.setBackground(SystemColor.menu);
		table_13.setBounds(654, 177, 114, 36);
		contentPane.add(table_13);
		
		lblKwh_4 = new JLabel(" 110 VOLTS");
		lblKwh_4.setBounds(562, 224, 68, 14);
		contentPane.add(lblKwh_4);
		
		lblKwh_3 = new JLabel(" 220 VOLTS");
		lblKwh_3.setBounds(562, 187, 82, 14);
		contentPane.add(lblKwh_3);
		
		lblKwh_2 = new JLabel("    110 VOLTS");
		lblKwh_2.setBounds(552, 152, 85, 14);
		contentPane.add(lblKwh_2);
		
		table_11 = new JTable();
		table_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_11.setBackground(SystemColor.menu);
		table_11.setBounds(541, 177, 114, 36);
		contentPane.add(table_11);
		
		lblKwh_1 = new JLabel(" PRETO");
		lblKwh_1.setBounds(461, 226, 46, 14);
		contentPane.add(lblKwh_1);
		
		lblKwh = new JLabel(" PRATA");
		lblKwh.setBounds(461, 152, 46, 14);
		contentPane.add(lblKwh);
		
		lblKwt = new JLabel(" BRANCO");
		lblKwt.setBounds(461, 187, 60, 14);
		contentPane.add(lblKwt);
		
		table_10 = new JTable();
		table_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_10.setBackground(SystemColor.menu);
		table_10.setBounds(428, 177, 114, 36);
		contentPane.add(table_10);
		
		lblConsul = new JLabel(" CONSUL");
		lblConsul.setBounds(350, 187, 58, 14);
		contentPane.add(lblConsul);
		
		lblDlink = new JLabel("  D-LINK");
		lblDlink.setBounds(350, 224, 46, 14);
		contentPane.add(lblDlink);
		
		lblSim = new JLabel(" LG");
		lblSim.setBounds(360, 152, 30, 14);
		contentPane.add(lblSim);
		
		table_7 = new JTable();
		table_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_7.setBackground(SystemColor.menu);
		table_7.setBounds(322, 177, 107, 36);
		contentPane.add(table_7);
		
		lblVentilador = new JLabel("ROTEADOR");
		lblVentilador.setBounds(244, 226, 68, 14);
		contentPane.add(lblVentilador);
		
		lblGeladeira = new JLabel("GELADEIRA");
		lblGeladeira.setBounds(244, 187, 68, 14);
		contentPane.add(lblGeladeira);
		
		lblTeleviso = new JLabel("TELEVIS\u00C3O");
		lblTeleviso.setBounds(244, 153, 68, 14);
		contentPane.add(lblTeleviso);
		
		JButton btnExcluir_1 = new JButton("EXCLUIR");
		btnExcluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro Supostamente Excluído!");
			}
		});
		btnExcluir_1.setBounds(127, 183, 86, 23);
		contentPane.add(btnExcluir_1);
		
		table_8 = new JTable();
		table_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_8.setBackground(SystemColor.menu);
		table_8.setBounds(116, 177, 107, 36);
		contentPane.add(table_8);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro Supostamente Excluído!");
			}
		});
		btnExcluir.setBounds(126, 217, 86, 23);
		contentPane.add(btnExcluir);
		
		JButton button_1 = new JButton("ALTERAR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastroEquipamento JCEALT3 = new JCadastroEquipamento();
				setVisible(false);
				JCEALT3.setVisible(true);
			}
		});
		button_1.setBounds(20, 217, 87, 23);
		contentPane.add(button_1);
		
		JButton button = new JButton("ALTERAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastroEquipamento JCEALT2 = new JCadastroEquipamento();
				setVisible(false);
				JCEALT2.setVisible(true);
			}
		});
		button.setBounds(20, 183, 87, 23);
		contentPane.add(button);
		
		table_6 = new JTable();
		table_6.setBackground(UIManager.getColor("Button.background"));
		table_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_6.setBounds(10, 177, 107, 36);
		contentPane.add(table_6);
		
		JButton button_2 = new JButton("EXCLUIR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro Supostamente Excluído!");
			}
		});
		button_2.setBounds(127, 149, 86, 23);
		contentPane.add(button_2);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastroEquipamento JCEALT1 = new JCadastroEquipamento();
				setVisible(false);
				JCEALT1.setVisible(true);
			}
		});
		btnAlterar.setBounds(20, 149, 87, 23);
		contentPane.add(btnAlterar);
		btnSair.setBounds(108, 11, 86, 23);
		contentPane.add(btnSair);
		
		JLabel lblAddNEquipamento = new JLabel(" ADICIONAR NOVO EQUIPAMENTO");
		lblAddNEquipamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddNEquipamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblAddNEquipamento.setBounds(23, 116, 190, 16);
		contentPane.add(lblAddNEquipamento);
		
		table = new JTable();
		table.setBackground(UIManager.getColor("Button.background"));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 137, 107, 115);
		contentPane.add(table);
		
		table_2 = new JTable();
		table_2.setBackground(UIManager.getColor("Button.background"));
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setBounds(428, 137, 114, 115);
		contentPane.add(table_2);
		
		table_4 = new JTable();
		table_4.setBackground(UIManager.getColor("Button.background"));
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setBounds(322, 137, 107, 115);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBackground(UIManager.getColor("Button.background"));
		table_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_5.setBounds(541, 137, 114, 115);
		contentPane.add(table_5);
		
		JLabel lblEquipamento = new JLabel("EQUIPAMENTO ");
		lblEquipamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipamento.setBounds(235, 117, 93, 14);
		contentPane.add(lblEquipamento);
		
		table_1 = new JTable();
		table_1.setBackground(UIManager.getColor("Button.background"));
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(113, 137, 110, 115);
		contentPane.add(table_1);
		
		table_9 = new JTable();
		table_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_9.setBackground(SystemColor.menu);
		table_9.setBounds(221, 177, 107, 36);
		contentPane.add(table_9);
		
		table_3 = new JTable();
		table_3.setBackground(UIManager.getColor("Button.background"));
		table_3.setForeground(UIManager.getColor("Button.background"));
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setBounds(221, 137, 107, 115);
		contentPane.add(table_3);
		
		lblLigado = new JLabel(" MARCA");
		lblLigado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLigado.setBounds(350, 117, 46, 14);
		contentPane.add(lblLigado);
		
		lblLimiteDeConsumo = new JLabel("   COR");
		lblLimiteDeConsumo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLimiteDeConsumo.setBounds(461, 117, 46, 14);
		contentPane.add(lblLimiteDeConsumo);
		
		lblConsumo = new JLabel("VOLTAGEM");
		lblConsumo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConsumo.setBounds(569, 117, 68, 14);
		contentPane.add(lblConsumo);
		
		table_12 = new JTable();
		table_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_12.setBackground(SystemColor.menu);
		table_12.setBounds(654, 137, 114, 115);
		contentPane.add(table_12);
		
		lblStatus = new JLabel("GARANTIA");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus.setBounds(681, 117, 68, 14);
		contentPane.add(lblStatus);
		
		textPane = new JTextPane();
		textPane.setText("DEVELOPMENTED BY GROUP 3");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 8));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(317, 314, 157, 20);
		contentPane.add(textPane);
		
		btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPrincipal JP = new JPrincipal();
				setVisible(false);
				JP.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 11, 86, 23);
		contentPane.add(btnVoltar);
		
		lblPesquisar = new JLabel("PESQUISAR:");
		lblPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPesquisar.setBounds(497, 15, 80, 14);
		contentPane.add(lblPesquisar);
		
		textField = new JTextField();
		textField.setBounds(572, 12, 196, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblAddNEquipamento.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JCadastroEquipamento JCE = new JCadastroEquipamento();
				setVisible(false);
				JCE.setVisible(true);
			}
		});
	}
}
