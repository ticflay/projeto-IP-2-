package inter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.border.LineBorder;
import texto.*;


public class PrincipalTeste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	void setColor(JPanel panel1, JPanel panel2, JLabel label)
	{
		
		panel1.setBackground(new Color(255, 182, 193));
		panel2.setBackground(new Color(255, 182, 193));
		label.setForeground(new Color(240,240,240));
		
	}
	
	void resetColor(JPanel panel1, JPanel panel2, JLabel label)
	{
		panel1.setBackground(new Color(219, 112, 147));
		panel2.setBackground(new Color(219, 112, 147));
		label.setForeground(new Color(240,240,240));
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalTeste frame = new PrincipalTeste();
					frame.setLocationRelativeTo(null);
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
	public PrincipalTeste() {
		EMPRESAS emp = new EMPRESAS();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 650);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_pai = new JPanel();
		panel_pai.setBackground(new Color(0, 0, 0));
		panel_pai.setBounds(0, 0, 1350, 650);
		contentPane.add(panel_pai);
		panel_pai.setLayout(null);
		
		JPanel sideBar_panel = new JPanel();
		sideBar_panel.setBounds(0, 0, 278, 621);
		sideBar_panel.setForeground(new Color(0, 153, 153));
		sideBar_panel.setBackground(new Color(219, 112, 147));
		panel_pai.add(sideBar_panel);
		sideBar_panel.setLayout(null);
		
		JPanel panel_home = new JPanel();
	
		panel_home.setBorder(null);
		panel_home.setBackground(new Color(219, 112, 147));
		panel_home.setBounds(0, 168, 278, 52);
		sideBar_panel.add(panel_home);
		panel_home.setLayout(null);
		
		JLabel lbl_home = new JLabel("Home");
		lbl_home.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_home.setForeground(new Color(0, 0, 0));
		lbl_home.setBackground(new Color(255, 255, 255));
		lbl_home.setBounds(88, 0, 180, 52);
		panel_home.add(lbl_home);
		
		JPanel small_h = new JPanel();
		small_h.setBackground(new Color(219, 112, 147));
		small_h.setBounds(0, 0, 4, 52);
		panel_home.add(small_h);
		small_h.setLayout(null);
		
		JLabel corClara = new JLabel("");
		corClara.setIcon(new ImageIcon(PrincipalTeste.class.getResource("/inter/ROSAclaro.png")));
		
		
		
		JPanel panel_login = new JPanel();
	
		panel_login.setBackground(new Color(219, 112, 147));
		panel_login.setBorder(null);
		panel_login.setBounds(0, 251, 278, 52);
		sideBar_panel.add(panel_login);
		panel_login.setLayout(null);
		
		JLabel lbl_login = new JLabel("Login");
		lbl_login.setForeground(Color.BLACK);
		lbl_login.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_login.setBackground(Color.BLACK);
		lbl_login.setBounds(86, 0, 182, 52);
		panel_login.add(lbl_login);
		
		JPanel small_l = new JPanel();
		small_l.setBackground(new Color(219, 112, 147));
		small_l.setBounds(0, 0, 4, 52);
		panel_login.add(small_l);
		small_l.setLayout(null);
		
		JPanel panel_cadastro = new JPanel();
	
		panel_cadastro.setBorder(null);
		panel_cadastro.setBackground(new Color(219, 112, 147));
		panel_cadastro.setBounds(0, 329, 278, 52);
		sideBar_panel.add(panel_cadastro);
		panel_cadastro.setLayout(null);
		
		JLabel lbl_cadastro = new JLabel("Cadastre-se");
		lbl_cadastro.setForeground(Color.BLACK);
		lbl_cadastro.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_cadastro.setBackground(Color.BLACK);
		lbl_cadastro.setBounds(53, 0, 182, 52);
		panel_cadastro.add(lbl_cadastro);
		
		JPanel small_c = new JPanel();
		small_c.setBackground(new Color(219, 112, 147));
		small_c.setBounds(0, 0, 4, 52);
		panel_cadastro.add(small_c);
		small_c.setLayout(null);
		
		JPanel panel_serviços = new JPanel();
		panel_serviços.setBorder(null);
		panel_serviços.setBackground(new Color(219, 112, 147));
		panel_serviços.setBounds(0, 405, 278, 52);
		sideBar_panel.add(panel_serviços);
		panel_serviços.setLayout(null);
		
		JLabel lbl_servicos = new JLabel("Servi\u00E7os");
		lbl_servicos.setForeground(Color.BLACK);
		lbl_servicos.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_servicos.setBackground(Color.WHITE);
		lbl_servicos.setBounds(73, 0, 182, 52);
		panel_serviços.add(lbl_servicos);
		
		JPanel small_se = new JPanel();
		small_se.setBackground(new Color(219, 112, 147));
		small_se.setBounds(0, 0, 4, 52);
		panel_serviços.add(small_se);
		small_se.setLayout(null);
		
		JPanel panel_sobre = new JPanel();
		panel_sobre.setBorder(null);
		panel_sobre.setBackground(new Color(219, 112, 147));
		panel_sobre.setBounds(0, 479, 278, 52);
		sideBar_panel.add(panel_sobre);
		panel_sobre.setLayout(null);
		
		JLabel lbl_sobre = new JLabel("Sobre\r\n");
		lbl_sobre.setForeground(Color.BLACK);
		lbl_sobre.setFont(new Font("Corbel Light", Font.BOLD, 25));
		lbl_sobre.setBackground(Color.WHITE);
		lbl_sobre.setBounds(86, 0, 182, 52);
		panel_sobre.add(lbl_sobre);
		
		JPanel small_sobre = new JPanel();
		small_sobre.setBackground(new Color(219, 112, 147));
		small_sobre.setBounds(0, 0, 4, 52);
		panel_sobre.add(small_sobre);
		small_sobre.setLayout(null);
		
		JLabel lbl_G = new JLabel("G");
		lbl_G.setFont(new Font("Adobe Devanagari", Font.BOLD, 88));
		lbl_G.setBounds(85, 24, 146, 107);
		sideBar_panel.add(lbl_G);
		
		JLabel lbl_S = new JLabel("S");
		lbl_S.setFont(new Font("Adobe Devanagari", Font.BOLD, 99));
		lbl_S.setBounds(51, 11, 104, 122);
		sideBar_panel.add(lbl_S);
		
		JLabel lbl_Sell = new JLabel("Selling\r\n");
		lbl_Sell.setFont(new Font("Sitka Display", Font.BOLD, 25));
		lbl_Sell.setBounds(140, 61, 104, 52);
		sideBar_panel.add(lbl_Sell);
		
		JLabel lbl_Gui = new JLabel("Guide");
		lbl_Gui.setFont(new Font("Sitka Display", Font.BOLD, 25));
		lbl_Gui.setBounds(140, 83, 104, 52);
		sideBar_panel.add(lbl_Gui);
		
		
		LOGIN login = new LOGIN();
		login.setBounds(276, 0, 1074, 621);
		HOME home = new HOME();
		home.setBounds(276, 0, 1074, 621);
		CADASTRO cadastro = new CADASTRO();
		cadastro.setBounds(276, 0, 1074, 621);
		Serv serv = new Serv();
		serv.setBounds(276, 0 , 1074, 621);
		CadastroPROP prop = new CadastroPROP();
		prop.setBounds(276, 0 , 1074, 621);
		
		FUNCIONARIOS func = new FUNCIONARIOS();
		panel_pai.add(func);
		panel_pai.add(home);
		panel_pai.add(login);
		panel_pai.add(cadastro);
		panel_pai.add(serv);
		panel_pai.add(prop);
		
		SIDEBAR_logado side = new SIDEBAR_logado();
		side.setBounds(0, 0, 278, 621);
		
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				setColor(panel_home, small_h, lbl_home);
				resetColor(panel_login, small_l, lbl_login);
				resetColor(panel_cadastro, small_c, lbl_cadastro);
				resetColor(panel_serviços, small_se, lbl_servicos);
				resetColor(panel_sobre, small_sobre, lbl_sobre);
				
				
				home.setVisible(true);
				login.setVisible(false);
				cadastro.setVisible(false);
				serv.setVisible(false);
				prop.setVisible(false);
			}
		});
		panel_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel_login, small_l, lbl_login);
				resetColor(panel_home, small_h, lbl_home);
				resetColor(panel_cadastro, small_c, lbl_cadastro);
				resetColor(panel_serviços, small_se, lbl_servicos);
				resetColor(panel_sobre, small_sobre, lbl_sobre);
				
				panel_pai.add(login);
				login.setBounds(276,0,1074,621);
				login.setVisible(true);
				home.setVisible(false);
				cadastro.setVisible(false);
				serv.setVisible(false);
				prop.setVisible(false);
				
				login.getBtn_entrar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if((login.getText_user().getText().length() > 0) && (login.getPass().getPassword().length > 0))
						{
							
							if(emp.Buscar(login.getText_user().getText()))
							{
								//A conta existe, pode logar
								if(Arrays.equals(emp.getEmp().get(emp.RetornaPos(login.getText_user().getText())).getSenha(), login.getPass().getPassword()))
								{
									sideBar_panel.setVisible(false);
									side.setVisible(true);
									
									JLabel lbl_nome = new JLabel("Empresa:" +emp.getEmp().get(emp.RetornaPos(login.getText_user().getText())).getNome());
									lbl_nome.setBounds(140, 11, 270, 49);
									func.add(lbl_nome);
									
								}else
								{
									JOptionPane.showMessageDialog(null, "Senha incorreta!");
								}
							}else
							{
								JOptionPane.showMessageDialog(null, "Login inexistente!");
							}
							
						}else
						{
							JOptionPane.showMessageDialog(null, "Digite algo!");
						}
					}
				});
			}
		});
		panel_cadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel_cadastro, small_c, lbl_cadastro);
				resetColor(panel_login, small_l, lbl_login);
				resetColor(panel_home, small_h, lbl_home);
				resetColor(panel_serviços, small_se, lbl_servicos);
				resetColor(panel_sobre, small_sobre, lbl_sobre);
				panel_pai.add(cadastro);
				cadastro.setBounds(276,0,1074,621);
				cadastro.setVisible(true);
				home.setVisible(false);
				login.setVisible(false);
				serv.setVisible(false);
				prop.setVisible(false);
				
				cadastro.getBtn_prox().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EMPRESA empresa;
						if(emp.Buscar(cadastro.getText_user().getText()))
						{
							JOptionPane.showMessageDialog(null, "Login já existente");
						
						}
						if(!Arrays.equals(cadastro.getPass1().getPassword(), cadastro.getPass2().getPassword()))
						{
							JOptionPane.showMessageDialog(null, "As senhas devem ser iguais");
							
						} 
						if(cadastro.getPass1().getPassword().length < 8)
						{
							JOptionPane.showMessageDialog(null, "A senha deve ter 8 caracteres ou mais");
						}
						
						if(cadastro.getText_user().getText().length() < 4)
						{
							JOptionPane.showMessageDialog(null, "Login muito pequeno");
						}
						
						if((!emp.Buscar(cadastro.getText_user().getText())) && (Arrays.equals(cadastro.getPass1().getPassword(), cadastro.getPass2().getPassword())) && (cadastro.getPass1().getPassword().length >= 8) && (cadastro.getText_user().getText().length() >= 4) && (cadastro.getText_nome().getText().length() > 0))
						{
							empresa = new EMPRESA(cadastro.getText_user().getText(), cadastro.getPass1().getPassword(), cadastro.getText_nome().getText());
							emp.getEmp().add(empresa);
							
							prop.setVisible(true);
							cadastro.setVisible(false);
							
							prop.getBtn_cad().addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if((!empresa.getLogin().equals(prop.getText_user().getText())) && (Arrays.equals(prop.getPass1().getPassword(), prop.getPass2().getPassword())) && (prop.getPass1().getPassword().length >= 8 && prop.getPass2().getPassword().length >= 8) && (prop.getText_user().getText().length() >= 4))
									{
										DONO dono = new DONO(prop.getText_user().getText(), prop.getPass1().getPassword(), prop.getText_nome().getText());
										emp.getEmp().get(emp.RetornaPos(empresa.getLogin())).setDono(dono);
										
										JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso");
										prop.setVisible(false);
										cadastro.setVisible(true);
									}else if(empresa.getLogin().equals(prop.getText_user().getText()))
									{
										JOptionPane.showMessageDialog(null, "Usuário do proprietário não pode ser igual ao usuário da empresa!");
									}else if(!Arrays.equals(prop.getPass1().getPassword(), prop.getPass2().getPassword()))
									{
										JOptionPane.showMessageDialog(null, "Senhas devem ser iguais");
									}else if(prop.getPass1().getPassword().length < 8 && prop.getPass2().getPassword().length < 8)
									{
										JOptionPane.showMessageDialog(null, "A senha deve ter 8 ou mais caracteres");
									}else if(prop.getText_user().getText().length() < 4)
									{
										JOptionPane.showMessageDialog(null, "Login deve ter no mínimo 4 caracteres");
									}
								}
							});
							


						}
					}
					});;
				
			
				
				
				
				
			}
		});
		panel_serviços.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				setColor(panel_serviços, small_se, lbl_servicos);
				
				resetColor(panel_login, small_l, lbl_login);
				resetColor(panel_cadastro, small_c, lbl_cadastro);
				resetColor(panel_home, small_h, lbl_home);
				resetColor(panel_sobre, small_sobre, lbl_sobre);
				panel_pai.add(serv);
				serv.setBounds(276,0,1074,621);
				serv.setVisible(true);
				cadastro.setVisible(false);
				home.setVisible(false);
				login.setVisible(false);
				prop.setVisible(false);
			}
		});
		panel_sobre.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel_sobre, small_sobre, lbl_sobre);
				resetColor(panel_login, small_l, lbl_login);
				resetColor(panel_cadastro, small_c, lbl_cadastro);
				resetColor(panel_serviços, small_se, lbl_servicos);
				resetColor(panel_home, small_h, lbl_home);
			}
		});

	

	
}
	
}
