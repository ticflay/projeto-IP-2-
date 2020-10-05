package texto;

import java.util.ArrayList;


public class EMPRESA {
	private String login;
	private char[] senha;
	private ArrayList<PRODUTOS> produto = new ArrayList<>();
	private ArrayList<FUNCIONÁRIOS> funcionarios = new ArrayList<>();
	private ArrayList<SERVIÇO> serviços = new ArrayList<>();
	private DONO dono;
	private String nome;
	public EMPRESA(String login, char[] senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		
	}
	
	
	public EMPRESA() {
		super();
	}


	public int BuscarServiço(String nome, int codigo)
	{
		for(int i = 0; i < serviços.size(); i++)
		{
			if(serviços.get(i).getNome() == nome && serviços.get(i).getCodigo() == codigo)
			{
				return i;
			}
		}
		return -1;
		
	}
	public void AdicionarServiço(String LOGINuser, String nome, int codigo, int empresa, double preço)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 ||  funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pro = BuscarServiço(nome, codigo);
			if(pro == -1) //se nao existir serviço
			{
				serviços.add(new SERVIÇO(codigo, nome, empresa, preço));
			}else
			{
				//serviço ja existe
			}
		}else
		{
			//sem permissao
		}
	}
	public void RemoverServiço(String nome, int codigo, String USERlogin)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
		   		int p = BuscarServiço(nome, codigo);
				if(p != -1) //se o serviço existir
				{
					serviços.remove(p);
				}else
				{
					//só ocorre se o produto nao existir > mandar msg de erro
				}
		}else
		{
			//nao pode remover, msg de erro
		}
	
	}
	public void EditarNomeServiço(String NovoNome, int codigo, String USERlogin, String NomeAntigo)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = BuscarServiço(NomeAntigo, codigo);
			if(pt != -1) //produto existir
			{
			serviços.get(pt).setNome(NovoNome);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
	}
	public void EditarPreçoServiço(double NovoPreço, int codigo, String USERlogin, String nome)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = BuscarServiço(nome, codigo);
			if(pt != -1)
			{
			serviços.get(pt).setPreço(NovoPreço);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
	}

	public int buscarFuncionario(String login)
	{
		if(login == dono.getLogin())
		{
			return -2; // retornará -2 sempre que for o dono
		}else {
		for(int i = 0; i < funcionarios.size(); i++)
		{
			if(funcionarios.get(i).getLogin() == login)
			{
				return i;
			}
		}
		}
		return -1; //funcionario nao encontrado

	}
	public int buscarFuncionario(String nome, int codigo)
	{
		if(nome == dono.getNome() && dono.getCodigo() == codigo)
			{
			return -2;
		}else
		{
			for(int i = 0; i < funcionarios.size(); i++)
			{
				if(funcionarios.get(i).getNome() == nome && funcionarios.get(i).getCodigo() == codigo)
				{
					return i;
				}
			}
		}
		return -1;
	}
	public void CadastrarFuncionario(String login, char[] senha, int empresa, String nome, boolean produto, boolean serviço, boolean adicionarProdutos,
			boolean adicionarFuncionarios, int codigo, String LOGINuser)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
		funcionarios.add(new FUNCIONÁRIOS(login, senha, empresa, nome, produto, serviço, adicionarProdutos,
				 adicionarFuncionarios, codigo));
		}else
		{
			//funcionario nao tem permisso
		}
	}
	public void RemoverFuncionarioNome(String nome, String LOGINuser, int codigo)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int rem = buscarFuncionario(nome, codigo);
			if(rem == -1)
			{
				//imprimir funcionario nao encontrado
			}else if(rem == -2)
			{
				//nao pode remover o dono
			}else
			{
				funcionarios.remove(rem);
			}
		}
	}
	public void EditarNomeFuncionario(String nome, String LOGINuser, int codigo, String NovoNome)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int buscar = buscarFuncionario(nome, codigo);
			if(buscar == -2)
			{
				//funcionario é o dono
			}else if(buscar == -1)
			{
				//funcionario nao existe
			}else
			{
				funcionarios.get(buscar).setNome(NovoNome);
			}
			
		}
	}
	public void EditarSenha(char[] NovaSenha, char[] SenhaAnterior, String LOGINuser)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2)
		{
			if(dono.getSenha() == SenhaAnterior)
			{
				if(NovaSenha.length >= 8)
				{
					dono.setSenha(NovaSenha);
				
				}
			}
		}else
		{
		if(funcionarios.get(analisar).getSenha() == SenhaAnterior)
		{
			if(NovaSenha.length >= 8)
			{
			
				funcionarios.get(analisar).setSenha(NovaSenha);
			}
			else
			{
				//senha mt pequena
			}
		}
		}
	}
	

	public void EditarGerenciaFuncionarios(boolean Gerencia, String USERlogin, String nome, int codigo)
	
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int indice = buscarFuncionario(nome, codigo);
			if(indice != -2 && indice != -1)
			{
				funcionarios.get(indice).setGerenciarFuncionarios(Gerencia);
			}else
			{
				//funcionario nao existe ou é o dono
			}
		}else
		{
			//nao tem permissao
		}
	}
	public void EditarFuncionarioVenderProduto(String LOGINuser, String nome, int codigo, boolean VenderProduto)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int indice = buscarFuncionario(nome, codigo);
			if(indice != -2 && indice != -1)
			{
				funcionarios.get(indice).setVenderProduto(VenderProduto);
			}else
			{
				//operação invalida
			}
		}else
		{
			//sem permissao
		}
	}
	public void EditarFuncionarioServiço(String LOGINuser, String nome, int codigo, boolean serviço)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int indice = buscarFuncionario(nome, codigo);
			if(indice != -2 && indice != -1)
				
			{
				funcionarios.get(indice).setVenderServiço(serviço);
			}else {
				//operaçao invalida
			}
		}else {
			//sem permissao
		}
	}
	public void EditarFuncionarioGerenciaProdutos(String LOGINuser, String nome, int codigo, boolean GerenciarProdutos)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int indice = buscarFuncionario(nome, codigo);
			if(indice != -2 && indice != -1)
			{
				funcionarios.get(indice).setGerenciarProdutos(GerenciarProdutos);
			}else
			{
				//operacao invalida
			}
		}else
		{
			//sem permissao
		}
	}
	
	public void CadastrarProdutos(String nome, int empresa, int codigo, double preço, int quantidade, String LOGINuser)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
		int p = buscarProduto(nome, codigo);
		
		if(p == -1) //só vai adicionar se nao houve nome e codigo iguais
		{
		produto.add(new PRODUTOS(nome, empresa, codigo, preço, quantidade));
		}
		}else
		{
			//funcionario nao tem permissao
		}
		
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
	public void RemoverProdutos(String nome, int codigo, String USERlogin)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
		   		int p = buscarProduto(nome, codigo);
				if(p != -1)
				{
					produto.remove(p);
				}else
				{
					//só ocorre se o produto nao existir > mandar msg de erro
				}
		}else
		{
			//nao pode remover, msg de erro
		}
	
	}
	public void EditarNomeProduto(String NovoNome, int codigo, String USERlogin, String NomeAntigo)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = buscarProduto(NomeAntigo, codigo);
			if(pt != -1) //produto existir
			{
			produto.get(pt).setNome(NovoNome);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
	}
	public void EditarPreçoProduto(double NovoPreço, int codigo, String USERlogin, String nome)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = buscarProduto(nome, codigo);
			if(pt != -1)
			{
			produto.get(pt).setPreço(NovoPreço);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
	}
	public void EditarQuantidade(int QuantRemover, int codigo, String USERlogin, String nome)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = buscarProduto(nome, codigo);
			if(pt != -1)
			{
				int novaQuant = produto.get(pt).getQuantidade() - QuantRemover;
				produto.get(pt).setQuantidade(novaQuant);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
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
	public ArrayList<PRODUTOS> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<PRODUTOS> produto) {
		this.produto = produto;
	}
	public ArrayList<FUNCIONÁRIOS> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<FUNCIONÁRIOS> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public DONO getDono() {
		return dono;
	}
	public void setDono(DONO dono) {
		this.dono = dono;
	}
	public ArrayList<SERVIÇO> getServiços() {
		return serviços;
	}
	public void setServiços(ArrayList<SERVIÇO> serviços) {
		this.serviços = serviços;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
