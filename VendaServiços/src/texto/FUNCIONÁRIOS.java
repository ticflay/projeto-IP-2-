package texto;

public class FUNCIONÁRIOS {
	private String login;
	private char[] senha;
	private int empresa;
	private String nome;
	private boolean VenderProduto;
	private boolean VenderServiço;
	private boolean GerenciarProdutos;
	private boolean GerenciarFuncionarios;
	private int codigo;
	
	public FUNCIONÁRIOS(String login, char[] senha, int empresa, String nome, boolean produto, boolean serviço, boolean adicionarProdutos,
			boolean adicionarFuncionarios, int codigo) {
		super();
		this.login = login;
		this.senha = senha;
		this.empresa = empresa;
		this.nome = nome;
		this.VenderProduto = produto;
		this.VenderServiço = serviço;
		this.GerenciarProdutos = adicionarProdutos;
		this.GerenciarFuncionarios = adicionarFuncionarios;
		this.codigo = codigo;
		
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
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVenderProduto() {
		return VenderProduto;
	}
	public void setVenderProduto(boolean VenderProduto) {
		this.VenderProduto = VenderProduto;
	}
	public boolean isVenderServiço() {
		return VenderServiço;
	}
	public void setVenderServiço(boolean VenderServiço) {
		this.VenderServiço = VenderServiço;
	}
	public boolean isGerenciarProdutos() {
		return GerenciarProdutos;
	}
	public void setGerenciarProdutos(boolean GerenciarProdutos) {
		this.GerenciarProdutos = GerenciarProdutos;
	}
	public boolean isGerenciarFuncionarios() {
		return GerenciarFuncionarios;
	}
	public void setGerenciarFuncionarios(boolean GerenciarFuncionarios) {
		this.GerenciarFuncionarios = GerenciarFuncionarios;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
