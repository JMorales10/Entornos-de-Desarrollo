package ExamenVentana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton Primero_1;
	private JRadioButton Segundo_1;
	private JRadioButton Practicas_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("VENTANA PRINCIPAL");
		setFont(new Font("Tahoma", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 824);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERTAR ALUMNOS INFORM\u00C1TICA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(213, 41, 346, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(300, 133, 237, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(152, 127, 138, 26);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 192, 237, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(152, 186, 138, 26);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(300, 250, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Edad:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(152, 244, 138, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Curso: ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(86, 320, 96, 26);
		contentPane.add(lblNewLabel_4);
		
		Primero_1 = new JRadioButton("Primero");
		buttonGroup.add(Primero_1);
		Primero_1.setHorizontalAlignment(SwingConstants.CENTER);
		Primero_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Primero_1.setBounds(152, 350, 103, 21);
		contentPane.add(Primero_1);
		
		Segundo_1 = new JRadioButton("Segundo");
		buttonGroup.add(Segundo_1);
		Segundo_1.setHorizontalAlignment(SwingConstants.CENTER);
		Segundo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Segundo_1.setBounds(152, 386, 103, 21);
		contentPane.add(Segundo_1);
		
		Practicas_1 = new JRadioButton("Pr\u00E1cticas");
		buttonGroup.add(Practicas_1);
		Practicas_1.setHorizontalAlignment(SwingConstants.CENTER);
		Practicas_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Practicas_1.setBounds(152, 421, 103, 21);
		contentPane.add(Practicas_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(152, 503, 516, 274);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Mostrar informaci\u00F3n seleccionada");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textField.getText() + "\n");
				textArea.append(textField_1.getText() + "\n");
				textArea.append(textField_2.getText() + "\n");
				ButtonModel Primero = Primero_1.getModel();
				ButtonModel Segundo = Segundo_1.getModel();
				ButtonModel Practicas = Practicas_1.getModel();
				
				if(buttonGroup.getSelection()!=null)
				{
					if (buttonGroup.getSelection().equals(Primero))
						textArea.append("Primero");
					if (buttonGroup.getSelection().equals(Segundo))
						textArea.append("Segundo");
					if (buttonGroup.getSelection().equals(Practicas))
						textArea.append("Prácticas");
				}
			}
		});
		btnNewButton.setBounds(412, 345, 303, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar informaci\u00F3n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textArea.setText("");
				
			}
		});
		btnNewButton_1.setBounds(412, 397, 303, 31);
		contentPane.add(btnNewButton_1);
	}
}
