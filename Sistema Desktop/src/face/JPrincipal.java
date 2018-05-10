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

public class JPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
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
	public JPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chris\\workspace\\homeicone.png"));
		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 341);
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
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JDadosResponsavel JDados = new JDadosResponsavel();
				setVisible(false);
				JDados.setVisible(true);
			}
		});
		btnBuscar.setBounds(260, 149, 87, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVerificar = new JButton("VERIFICAR");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JVerificarConsumo JVerificar = new JVerificarConsumo();
				setVisible(false);
				JVerificar.setVisible(true);
			}
		});
		btnVerificar.setBounds(436, 149, 103, 23);
		contentPane.add(btnVerificar);
		
		JButton btnAlterar = new JButton("LISTAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JListarEquipamento JListar = new JListarEquipamento();
				setVisible(false);
				JListar.setVisible(true);
			}
		});
		btnAlterar.setBounds(48, 149, 87, 23);
		contentPane.add(btnAlterar);
		btnSair.setBounds(10, 11, 80, 23);
		contentPane.add(btnSair);
		
		JLabel lblAddNEquipamento = new JLabel("LISTA DE  EQUIPAMENTOS");
		lblAddNEquipamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddNEquipamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblAddNEquipamento.setBounds(23, 116, 157, 16);
		contentPane.add(lblAddNEquipamento);
		
		textPane = new JTextPane();
		textPane.setText("DEVELOPMENTED BY GROUP 3");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 8));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(231, 282, 157, 20);
		contentPane.add(textPane);
		
		JLabel lblDadosDoResponsvel = new JLabel("DADOS DO RESPONS\u00C1VEL");
		lblDadosDoResponsvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoResponsvel.setBounds(231, 116, 142, 16);
		contentPane.add(lblDadosDoResponsvel);
		
		JLabel lblVerificarConsumoDe = new JLabel("CONSUMO DE ENERGIA");
		lblVerificarConsumoDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVerificarConsumoDe.setBounds(426, 116, 142, 16);
		contentPane.add(lblVerificarConsumoDe);
		
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
