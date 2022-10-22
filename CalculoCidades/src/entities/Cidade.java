package entities;

public class Cidade {
	
	protected int codigo;
	private int numeroAcidentes;
	private int veiculosPasseio;
	
	
	public Cidade(int codigo, int veiculosPasseio, int numeroAcidentes) {
		this.codigo = codigo;
		this.numeroAcidentes = numeroAcidentes;
		this.veiculosPasseio = veiculosPasseio;
		
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getNumeroAcidentes() {
		return numeroAcidentes;
	}


	public void setNumeroAcidentes(int numeroAcidentes) {
		this.numeroAcidentes = numeroAcidentes;
	}


	public int getVeiculosPasseio() {
		return veiculosPasseio;
	}


	public void setVeiculosPasseio(int veiculosPasseio) {
		this.veiculosPasseio = veiculosPasseio;
	}
	
	
	

	@Override
	public String toString() {
		return "Cidade [codigo=" + codigo + ", numeroAcidentes=" + numeroAcidentes + ", veiculosPasseio="
				+ veiculosPasseio + "]";
	}

}
