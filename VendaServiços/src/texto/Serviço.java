package texto;

public class Serviço {
	private int codigo;
	private String nome;
	private int empresa;
	private double preço;
	public Serviço(int codigo, String nome, int empresa, double preço) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.empresa = empresa;
		this.preço = preço;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	

}
