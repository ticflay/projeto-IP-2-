package inter;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class FUNCIONARIOS extends JPanel {

	/**
	 * Create the panel.
	 */
   
    


	public FUNCIONARIOS() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1100, 621);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1100, 90);
		panel.setBackground(new Color(219, 112, 147));
		add(panel);
		panel.setLayout(null);
		
		JLabel lbl_S = new JLabel("S");
		lbl_S.setFont(new Font("Adobe Devanagari", Font.BOLD, 99));
		lbl_S.setBounds(10, -32, 104, 122);
		panel.add(lbl_S);
		
		JLabel lbl_G = new JLabel("G");
		lbl_G.setFont(new Font("Adobe Devanagari", Font.BOLD, 88));
		lbl_G.setBounds(48, -17, 146, 107);
		panel.add(lbl_G);
		
		JButton btnNewButton = new JButton("Adicionar Funcion\u00E1rio");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(452, 21, 321, 34);
		panel.add(btnNewButton);
		
		
		

	}
}
