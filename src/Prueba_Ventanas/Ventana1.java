package Prueba_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/*import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;*/
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoDepartamento;
	private JTextField textNombreDepartamento;
	private JTextField textLocalidadDepartamento;
	private JButton btnNewButton;
	private JComboBox comboBoxPais;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPersonal;
	private JRadioButton rdbtnAdministracion;
	private JRadioButton rdbtnInformatica;
	private JRadioButton rdbtnContabilidad;
	private JCheckBox chckbxCheckBoxInforme;

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
		setBounds(100, 100, 1236, 892);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(321, 95, 361, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(213, 191, 210, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(213, 272, 210, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(213, 355, 230, 19);
		contentPane.add(lblNewLabel_3);
		
		textCodigoDepartamento = new JTextField();
		textCodigoDepartamento.setHorizontalAlignment(SwingConstants.CENTER);
		textCodigoDepartamento.setBounds(477, 195, 154, 27);
		contentPane.add(textCodigoDepartamento);
		textCodigoDepartamento.setColumns(10);
		
		textNombreDepartamento = new JTextField();
		textNombreDepartamento.setBounds(477, 272, 322, 27);
		contentPane.add(textNombreDepartamento);
		textNombreDepartamento.setColumns(10);
		
		textLocalidadDepartamento = new JTextField();
		textLocalidadDepartamento.setBounds(477, 355, 322, 27);
		contentPane.add(textLocalidadDepartamento);
		textLocalidadDepartamento.setColumns(10);
		
		btnNewButton = new JButton("Insertar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Código tecleado en Código: " + textCodigoDepartamento.getText());
				System.out.println("Código tecleado en Nombre: " + textNombreDepartamento.getText());
				System.out.println("Código tecleado en Localidad: " + textLocalidadDepartamento.getText());
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR DATOS. ");
				System.out.println("Posición: " + comboBoxPais.getSelectedIndex());
				System.out.println("Contenido: " + comboBoxPais.getSelectedItem());
				textArea.setText("");
				textArea.setText("Primera línea.");//asigno contenido al textarea
				textArea.append("\nSegunda línea");
				textArea.append("\nTercera línea");
				ButtonModel personal=rdbtnPersonal.getModel();
				ButtonModel admin= rdbtnAdministracion.getModel();
				ButtonModel inform= rdbtnInformatica.getModel();
				ButtonModel contab= rdbtnContabilidad.getModel();
				if(buttonGroup.getSelection()!=null)
				{
					if (buttonGroup.getSelection().equals(personal))
						System.out.println("Has pulsado Personal. ");
					if (buttonGroup.getSelection().equals(admin))
						System.out.println("Has pulsado Administración. ");
					if (buttonGroup.getSelection().equals(inform))
						System.out.println("Has pulsado Informática. ");
					if (buttonGroup.getSelection().equals(contab))
						System.out.println("Has pulsado Contabilidad. ");
				}
				
				if (chckbxCheckBoxInforme.isSelected())
				{
				System.out.println("Check pulsado. " + chckbxCheckBoxInforme.getText());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(247, 473, 196, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCodigoDepartamento.setText("");
				textNombreDepartamento.setText("");
				textLocalidadDepartamento.setText("");
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR DATOS. ");
			}
		});
		btnNewButton_1.setBounds(477, 473, 196, 39);
		contentPane.add(btnNewButton_1);
		
		comboBoxPais = new JComboBox();
		comboBoxPais.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxPais.setBackground(Color.LIGHT_GRAY);
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Portugal", "Italia"}));
		comboBoxPais.setBounds(477, 405, 154, 32);
		contentPane.add(comboBoxPais);
		
		JLabel lblNewLabel_4 = new JLabel("Seleccione el país: ");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(213, 410, 210, 19);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(167, 674, 737, 161);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		rdbtnPersonal = new JRadioButton("Personal");
		buttonGroup.add(rdbtnPersonal);
		rdbtnPersonal.setBounds(902, 80, 103, 21);
		contentPane.add(rdbtnPersonal);
		
		rdbtnAdministracion = new JRadioButton("Administracion");
		buttonGroup.add(rdbtnAdministracion);
		rdbtnAdministracion.setBounds(902, 116, 103, 21);
		contentPane.add(rdbtnAdministracion);
		
		rdbtnContabilidad = new JRadioButton("Contabilidad");
		buttonGroup.add(rdbtnContabilidad);
		rdbtnContabilidad.setBounds(902, 181, 103, 21);
		contentPane.add(rdbtnContabilidad);
		
		rdbtnInformatica = new JRadioButton("Informatica");
		buttonGroup.add(rdbtnInformatica);
		rdbtnInformatica.setBounds(902, 147, 103, 21);
		contentPane.add(rdbtnInformatica);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo de Departamento:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(885, 46, 132, 13);
		contentPane.add(lblNewLabel_5);
		
		chckbxCheckBoxInforme = new JCheckBox("Informe");
		chckbxCheckBoxInforme.setBounds(885, 237, 93, 21);
		contentPane.add(chckbxCheckBoxInforme);
		
		JButton btnNewButton_2 = new JButton("Insertar Oficina");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Dialogo1 dialog = new Dialogo1();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(338, 555, 293, 39);
		contentPane.add(btnNewButton_2);


		
		
	}
}