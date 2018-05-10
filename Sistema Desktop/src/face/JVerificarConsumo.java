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

public class JVerificarConsumo extends JFrame {

	private JPanel contentPane;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_9;
	private JLabel lblTeleviso;
	private JLabel lblGeladeira;
	private JLabel lblVentilador;
	private JTable table_7;
	private JLabel lblLigado;
	private JLabel lblSim;
	private JLabel lblSim_1;
	private JLabel lblSim_2;
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
	private JLabel lblStatus;
	private JLabel lblIrregular;
	private JLabel lblPositivo;
	private JLabel lblPositivo_1;
	private JTextPane textPane;
	private JButton btnVoltar;
	private JLabel lblPesquisar;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVerificarConsumo frame = new JVerificarConsumo();
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
	public JVerificarConsumo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\icon_texteditor.png"));
		setTitle("VERIFICAR CONSUMO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 373);
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
		
		lblPositivo = new JLabel(" POSITIVO");
		lblPositivo.setBounds(471, 187, 60, 14);
		contentPane.add(lblPositivo);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(SystemColor.menu);
		table.setBounds(448, 177, 113, 36);
		contentPane.add(table);
		
		lblPositivo_1 = new JLabel(" POSITIVO");
		lblPositivo_1.setBounds(471, 224, 60, 14);
		contentPane.add(lblPositivo_1);
		
		lblIrregular = new JLabel(" NEGATIVO");
		lblIrregular.setBounds(471, 152, 79, 14);
		contentPane.add(lblIrregular);
		
		lblKwh_4 = new JLabel(" 11 KWH");
		lblKwh_4.setBounds(364, 224, 60, 14);
		contentPane.add(lblKwh_4);
		
		lblKwh_3 = new JLabel(" 71 KWH");
		lblKwh_3.setBounds(364, 187, 60, 14);
		contentPane.add(lblKwh_3);
		
		lblKwh_2 = new JLabel(" 30 KWH");
		lblKwh_2.setBounds(364, 152, 60, 14);
		contentPane.add(lblKwh_2);
		
		table_11 = new JTable();
		table_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_11.setBackground(SystemColor.menu);
		table_11.setBounds(335, 177, 114, 36);
		contentPane.add(table_11);
		
		lblKwh_1 = new JLabel(" 12 KWH");
		lblKwh_1.setBounds(250, 224, 60, 14);
		contentPane.add(lblKwh_1);
		
		lblKwh = new JLabel(" 22 KWH");
		lblKwh.setBounds(250, 152, 60, 14);
		contentPane.add(lblKwh);
		
		lblKwt = new JLabel(" 80 KWH");
		lblKwt.setBounds(250, 187, 60, 14);
		contentPane.add(lblKwt);
		
		table_10 = new JTable();
		table_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_10.setBackground(SystemColor.menu);
		table_10.setBounds(222, 177, 114, 36);
		contentPane.add(table_10);
		
		lblSim_2 = new JLabel("   SIM");
		lblSim_2.setBounds(145, 187, 46, 14);
		contentPane.add(lblSim_2);
		
		lblSim_1 = new JLabel("   SIM");
		lblSim_1.setBounds(145, 224, 46, 14);
		contentPane.add(lblSim_1);
		
		lblSim = new JLabel("   N\u00C3O");
		lblSim.setBounds(145, 152, 46, 14);
		contentPane.add(lblSim);
		
		table_7 = new JTable();
		table_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_7.setBackground(SystemColor.menu);
		table_7.setBounds(116, 177, 107, 36);
		contentPane.add(table_7);
		
		lblVentilador = new JLabel("  ROTEADOR");
		lblVentilador.setBounds(24, 224, 82, 14);
		contentPane.add(lblVentilador);
		
		lblGeladeira = new JLabel("  GELADEIRA");
		lblGeladeira.setBounds(24, 187, 82, 14);
		contentPane.add(lblGeladeira);
		
		lblTeleviso = new JLabel("  TELEVIS\u00C3O");
		lblTeleviso.setBounds(24, 152, 74, 14);
		contentPane.add(lblTeleviso);
		btnSair.setBounds(119, 11, 86, 23);
		contentPane.add(btnSair);
		
		table_2 = new JTable();
		table_2.setBackground(UIManager.getColor("Button.background"));
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setBounds(222, 137, 114, 115);
		contentPane.add(table_2);
		
		table_4 = new JTable();
		table_4.setBackground(UIManager.getColor("Button.background"));
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setBounds(116, 137, 107, 115);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBackground(UIManager.getColor("Button.background"));
		table_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_5.setBounds(335, 137, 114, 115);
		contentPane.add(table_5);
		
		JLabel lblEquipamento = new JLabel("EQUIPAMENTO");
		lblEquipamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipamento.setBounds(24, 117, 93, 14);
		contentPane.add(lblEquipamento);
		
		table_9 = new JTable();
		table_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_9.setBackground(SystemColor.menu);
		table_9.setBounds(10, 177, 107, 36);
		contentPane.add(table_9);
		
		table_3 = new JTable();
		table_3.setBackground(UIManager.getColor("Button.background"));
		table_3.setForeground(UIManager.getColor("Button.background"));
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setBounds(10, 137, 107, 115);
		contentPane.add(table_3);
		
		lblLigado = new JLabel("LIGADO");
		lblLigado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLigado.setBounds(145, 117, 46, 14);
		contentPane.add(lblLigado);
		
		lblLimiteDeConsumo = new JLabel("LIMITE DE CONSUMO");
		lblLimiteDeConsumo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLimiteDeConsumo.setBounds(222, 117, 114, 14);
		contentPane.add(lblLimiteDeConsumo);
		
		lblConsumo = new JLabel("CONSUMO");
		lblConsumo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConsumo.setBounds(364, 117, 68, 14);
		contentPane.add(lblConsumo);
		
		table_12 = new JTable();
		table_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_12.setBackground(SystemColor.menu);
		table_12.setBounds(447, 137, 114, 115);
		contentPane.add(table_12);
		
		lblStatus = new JLabel("STATUS");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus.setBounds(482, 117, 68, 14);
		contentPane.add(lblStatus);
		
		textPane = new JTextPane();
		textPane.setText("DEVELOPMENTED BY GROUP 3");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 8));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(234, 314, 157, 20);
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
		lblPesquisar.setBounds(308, 15, 74, 14);
		contentPane.add(lblPesquisar);
		
		textField = new JTextField();
		textField.setBounds(383, 12, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
