package texto;

public class PRODUTOS {
	private String nome;
	private int empresa;
	private int codigo;
	private double pre�o;
	private int quantidade;
	public PRODUTOS(String nome, int empresa, int codigo, double pre�o, int quantidade) {
		super();
		this.nome = nome;
		this.empresa = empresa;
		this.codigo = codigo;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
