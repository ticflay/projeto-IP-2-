package inter;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovoFuncionario extends JInternalFrame {
	private JTextField textNome;
	private JTextField textLogin;
	private JPasswordField textSenha;
	private JRadioButton rdbtn_GPyes;
	private JRadioButton rdbtn_GPno;
	private ButtonGroup GrupoGP = new ButtonGroup();
	private JRadioButton rdbtn_VPyes;
	private JRadioButton rdbtn_VPno;
	private ButtonGroup GroupVP = new ButtonGroup();
	private JRadioButton rdbtn_PSyes;
	private JRadioButton rdbtn_PSno;
	private ButtonGroup GroupPS = new ButtonGroup();
	private JRadioButton rdbtn_GFyes;
	private JRadioButton rdbtn_GFno;
	private ButtonGroup GroupGF = new ButtonGroup();
	private JButton btnAdicionar;
	private JTextField text_codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoFuncionario frame = new NovoFuncionario();
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
	public NovoFuncionario() {
		getContentPane().setBackground(new Color(219, 112, 147));
		getContentPane().setLayout(null);
		setBounds(0, 0, 600, 345);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 582, 335);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(10, 52, 190, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 37, 46, 14);
		panel.add(lblNome);
		
		textLogin = new JTextField();
		textLogin.setColumns(10);
		textLogin.setBounds(10, 108, 190, 20);
		panel.add(textLogin);
		
		textSenha = new JPasswordField();
		textSenha.setColumns(10);
		textSenha.setBounds(10, 166, 190, 20);
		panel.add(textSenha);
		
		JLabel lbl_Login = new JLabel("Login");
		lbl_Login.setBounds(10, 92, 46, 14);
		panel.add(lbl_Login);
		
		JLabel lbl_Senha = new JLabel("Senha");
		lbl_Senha.setBounds(10, 152, 46, 14);
		panel.add(lbl_Senha);
		
		JLabel lbl_GerP = new JLabel("O funcion\u00E1rio poder\u00E1 gerenciar \r\nprodutos e servi\u00E7os?");
		lbl_GerP.setBounds(269, 19, 276, 53);
		panel.add(lbl_GerP);
		
		rdbtn_GPyes = new JRadioButton("Sim");
		rdbtn_GPyes.setBackground(Color.WHITE);
		rdbtn_GPyes.setBounds(269, 65, 70, 23);
		panel.add(rdbtn_GPyes);
		
		rdbtn_GPno = new JRadioButton("N\u00E3o");
		rdbtn_GPno.setBackground(Color.WHITE);
		rdbtn_GPno.setBounds(362, 65, 70, 23);
		panel.add(rdbtn_GPno);
		
		GrupoGP.add(rdbtn_GPyes);
		GrupoGP.add(rdbtn_GPno);

		
		JLabel lbl_VendP = new JLabel("O funcion\u00E1rio poder\u00E1 vender produtos?");
		lbl_VendP.setBounds(269, 92, 276, 53);
		panel.add(lbl_VendP);
		
		rdbtn_VPyes = new JRadioButton("Sim");
		rdbtn_VPyes.setBackground(Color.WHITE);
		rdbtn_VPyes.setBounds(269, 136, 70, 23);
		panel.add(rdbtn_VPyes);
		
	    rdbtn_VPno = new JRadioButton("N\u00E3o");
		rdbtn_VPno.setBackground(Color.WHITE);
		rdbtn_VPno.setBounds(362, 136, 70, 23);
		panel.add(rdbtn_VPno);
		
		GroupVP.add(rdbtn_VPyes);
		GroupVP.add(rdbtn_VPno);
		
		JLabel lbl_PreS = new JLabel("O funcion\u00E1rio poder\u00E1 prestar servi\u00E7os?");
		lbl_PreS.setBounds(269, 166, 276, 53);
		panel.add(lbl_PreS);
		
		rdbtn_PSyes = new JRadioButton("Sim");
		rdbtn_PSyes.setBackground(Color.WHITE);
		rdbtn_PSyes.setBounds(269, 215, 70, 23);
		panel.add(rdbtn_PSyes);
		
		rdbtn_PSno = new JRadioButton("N\u00E3o");
		rdbtn_PSno.setBackground(Color.WHITE);
		rdbtn_PSno.setBounds(362, 215, 70, 23);
		panel.add(rdbtn_PSno);
		
		GroupPS.add(rdbtn_PSyes);
		GroupPS.add(rdbtn_PSno);
		
		JLabel lbl_GerF = new JLabel("O funcion\u00E1rio poder\u00E1 gerenciar funcion\u00E1rios?");
		lbl_GerF.setBounds(269, 245, 276, 53);
		panel.add(lbl_GerF);
		
		rdbtn_GFyes = new JRadioButton("Sim");
		rdbtn_GFyes.setBackground(Color.WHITE);
		rdbtn_GFyes.setBounds(269, 292, 70, 23);
		panel.add(rdbtn_GFyes);
		
		rdbtn_GFno = new JRadioButton("N\u00E3o");
		rdbtn_GFno.setBackground(Color.WHITE);
		rdbtn_GFno.setBounds(362, 292, 70, 23);
		panel.add(rdbtn_GFno);
		
		GroupGF.add(rdbtn_GFyes);
		GroupGF.add(rdbtn_GFno);
		
		
		btnAdicionar = new JButton("Adicionar");
		
		btnAdicionar.setBounds(10, 292, 190, 23);
		panel.add(btnAdicionar);
		
		JLabel lbl_codigo = new JLabel("C\u00F3digo");
		lbl_codigo.setBounds(10, 205, 46, 14);
		panel.add(lbl_codigo);
		
		text_codigo = new JTextField();
		text_codigo.setDocument(new SoNumeros());
		text_codigo.setColumns(10);
		text_codigo.setBounds(10, 218, 190, 20);
		panel.add(text_codigo);
		setBounds(100, 100, 618, 387);

	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextLogin() {
		return textLogin;
	}

	public void setTextLogin(JTextField textLogin) {
		this.textLogin = textLogin;
	}

	public JPasswordField getTextSenha() {
		return textSenha;
	}

	public void setTextSenha(JPasswordField textSenha) {
		this.textSenha = textSenha;
	}

	public JRadioButton getRdbtn_GPyes() {
		return rdbtn_GPyes;
	}

	public void setRdbtn_GPyes(JRadioButton rdbtn_GPyes) {
		this.rdbtn_GPyes = rdbtn_GPyes;
	}

	public JRadioButton getRdbtn_GPno() {
		return rdbtn_GPno;
	}

	public void setRdbtn_GPno(JRadioButton rdbtn_GPno) {
		this.rdbtn_GPno = rdbtn_GPno;
	}

	public ButtonGroup getGrupoGP() {
		return GrupoGP;
	}

	public void setGrupoGP(ButtonGroup grupoGP) {
		GrupoGP = grupoGP;
	}

	public JRadioButton getRdbtn_VPyes() {
		return rdbtn_VPyes;
	}

	public void setRdbtn_VPyes(JRadioButton rdbtn_VPyes) {
		this.rdbtn_VPyes = rdbtn_VPyes;
	}

	public JRadioButton getRdbtn_VPno() {
		return rdbtn_VPno;
	}

	public void setRdbtn_VPno(JRadioButton rdbtn_VPno) {
		this.rdbtn_VPno = rdbtn_VPno;
	}

	public ButtonGroup getGroupVP() {
		return GroupVP;
	}

	public void setGroupVP(ButtonGroup groupVP) {
		GroupVP = groupVP;
	}

	public JRadioButton getRdbtn_PSyes() {
		return rdbtn_PSyes;
	}

	public void setRdbtn_PSyes(JRadioButton rdbtn_PSyes) {
		this.rdbtn_PSyes = rdbtn_PSyes;
	}

	public JRadioButton getRdbtn_PSno() {
		return rdbtn_PSno;
	}

	public void setRdbtn_PSno(JRadioButton rdbtn_PSno) {
		this.rdbtn_PSno = rdbtn_PSno;
	}

	public ButtonGroup getGroupPS() {
		return GroupPS;
	}

	public void setGroupPS(ButtonGroup groupPS) {
		GroupPS = groupPS;
	}

	public JRadioButton getRdbtn_GFyes() {
		return rdbtn_GFyes;
	}

	public void setRdbtn_GFyes(JRadioButton rdbtn_GFyes) {
		this.rdbtn_GFyes = rdbtn_GFyes;
	}

	public JRadioButton getRdbtn_GFno() {
		return rdbtn_GFno;
	}

	public void setRdbtn_GFno(JRadioButton rdbtn_GFno) {
		this.rdbtn_GFno = rdbtn_GFno;
	}

	public ButtonGroup getGroupGF() {
		return GroupGF;
	}

	public void setGroupGF(ButtonGroup groupGF) {
		GroupGF = groupGF;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public JTextField getText_codigo() {
		return text_codigo;
	}

	public void setText_codigo(JTextField text_codigo) {
		this.text_codigo = text_codigo;
	}
	
}
