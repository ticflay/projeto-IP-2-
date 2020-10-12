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


public class TelaPrincipal extends JFrame {

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
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		Dado emp = new Dado();
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
		corClara.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/inter/ROSAclaro.png")));
		
		JDesktopPane deskPanel = new JDesktopPane();
		deskPanel.setBounds(276, 0, 1100, 621);
		
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
		
		
		LoginEmpresa login = new LoginEmpresa();
		login.setBounds(276, 0, 1074, 621);
		Home home = new Home();
		home.setBounds(276, 0, 1074, 621);
		CadastroEmpresa cadastro = new CadastroEmpresa();
		cadastro.setBounds(276, 0, 1074, 621);
		Serviços serv = new Serviços();
		serv.setBounds(276, 0 , 1074, 621);
		CadastroProprietario prop = new CadastroProprietario();
		prop.setBounds(276, 0 , 1074, 621);
		
		GerenciarFuncionarios func = new GerenciarFuncionarios();
		func.setBounds(276, 0, 1074, 621);
		
		LoginFuncionario loginF = new LoginFuncionario();
		loginF.setBounds(276, 0, 1074, 621);
		
		NovoFuncionario addF = new NovoFuncionario();
		addF.setBounds(350, 100, 600, 345);
		
		TelaPrincipalLogado principal = new TelaPrincipalLogado();
		principal.setBounds(276, 0, 1074, 621);
		
		EdiçãoFuncionario updateF = new EdiçãoFuncionario();
		updateF.setBounds(350, 100, 600, 345);
		
		SideBarLogado side = new SideBarLogado();
		side.setBounds(0, 0, 278, 621);
		
		deskPanel.add(addF);
		deskPanel.add(updateF);



		panel_pai.add(side);
		panel_pai.add(updateF);
		panel_pai.add(principal);
		panel_pai.add(loginF);
		panel_pai.add(func);
		panel_pai.add(home);
		panel_pai.add(login);
		panel_pai.add(cadastro);
		panel_pai.add(serv);
		panel_pai.add(prop);
		panel_pai.add(deskPanel);
		
		
		updateF.setVisible(false);
		principal.setVisible(false);
		loginF.setVisible(false);
		func.setVisible(false);
		home.setVisible(true);
		login.setVisible(false);
		cadastro.setVisible(false);
		serv.setVisible(false);
		prop.setVisible(false);
		deskPanel.setVisible(false);
		sideBar_panel.setVisible(true);
		
		
		
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
				func.setVisible(false);
				loginF.setVisible(false);
				sideBar_panel.setVisible(true);
				side.setVisible(false);
				principal.setVisible(false);
				deskPanel.setVisible(false);
				addF.setVisible(false);
				side.setVisible(false);
			}
		});
		panel_login.addMouseListener(new MouseAdapter() { //clica em login
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
				func.setVisible(false);
				loginF.setVisible(false);
				
				deskPanel.setVisible(false);
				addF.setClosable(true);
				
				principal.setVisible(false);
				side.setVisible(false);
				sideBar_panel.setVisible(true);
				addF.setVisible(false);

				
				login.getBtn_entrar().addActionListener(new ActionListener() { //clica em entrar
					public void actionPerformed(ActionEvent e) {
						int pos = emp.RetornaPos(login.getText_user().getText());
						if((login.getText_user().getText().length() > 0) && (login.getPass().getPassword().length > 0)) //verifica se as caixas nao estao vazias
						{
							
							if(emp.Buscar(login.getText_user().getText()))  //verifica se a empresa existe
							{
								//A conta existe, pode logar
								if(Arrays.equals(emp.getEmp().get(pos).getSenha(), login.getPass().getPassword())) //verifica se as senhas sao iguais
								{
									
									 //entra na parte de logar na conta do funcionario
									login.setVisible(false);
									home.setVisible(false);
									cadastro.setVisible(false);
									serv.setVisible(false);
									prop.setVisible(false);
									func.setVisible(false);
									loginF.setVisible(true);
									deskPanel.setVisible(false);
									principal.setVisible(false);
									addF.setVisible(true);
									
									side.setVisible(false);
									sideBar_panel.setVisible(true);
									
									loginF.getBtn_entrar().addActionListener(new ActionListener() { //dps de passar os dados do funcionario, clica em entrar
										public void actionPerformed(ActionEvent e) {
											boolean dono = emp.getEmp().get(pos).isDono(loginF.getText_user().getText());
											int posF = emp.getEmp().get(pos).buscarFuncionario(loginF.getText_user().getText());
											boolean Fexiste = emp.getEmp().get(pos).FuncionarioExiste(loginF.getText_user().getText());
											if((dono == true && Arrays.equals(emp.getEmp().get(pos).getDono().getSenha(), loginF.getPass().getPassword()) || (Fexiste == true && Arrays.equals(emp.getEmp().get(pos).getFuncionario().get(posF).getSenha(), loginF.getPass().getPassword()))) )
																					{
										
																				
										
												
												
												login.setVisible(false);
												home.setVisible(false);
												cadastro.setVisible(false);
												serv.setVisible(false);
												prop.setVisible(false);
												func.setVisible(false);
												loginF.setVisible(false);
												deskPanel.setVisible(false);
												principal.setVisible(true);
												addF.setVisible(false);
												
												side.setVisible(true);
												sideBar_panel.setVisible(false);
												
												
													side.getPanel_FUNC().addMouseListener(new MouseAdapter() {
													@Override
													public void mousePressed(MouseEvent e) {
														
														if(dono == true || (emp.getEmp().get(pos).getFuncionario().get(posF).isGerenciarFuncionarios()))
														{
																				
															
															login.setVisible(false);
															home.setVisible(false);
															cadastro.setVisible(false);
															serv.setVisible(false);
															prop.setVisible(false);
															func.setVisible(true);
															loginF.setVisible(false);
															addF.setVisible(false);
															principal.setVisible(false);
															deskPanel.setVisible(false);
															
															side.setVisible(true);
															sideBar_panel.setVisible(false);
															
															func.getBtnAdicionar().addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent arg0) {
																	login.setVisible(false);
																	home.setVisible(false);
																	cadastro.setVisible(false);
																	serv.setVisible(false);
																	prop.setVisible(false);
																	func.setVisible(false);
																	loginF.setVisible(false);
																	deskPanel.setVisible(true);
																	principal.setVisible(false);
																	addF.setVisible(true);
																	
																	side.setVisible(true);
																	sideBar_panel.setVisible(false);
																	
																	addF.getBtnAdicionar().addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent arg0) {
																			
																			
																			
																			if((addF.getTextNome().getText().length() > 4) &&    
																					(addF.getTextLogin().getText().length() > 4) && 
																					(addF.getTextSenha().getPassword().length >= 8) && //verificando se escreveram algo
																					(!emp.getEmp().get(pos).FuncionarioExiste(addF.getTextLogin().getText())) && //verificando se já existe o login
																					((addF.getRdbtn_GPyes().isSelected()) || (addF.getRdbtn_GPno().isSelected())) && // verificando se um dos botoes de GP foi selecionado
																					((addF.getRdbtn_VPyes().isSelected()) || (addF.getRdbtn_VPno().isSelected())) &&
																					((addF.getRdbtn_PSyes().isSelected()) || (addF.getRdbtn_PSno().isSelected())) &&
																					((addF.getRdbtn_GFyes().isSelected()) || (addF.getRdbtn_GFno().isSelected())) &&
																					(addF.getText_codigo().getText().length() > 4) )
																			{
																				
																				boolean produto;
																				boolean serviço;
																				boolean adicionarProdutos;
																				boolean adicionarFuncionarios;
																				
																				if(addF.getRdbtn_GPyes().isSelected())
																				{
																					adicionarProdutos = true;
																				}else
																				{
																					adicionarProdutos = false;
																				}
																				
																				if(addF.getRdbtn_VPyes().isSelected())
																				{
																					produto = true;
																				}else
																				{
																				    produto = false;
																				}
																				
																				if(addF.getRdbtn_PSyes().isSelected())
																				{
																					serviço = true;
																				}else
																				{
																					serviço = false;
																				}
																				
																				if(addF.getRdbtn_GFyes().isSelected())
																				{
																					adicionarFuncionarios = true;
																				}else
																				{
																					adicionarFuncionarios = false;
																				}
																				
																				int codigo = Integer.parseInt(addF.getText_codigo().getText());
																				
																				Funcionario funcionario = new Funcionario(addF.getTextLogin().getText(), addF.getTextSenha().getPassword(), addF.getTextNome().getText(), produto, serviço, adicionarProdutos,
								                                                        adicionarFuncionarios, codigo);
																				
																					
																				emp.getEmp().get(pos).getFuncionario().add(funcionario);
																				JOptionPane.showMessageDialog(null, "Funcionário adicionado");
																				addF.getTextNome().setText("");
																				addF.getTextLogin().setText("");
																				addF.getTextSenha().setText("");
																				
																				
																				
																				
																			}else if((addF.getTextNome().getText().length() <= 4) || (addF.getTextLogin().getText().length() <= 4) || (addF.getTextSenha().getPassword().length < 8))
																			{
																				JOptionPane.showMessageDialog(null, "Os campos devem ser todos preenchidos");
																			}else if(emp.getEmp().get(pos).FuncionarioExiste(addF.getTextLogin().getText()) || emp.getEmp().get(pos).getDono().getLogin().equals(addF.getTextLogin().getText()))
																			{
																				JOptionPane.showMessageDialog(null, "Login já existente");
																			}else
																			{
																				JOptionPane.showMessageDialog(null, "Todas as opções devem ser respondidas");
																			}
																		}
																	});
																	
																}
															});
															
															func.getBtnRemover().addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	
																	
																}
															});
															
														
															
															func.getBtnAtualizar().addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	
																	updateF.setVisible(true);
																	sideBar_panel.setVisible(false);
																	side.setVisible(false);
																	login.setVisible(false);
																	home.setVisible(false);
																	cadastro.setVisible(false);
																	serv.setVisible(false);
																	prop.setVisible(false);
																	func.setVisible(false);
																	principal.setVisible(false);
																	
																	
																	
																	
																														
																}
															});
															
														}else
														{
															JOptionPane.showMessageDialog(null, "Você não tem permissão para acessar essa função");
														}
														
													}
												});

												
												
																								
												
												
											}else if(posF == -1)
											{
												JOptionPane.showMessageDialog(null, "Login inexistente");
											}else if(loginF.getText_user().getText().length() == 0 || loginF.getPass().getPassword().length == 0)
											{
												JOptionPane.showMessageDialog(null, "Escreva algo");
											}else if(!Arrays.equals(emp.getEmp().get(pos).getFuncionario().get(posF).getSenha(), loginF.getPass().getPassword()))
											{
												JOptionPane.showMessageDialog(null, "Senha incorreta");
											}else
											{
												JOptionPane.showMessageDialog(null, "Erro!");
											}
										}
									});

									
									
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
				
				login.setVisible(false);
				home.setVisible(false);
				cadastro.setVisible(true);
				serv.setVisible(false);
				prop.setVisible(false);
				func.setVisible(false);
				loginF.setVisible(false);
				addF.setVisible(false);
				principal.setVisible(false);
				deskPanel.setVisible(false);
				
				side.setVisible(false);
				sideBar_panel.setVisible(true);
				
				cadastro.getBtn_prox().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Empresa empresa;
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
							empresa = new Empresa(cadastro.getText_user().getText(), cadastro.getPass1().getPassword(), cadastro.getText_nome().getText());
							emp.getEmp().add(empresa);
							
							prop.setVisible(true);
							cadastro.setVisible(false);
							
							prop.getBtn_cad().addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if((!empresa.getLogin().equals(prop.getText_user().getText())) && (Arrays.equals(prop.getPass1().getPassword(), prop.getPass2().getPassword())) && (prop.getPass1().getPassword().length >= 8 && prop.getPass2().getPassword().length >= 8) && (prop.getText_user().getText().length() >= 4))
									{
										Dono dono = new Dono(prop.getText_user().getText(), prop.getPass1().getPassword(), prop.getText_nome().getText());
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
			
				
				login.setVisible(false);
				home.setVisible(false);
				cadastro.setVisible(false);
				serv.setVisible(true);
				prop.setVisible(false);
				func.setVisible(false);
				loginF.setVisible(false);
				addF.setVisible(false);
				principal.setVisible(false);
				deskPanel.setVisible(false);
				
				side.setVisible(false);
				sideBar_panel.setVisible(true);
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
				
				login.setVisible(false);
				home.setVisible(false);
				cadastro.setVisible(false);
				serv.setVisible(false);
				prop.setVisible(false);
				func.setVisible(false);
				loginF.setVisible(false);
				addF.setVisible(false);
				principal.setVisible(false);
				deskPanel.setVisible(false);
				
				side.setVisible(false);
				sideBar_panel.setVisible(true);
			}
		});
		
		
	
	

	
}
	
}
