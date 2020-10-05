package inter;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class HOME extends JPanel {

	/**
	 * Create the panel.
	 */
	public HOME() {
		setBounds(0, 0, 1100, 621);
		setLayout(null);
		
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(22, 326, 727, 10);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(HOME.class.getResource("/inter/HOME.png")));
		lblNewLabel.setBounds(0, 0, 1100, 621);
		add(lblNewLabel);

	}

}
