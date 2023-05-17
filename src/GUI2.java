import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GUI2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
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
	public GUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fabrica y Distribuidora de Hielo ");
		lblNewLabel.setBounds(73, 22, 410, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblFabricaYDistribuidora = new JLabel("ICECUBE S.A de C.V");
		lblFabricaYDistribuidora.setBounds(73, 50, 410, 30);
		lblFabricaYDistribuidora.setHorizontalAlignment(SwingConstants.CENTER);
		lblFabricaYDistribuidora.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		contentPane.add(lblFabricaYDistribuidora);
		
		JLabel lblNewLabel_1 = new JLabel("Información del pedido ");
		lblNewLabel_1.setBounds(73, 91, 410, 19);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lbl1 = new JLabel("Número de bolsas: ");
		lbl1.setBounds(183, 132, 122, 19);
		lbl1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Medida de la bolsa");
		lbl2.setBounds(183, 211, 182, 19);
		lbl2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		contentPane.add(lbl2);
		
		JComboBox comboBox_bolsas = new JComboBox();
		comboBox_bolsas.setBounds(193, 158, 154, 30);
		contentPane.add(comboBox_bolsas);
		
		JComboBox comboBox_kg = new JComboBox();
		comboBox_kg.setBounds(193, 240, 154, 30);
		contentPane.add(comboBox_kg);
		
		JButton btn_Insertar = new JButton("Insertar");
		btn_Insertar.setForeground(Color.WHITE);
		btn_Insertar.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btn_Insertar.setBackground(new Color(0, 128, 192));
		btn_Insertar.setBounds(29, 286, 94, 23);
		contentPane.add(btn_Insertar);
		
		JButton btn_Actualizar = new JButton("Actualizar");
		btn_Actualizar.setForeground(Color.WHITE);
		btn_Actualizar.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btn_Actualizar.setBackground(new Color(0, 128, 192));
		btn_Actualizar.setBounds(222, 287, 94, 23);
		contentPane.add(btn_Actualizar);
		
		JButton btn_Eliminar = new JButton("Eliminar");
		btn_Eliminar.setForeground(Color.WHITE);
		btn_Eliminar.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btn_Eliminar.setBackground(new Color(0, 128, 192));
		btn_Eliminar.setBounds(404, 287, 94, 23);
		contentPane.add(btn_Eliminar);
	}
}
