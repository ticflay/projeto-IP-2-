package texto;

public class PRODUTOS {
	private String nome;
	private int empresa;
	private int codigo;
	private double preço;
	private int quantidade;
	public PRODUTOS(String nome, int empresa, int codigo, double preço, int quantidade) {
		super();
		this.nome = nome;
		this.empresa = empresa;
		this.codigo = codigo;
		this.preço = preço;
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
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
