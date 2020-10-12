package texto;

public class Funcionario {
	private String login;
	private char[] senha;
	private String nome;
	private boolean vendeProdutos;
	private boolean vendeServi�os;
	private boolean gerenciaProdutos;
	private boolean gerenciaFuncionarios;
	private int codigo;
	
	public Funcionario(String login, char[] senha, String nome, boolean vendeProdutos, boolean vendeServi�os, boolean gerenciaProdutos,
			boolean gerenciaFuncionarios, int codigo) {
		super();
		this.login = login;
		this.senha = senha;

		this.nome = nome;
		this.vendeProdutos = vendeProdutos;
		this.vendeServi�os = vendeServi�os;
		this.gerenciaProdutos = gerenciaProdutos;
		this.gerenciaFuncionarios = gerenciaFuncionarios;
		this.codigo = codigo;
		
	}
	
	public void add(Funcionario funcionario)
	{
		this.login = funcionario.login;
		this.senha = funcionario.senha;
		this.nome = funcionario.nome;
		this.vendeProdutos = funcionario.vendeProdutos;
		this.gerenciaProdutos = funcionario.gerenciaProdutos;
		this.gerenciaFuncionarios = funcionario.gerenciaFuncionarios;
		this.codigo = funcionario.codigo;
		
	}
	public String getLogin()
	{
		return login;
	}
	public void setLogin(String login)
	{
		this.login = login;
	}
	public char[] getSenha()
	{
		return senha;
	}
	public void setSenha(char[] senha)
	{
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVenderProduto() {
		return vendeProdutos;
	}
	public void setVenderProduto(boolean VenderProduto) {
		this.vendeProdutos = VenderProduto;
	}
	public boolean isVenderServi�o() {
		return vendeServi�os;
	}
	public void setVenderServi�o(boolean VenderServi�o) {
		this.vendeServi�os = VenderServi�o;
	}
	public boolean isGerenciarProdutos() {
		return gerenciaProdutos;
	}
	public void setGerenciarProdutos(boolean GerenciarProdutos) {
		this.gerenciaProdutos = GerenciarProdutos;
	}
	public boolean isGerenciarFuncionarios() {
		return gerenciaFuncionarios;
	}
	public void setGerenciarFuncionarios(boolean GerenciarFuncionarios) {
		this.gerenciaFuncionarios = GerenciarFuncionarios;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString()
	{
		String vendeP, vendeS, GerenP, GerencF;
		if(vendeServi�os == false)
		{
			vendeS = "N�o";
		}else
		{
			vendeS = "Sim";
		}
		if(gerenciaProdutos == false)
		{
			GerenP = "N�o";
		}else
		{
			GerenP = "Sim";
		}
		
		if(gerenciaFuncionarios == false)
		{
			GerencF = "N�o";
		}else
		{
			GerencF = "Sim";
		}
		if(vendeProdutos == false)
		{
			vendeP = "N�o";
		}else
		{
			vendeP = "Sim";
		}
		return "Nome: " +nome+ "    C�digo: " +codigo+"\n Vende Produtos? " +vendeP+" Presta Servi�os?" +vendeS+" Gerencia Funcion�rios? " +GerencF+ " Gerencia Produtos e Servi�os? "+GerenP;
	}
	
	

}
