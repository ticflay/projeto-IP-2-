package texto;

public class Servi�o {
	private int codigo;
	private String nome;
	private int empresa;
	private double pre�o;
	public Servi�o(int codigo, String nome, int empresa, double pre�o) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.empresa = empresa;
		this.pre�o = pre�o;
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
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	

}
