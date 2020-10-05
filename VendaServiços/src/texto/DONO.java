package texto;

public class DONO{
	private String login;
	private char[] senha;
	
	private String nome;
	
	private int codigo;
	
	public DONO(String login, char[] senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		
		this.nome = nome;
		this.codigo = 0;
		
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
		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	



	
	
	

}
