import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Color;

public class GUI1 extends JFrame {

	private JPanel contentPane;
	private JTextField TXTNOMBRE;
	private JTextField TXTNUMTEL;
	private JTextField TXTDIREC;
	private JTextField TXTFECHA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI1 frame = new GUI1();
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
	public GUI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fabrica y Distribuidora de Hielo ");
		lblNewLabel.setBounds(119, 11, 410, 30);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblFabricaYDistribuidora = new JLabel("ICECUBE S.A de C.V");
		lblFabricaYDistribuidora.setBounds(119, 39, 410, 30);
		lblFabricaYDistribuidora.setHorizontalAlignment(SwingConstants.CENTER);
		lblFabricaYDistribuidora.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		contentPane.add(lblFabricaYDistribuidora);
		
		JLabel lblNewLabel_1 = new JLabel("Información del solicitante ");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(119, 80, 410, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Nombre completo: ");
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNombre.setBounds(119, 110, 122, 19);
		contentPane.add(lblNombre);
		
		TXTNOMBRE = new JTextField();
		TXTNOMBRE.setBackground(new Color(255, 255, 255));
		TXTNOMBRE.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		TXTNOMBRE.setBounds(129, 140, 308, 22);
		contentPane.add(TXTNOMBRE);
		TXTNOMBRE.setColumns(10);
		
		JLabel lblNmeroDeTelefono = new JLabel("Número de telefono: ");
		lblNmeroDeTelefono.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNmeroDeTelefono.setBounds(119, 173, 182, 19);
		contentPane.add(lblNmeroDeTelefono);
		
		TXTNUMTEL = new JTextField();
		TXTNUMTEL.setBackground(new Color(255, 255, 255));
		TXTNUMTEL.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		TXTNUMTEL.setColumns(10);
		TXTNUMTEL.setBounds(129, 203, 308, 22);
		contentPane.add(TXTNUMTEL);
		
		JLabel lblDireccin = new JLabel("Dirección: ");
		lblDireccin.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblDireccin.setBounds(119, 238, 122, 19);
		contentPane.add(lblDireccin);
		
		TXTDIREC = new JTextField();
		TXTDIREC.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		TXTDIREC.setColumns(10);
		TXTDIREC.setBounds(129, 268, 308, 22);
		contentPane.add(TXTDIREC);
		
		JLabel lblFechaDeEntrega = new JLabel("Fecha de entrega: ");
		lblFechaDeEntrega.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblFechaDeEntrega.setBounds(119, 301, 182, 19);
		contentPane.add(lblFechaDeEntrega);
		
		TXTFECHA = new JTextField();
		TXTFECHA.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		TXTFECHA.setColumns(10);
		TXTFECHA.setBounds(129, 331, 308, 22);
		contentPane.add(TXTFECHA);
		
		JButton btn_LlenarPedido = new JButton("Llenar pedido\r\n");
		btn_LlenarPedido.setForeground(new Color(255, 255, 255));
		btn_LlenarPedido.setBackground(new Color(0, 128, 192));
		btn_LlenarPedido.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btn_LlenarPedido.setBounds(231, 364, 122, 23);
		contentPane.add(btn_LlenarPedido);
	}
}
