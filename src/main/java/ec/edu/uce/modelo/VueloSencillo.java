package ec.edu.uce.modelo;

public class VueloSencillo {

	private String numero;
	
	private String origen;
	
	private String destino;
	
	private String  categoria;
	
	private String nombreAvion;
	
	private String valorAsiento;
	
	
	public VueloSencillo() {
		
	}


	public VueloSencillo(String numero, String origen, String destino, String categoria, String nombreAvion,
			String valorAsiento) {
		super();
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.categoria = categoria;
		this.nombreAvion = nombreAvion;
		this.valorAsiento = valorAsiento;
	}


	//Metodos GET Y SET
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getNombreAvion() {
		return nombreAvion;
	}


	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}


	public String getValorAsiento() {
		return valorAsiento;
	}


	public void setValorAsiento(String valorAsiento) {
		this.valorAsiento = valorAsiento;
	}


	//TO STRING
	
	@Override
	public String toString() {
		return "VueloSencillo [numero=" + numero + ", origen=" + origen + ", destino=" + destino + ", categoria="
				+ categoria + ", nombreAvion=" + nombreAvion + ", valorAsiento=" + valorAsiento + "]";
	}
	
	
}
