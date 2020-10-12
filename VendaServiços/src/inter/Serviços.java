package inter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Serviços extends JPanel {

	/**
	 * Create the panel.
	 */
	public Serviços() {
		setBounds(0, 0, 1100, 621);
		setLayout(null);
		
		JLabel lbl_backser = new JLabel("New label");
		lbl_backser.setIcon(new ImageIcon(Serviços.class.getResource("/inter/Servi\u00E7os.png")));
		lbl_backser.setBounds(0, 0, 1100, 621);
		add(lbl_backser);

	}

}
