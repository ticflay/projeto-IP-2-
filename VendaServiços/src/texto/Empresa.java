package texto;

import java.util.ArrayList;


public class Empresa {
	private String login;
	private char[] senha;
	private ArrayList<Produto> produto = new ArrayList<>();
	private ArrayList<Funcionario> funcionario = new ArrayList<>();
	private ArrayList<Serviço> serviço = new ArrayList<>();
	private Dono dono;
	private String nome;
	public Empresa(String login, char[] senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		
	}
	
	
	public Empresa() {
		super();
	}


	public int BuscarServiço(String nome, int codigo)
	{
		for(int i = 0; i < serviço.size(); i++)
		{
			if(serviço.get(i).getNome() == nome && serviço.get(i).getCodigo() == codigo)
			{
				return i;
			}
		}
		return -1;
		
	}
	public void AddServiço(String nome, int codigo, int empresa, double preço)
	{
		
						serviço.add(new Serviço(codigo, nome, empresa, preço));
	}
			
	public void RemoverServiço(String nome, int codigo)
	{
		
		   		int p = BuscarServiço(nome, codigo);
									serviço.remove(p);
	}

		public int buscarFuncionario(String login)
	{
		
		for(int i = 0; i < funcionario.size(); i++)
		{
			if(funcionario.get(i).getLogin() == login)
			{
				return i;
			}
		}
		
		return -1; //funcionario nao encontrado

	}
	
	public boolean isDono(String LOGIN)
	{
		if(dono.getLogin().equals(LOGIN))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean FuncionarioExiste(String LOGIN)
	{
		for(int i = 0; i < funcionario.size(); i++)
		{
			if(funcionario.get(i).getLogin() == LOGIN)
			{
				return true;
			}
		}
		return false;
	}
	

	public void RemoverFuncionarioNome(String login)
	{
		
			int rem = buscarFuncionario(login);

				funcionario.remove(rem);
			
	}

	
		
	public void CadastrarProdutos(String nome, int empresa, int codigo, double preço, int quantidade, String LOGINuser)
	{
		
		produto.add(new Produto(nome, empresa, codigo, preço, quantidade));
	
	}
    public int buscarProduto(String nome, int codigo)
	{
		for(int i = 0; i < produto.size(); i++)
		{
			
			if(produto.get(i).getNome() == nome && produto.get(i).getCodigo() == codigo)
			{
				return i;
			}
		}
		return -1;
	}
    
    public boolean ProdutoExiste(String nome, int codigo)
    {
    	if(buscarProduto(nome, codigo) == -1)
    	{
    		return false;
    	}else
    	{
    		return true;
    	}
    }
    
	public void RemoverProdutos(String nome, int codigo)
	{
	
		   		int p = buscarProduto(nome, codigo);
					produto.remove(p);
	
	
	}
	
	public void VenderProduto(Produto produto)
	{
		
	}
	
	public void prestarServiço(Serviço serviço)
	{
		
	}


	


	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public char[] getSenha() {
		return senha;
	}
	public void setSenha(char[] senha) {
		this.senha = senha;
	}
	public ArrayList<Produto> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}
	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public ArrayList<Serviço> getServiço() {
		return serviço;
	}
	public void setServiço(ArrayList<Serviço> serviço) {
		this.serviço = serviço;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString()
	{
		return "Nome: " +nome;
		}
	
	

}
