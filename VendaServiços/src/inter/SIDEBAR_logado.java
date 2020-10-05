package inter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SIDEBAR_logado extends JPanel {

	/**
	 * Create the panel.
	 */
	private JPanel panel_FUNC;
	private JLabel lbl_FUNC;
	private JPanel panel_PROD;
	private JLabel lbl_PROD;
	private JPanel panel_SERV;
	private JLabel lbl_SERV;
	private JPanel panel_VENDA;
	private JLabel lbl_VENDA;
	private JPanel panel_HIST;
	private JLabel lbl_HIST;
	public SIDEBAR_logado() {
		
		setBounds(0, 0, 278, 621);
		setForeground(new Color(0, 153, 153));
		setBackground(new Color(219, 112, 147));
		setLayout(null);
		
		JLabel lbl_G = new JLabel("G");
		lbl_G.setFont(new Font("Adobe Devanagari", Font.BOLD, 88));
		lbl_G.setBounds(85, 24, 146, 107);
		add(lbl_G);
		
		JLabel lbl_S = new JLabel("S");
		lbl_S.setFont(new Font("Adobe Devanagari", Font.BOLD, 99));
		lbl_S.setBounds(51, 11, 104, 122);
		add(lbl_S);
		
		JLabel lbl_Sell = new JLabel("Selling\r\n");
		lbl_Sell.setFont(new Font("Sitka Display", Font.BOLD, 25));
		lbl_Sell.setBounds(140, 61, 104, 52);
		add(lbl_Sell);
		
		JLabel lbl_Gui = new JLabel("Guide");
		lbl_Gui.setFont(new Font("Sitka Display", Font.BOLD, 25));
		lbl_Gui.setBounds(140, 83, 104, 52);
		add(lbl_Gui);
		
		panel_FUNC = new JPanel();
	
		panel_FUNC.setBackground(new Color(219, 112, 147));
		panel_FUNC.setBounds(0, 167, 278, 52);
		add(panel_FUNC);
		panel_FUNC.setLayout(null);
		
		lbl_FUNC = new JLabel("FUNCION\u00C1RIOS");
		lbl_FUNC.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_FUNC.setBounds(41, 0, 187, 52);
		panel_FUNC.add(lbl_FUNC);
		
		panel_PROD = new JPanel();
		panel_PROD.setLayout(null);
		panel_PROD.setBackground(new Color(219, 112, 147));
		panel_PROD.setBounds(0, 240, 278, 52);
		add(panel_PROD);
		
		lbl_PROD = new JLabel("PRODUTOS");
		lbl_PROD.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_PROD.setBounds(59, 0, 187, 52);
		panel_PROD.add(lbl_PROD);
		
		panel_SERV = new JPanel();
		panel_SERV.setLayout(null);
		panel_SERV.setBackground(new Color(219, 112, 147));
		panel_SERV.setBounds(0, 318, 278, 52);
		add(panel_SERV);
		
		lbl_SERV = new JLabel("SERVI\u00C7OS");
		lbl_SERV.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_SERV.setBounds(66, 0, 187, 52);
		panel_SERV.add(lbl_SERV);
		
		panel_VENDA = new JPanel();
		panel_VENDA.setLayout(null);
		panel_VENDA.setBackground(new Color(219, 112, 147));
		panel_VENDA.setBounds(0, 392, 278, 52);
		add(panel_VENDA);
		
	    lbl_VENDA = new JLabel("VENDER");
		lbl_VENDA.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_VENDA.setBounds(81, 0, 187, 52);
		panel_VENDA.add(lbl_VENDA);
		
		panel_HIST = new JPanel();
		panel_HIST.setLayout(null);
		panel_HIST.setBackground(new Color(219, 112, 147));
		panel_HIST.setBounds(0, 474, 278, 52);
		add(panel_HIST);
		
		lbl_HIST = new JLabel("HIST\u00D3RICO DE VENDAS");
		lbl_HIST.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_HIST.setBounds(10, 0, 278, 52);
		panel_HIST.add(lbl_HIST);

	}
	public JPanel getPanel_FUNC() {
		return panel_FUNC;
	}
	public void setPanel_FUNC(JPanel panel_FUNC) {
		this.panel_FUNC = panel_FUNC;
	}
	public JLabel getLbl_FUNC() {
		return lbl_FUNC;
	}
	public void setLbl_FUNC(JLabel lbl_FUNC) {
		this.lbl_FUNC = lbl_FUNC;
	}
	public JPanel getPanel_PROD() {
		return panel_PROD;
	}
	public void setPanel_PROD(JPanel panel_PROD) {
		this.panel_PROD = panel_PROD;
	}
	public JLabel getLbl_PROD() {
		return lbl_PROD;
	}
	public void setLbl_PROD(JLabel lbl_PROD) {
		this.lbl_PROD = lbl_PROD;
	}
	public JPanel getPanel_SERV() {
		return panel_SERV;
	}
	public void setPanel_SERV(JPanel panel_SERV) {
		this.panel_SERV = panel_SERV;
	}
	public JLabel getLbl_SERV() {
		return lbl_SERV;
	}
	public void setLbl_SERV(JLabel lbl_SERV) {
		this.lbl_SERV = lbl_SERV;
	}
	public JPanel getPanel_VENDA() {
		return panel_VENDA;
	}
	public void setPanel_VENDA(JPanel panel_VENDA) {
		this.panel_VENDA = panel_VENDA;
	}
	public JLabel getLbl_VENDA() {
		return lbl_VENDA;
	}
	public void setLbl_VENDA(JLabel lbl_VENDA) {
		this.lbl_VENDA = lbl_VENDA;
	}
	public JPanel getPanel_HIST() {
		return panel_HIST;
	}
	public void setPanel_HIST(JPanel panel_HIST) {
		this.panel_HIST = panel_HIST;
	}
	public JLabel getLbl_HIST() {
		return lbl_HIST;
	}
	public void setLbl_HIST(JLabel lbl_HIST) {
		this.lbl_HIST = lbl_HIST;
	}
	
	
}
