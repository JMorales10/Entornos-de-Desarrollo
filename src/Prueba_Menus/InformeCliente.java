package Prueba_Menus;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class InformeCliente extends JPanel {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public InformeCliente() {
		setLayout(null);
		
		lblNewLabel = new JLabel("INFORMES DE CLIENTES");
		lblNewLabel.setBounds(161, 46, 175, 56);
		add(lblNewLabel);

	}

}
