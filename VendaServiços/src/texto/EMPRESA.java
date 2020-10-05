package texto;

import java.util.ArrayList;


public class EMPRESA {
	private String login;
	private char[] senha;
	private ArrayList<PRODUTOS> produto = new ArrayList<>();
	private ArrayList<FUNCION�RIOS> funcionarios = new ArrayList<>();
	private ArrayList<SERVI�O> servi�os = new ArrayList<>();
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


	public int BuscarServi�o(String nome, int codigo)
	{
		for(int i = 0; i < servi�os.size(); i++)
		{
			if(servi�os.get(i).getNome() == nome && servi�os.get(i).getCodigo() == codigo)
			{
				return i;
			}
		}
		return -1;
		
	}
	public void AdicionarServi�o(String LOGINuser, String nome, int codigo, int empresa, double pre�o)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 ||  funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pro = BuscarServi�o(nome, codigo);
			if(pro == -1) //se nao existir servi�o
			{
				servi�os.add(new SERVI�O(codigo, nome, empresa, pre�o));
			}else
			{
				//servi�o ja existe
			}
		}else
		{
			//sem permissao
		}
	}
	public void RemoverServi�o(String nome, int codigo, String USERlogin)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
		   		int p = BuscarServi�o(nome, codigo);
				if(p != -1) //se o servi�o existir
				{
					servi�os.remove(p);
				}else
				{
					//s� ocorre se o produto nao existir > mandar msg de erro
				}
		}else
		{
			//nao pode remover, msg de erro
		}
	
	}
	public void EditarNomeServi�o(String NovoNome, int codigo, String USERlogin, String NomeAntigo)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = BuscarServi�o(NomeAntigo, codigo);
			if(pt != -1) //produto existir
			{
			servi�os.get(pt).setNome(NovoNome);
			}else
			{
				//msg de erro, produto n existe
			}
			
			
		}else
		{
			//msg de erro, nao pode editar produtos
		}
	}
	public void EditarPre�oServi�o(double NovoPre�o, int codigo, String USERlogin, String nome)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = BuscarServi�o(nome, codigo);
			if(pt != -1)
			{
			servi�os.get(pt).setPre�o(NovoPre�o);
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
			return -2; // retornar� -2 sempre que for o dono
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
	public void CadastrarFuncionario(String login, char[] senha, int empresa, String nome, boolean produto, boolean servi�o, boolean adicionarProdutos,
			boolean adicionarFuncionarios, int codigo, String LOGINuser)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
		funcionarios.add(new FUNCION�RIOS(login, senha, empresa, nome, produto, servi�o, adicionarProdutos,
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
				//funcionario � o dono
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
				//funcionario nao existe ou � o dono
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
				//opera��o invalida
			}
		}else
		{
			//sem permissao
		}
	}
	public void EditarFuncionarioServi�o(String LOGINuser, String nome, int codigo, boolean servi�o)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarFuncionarios() == true)
		{
			int indice = buscarFuncionario(nome, codigo);
			if(indice != -2 && indice != -1)
				
			{
				funcionarios.get(indice).setVenderServi�o(servi�o);
			}else {
				//opera�ao invalida
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
	
	public void CadastrarProdutos(String nome, int empresa, int codigo, double pre�o, int quantidade, String LOGINuser)
	{
		int analisar = buscarFuncionario(LOGINuser);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
		int p = buscarProduto(nome, codigo);
		
		if(p == -1) //s� vai adicionar se nao houve nome e codigo iguais
		{
		produto.add(new PRODUTOS(nome, empresa, codigo, pre�o, quantidade));
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
					//s� ocorre se o produto nao existir > mandar msg de erro
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
	public void EditarPre�oProduto(double NovoPre�o, int codigo, String USERlogin, String nome)
	{
		int analisar = buscarFuncionario(USERlogin);
		if(analisar == -2 || funcionarios.get(analisar).isGerenciarProdutos() == true)
		{
			int pt = buscarProduto(nome, codigo);
			if(pt != -1)
			{
			produto.get(pt).setPre�o(NovoPre�o);
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
	public ArrayList<FUNCION�RIOS> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<FUNCION�RIOS> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public DONO getDono() {
		return dono;
	}
	public void setDono(DONO dono) {
		this.dono = dono;
	}
	public ArrayList<SERVI�O> getServi�os() {
		return servi�os;
	}
	public void setServi�os(ArrayList<SERVI�O> servi�os) {
		this.servi�os = servi�os;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
