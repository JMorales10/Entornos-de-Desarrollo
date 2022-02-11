package Prueba_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnNewButton;
	private JTextField textNombre;
	private JTextField textPrecio;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setTitle("Gestión de productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 944);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" ENTRADA DE DATOS DE PRODUCTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(241, 31, 339, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del producto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(102, 122, 167, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio del producto:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(102, 193, 126, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo producto:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(128, 277, 126, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(112, 360, 126, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("IVA:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(122, 478, 54, 13);
		contentPane.add(lblNewLabel_5);
		
		textNombre = new JTextField();
		textNombre.setBounds(279, 121, 291, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(279, 192, 291, 19);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setBackground(Color.LIGHT_GRAY);
		comboBoxTipo.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Nacional", "Importado", "Anual", "De temporada"}));
		comboBoxTipo.setBounds(329, 273, 179, 21);
		contentPane.add(comboBoxTipo);
		
		JRadioButton rdbtnExtra = new JRadioButton("Extra-Premium");
		buttonGroup.add(rdbtnExtra);
		rdbtnExtra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnExtra.setForeground(Color.BLUE);
		rdbtnExtra.setBounds(279, 356, 126, 21);
		contentPane.add(rdbtnExtra);
		
		JRadioButton rdbtnPremium = new JRadioButton("Premium");
		buttonGroup.add(rdbtnPremium);
		rdbtnPremium.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPremium.setForeground(Color.BLUE);
		rdbtnPremium.setBounds(445, 356, 103, 21);
		contentPane.add(rdbtnPremium);
		
		JRadioButton rdbtnPrimera = new JRadioButton("Primera");
		buttonGroup.add(rdbtnPrimera);
		rdbtnPrimera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPrimera.setForeground(Color.BLUE);
		rdbtnPrimera.setBounds(279, 415, 103, 21);
		contentPane.add(rdbtnPrimera);
		
		JRadioButton rdbtnSegunda = new JRadioButton("Segunda");
		buttonGroup.add(rdbtnSegunda);
		rdbtnSegunda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSegunda.setForeground(Color.BLUE);
		rdbtnSegunda.setBounds(445, 415, 103, 21);
		contentPane.add(rdbtnSegunda);
		
		JRadioButton rdbtnCuatro = new JRadioButton("4%");
		buttonGroup_1.add(rdbtnCuatro);
		rdbtnCuatro.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnCuatro.setBounds(197, 474, 103, 21);
		contentPane.add(rdbtnCuatro);
		
		JRadioButton rdbtnDiez = new JRadioButton("10%");
		buttonGroup_1.add(rdbtnDiez);
		rdbtnDiez.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnDiez.setBounds(302, 474, 103, 21);
		contentPane.add(rdbtnDiez);
		
		JRadioButton rdbtnVeintiuno = new JRadioButton("21%");
		buttonGroup_1.add(rdbtnVeintiuno);
		rdbtnVeintiuno.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVeintiuno.setBounds(420, 474, 103, 21);
		contentPane.add(rdbtnVeintiuno);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aplicar tasa");
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		chckbxNewCheckBox.setBounds(525, 474, 121, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Ver datos tecleados ");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(102, 537, 240, 32);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("");
				textArea.append(textNombre.getText());
				textArea.append(textPrecio.getText());
				
				
				ButtonModel extra =rdbtnExtra.getModel();
				ButtonModel premium= rdbtnPremium.getModel();
				ButtonModel primera = rdbtnPrimera.getModel();
				ButtonModel segunda = rdbtnSegunda.getModel();
				
				ButtonModel cuatro =rdbtnCuatro.getModel();
				ButtonModel diez= rdbtnDiez.getModel();
				ButtonModel veintiuno = rdbtnVeintiuno.getModel();
				
				
				
				if(buttonGroup.getSelection()!=null)
				{
					if (buttonGroup.getSelection().equals(extra))
						textArea.append("\nSe ha pulsado Extra-Premium");
					if (buttonGroup.getSelection().equals(premium))
						textArea.append("\nSe ha pulsado Premium");
					if (buttonGroup.getSelection().equals(primera))
						textArea.append("\nSe ha pulsado Primera");
					if (buttonGroup.getSelection().equals(segunda))
						textArea.append("\nSe ha pulsado Segunda");
				}
				
				if(buttonGroup_1.getSelection()!=null)
				{
					if (buttonGroup_1.getSelection().equals(cuatro))
						textArea.append("\nSe ha escogido el 4%");
					if (buttonGroup_1.getSelection().equals(diez))
						textArea.append("\nSe ha escogido 10%");
					if (buttonGroup_1.getSelection().equals(veintiuno))
						textArea.append("\nSe ha escogido 21%");
					
				}
				
				if (chckbxNewCheckBox.isSelected())
				{
					textArea.append("\nSe ha seleccionado Aplicar tasa");
				}
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Limpiar datos");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(400, 537, 215, 32);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 620, 615, 204);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textNombre.setText("");
				textPrecio.setText("");
				
			}
		});
	}
}
