package inter;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaPrincipalLogado extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaPrincipalLogado() {
		setBounds(0, 0, 1100, 621);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(0, 0, 1100, 169);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-vindo //NOME// ao Selling Guide.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNewLabel.setBounds(0, 0, 1100, 169);
		panel.add(lblNewLabel);

	}
}
