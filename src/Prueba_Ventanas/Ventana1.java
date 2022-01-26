package Prueba_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBoxPais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(261, 39, 443, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Departamento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(224, 92, 246, 99);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(480, 131, 183, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(256, 187, 272, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(256, 258, 269, 27);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(480, 198, 286, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(480, 261, 286, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR DATOS");
				System.out.println("Código tecleado en Código: "+textField.getText());
				System.out.println("Código tecleado en Nombre: "+textField_1.getText());
				System.out.println("Código tecleado en Dpto: "+textField_2.getText());
				System.out.println("Posición: "+comboBoxPais.getSelectedIndex());
				System.out.println("Contenido: "+comboBoxPais.getSelectedItem()); 
				
				
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(256, 455, 217, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR DATOS");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(559, 455, 207, 36);
		contentPane.add(btnNewButton_1);
		
		comboBoxPais = new JComboBox();
		comboBoxPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1a", "Francia", "Portugal", "Italia"}));
		comboBoxPais.setBounds(480, 314, 196, 27);
		contentPane.add(comboBoxPais);
		
		JLabel lblNewLabel_4 = new JLabel("Seleccione el pa\u00EDs: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(256, 314, 207, 27);
		contentPane.add(lblNewLabel_4);
	}
}
