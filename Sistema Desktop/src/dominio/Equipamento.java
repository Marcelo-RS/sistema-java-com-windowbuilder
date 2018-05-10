package dominio;

public class Equipamento {
	
	private String nome;
	private int limiteConsumo;
	private int consumo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLimiteConsumo() {
		return limiteConsumo;
	}
	public void setLimiteConsumo(int limiteConsumo) {
		this.limiteConsumo = limiteConsumo;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}	
}
