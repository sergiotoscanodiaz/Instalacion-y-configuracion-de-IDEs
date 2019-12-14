package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Introduccion extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JTextField apellidos;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introduccion frame = new Introduccion();
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
	public Introduccion() {
		setTitle("Ventana de Login");
		setFont(new Font("Verdana", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroducciondeclientes = new JLabel("Introduccion de clientes");
		lblIntroducciondeclientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntroducciondeclientes.setBounds(95, 54, 194, 38);
		contentPane.add(lblIntroducciondeclientes);
		
		JLabel lblIdentificador = new JLabel("Nombre:");
		lblIdentificador.setBounds(61, 113, 67, 13);
		contentPane.add(lblIdentificador);
		
		usuario = new JTextField();
		usuario.setBounds(128, 110, 96, 19);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JLabel labelApellidos = new JLabel("Apellidos:");
		labelApellidos.setBounds(61, 141, 67, 13);
		contentPane.add(labelApellidos);
		
		apellidos = new JTextField();
		apellidos.setColumns(10);
		apellidos.setBounds(128, 135, 96, 19);
		contentPane.add(apellidos);
		
		JLabel lblCorreo = new JLabel("Email:");
		lblCorreo.setBounds(66, 170, 39, 13);
		contentPane.add(lblCorreo);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(128, 164, 96, 19);
		contentPane.add(email);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(128, 229, 85, 21);
		contentPane.add(btnEnviar);
	}
}

