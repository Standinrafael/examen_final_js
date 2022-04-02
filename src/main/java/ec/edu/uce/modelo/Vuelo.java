package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_vuelo")
	@SequenceGenerator(name="seq_vuelo",sequenceName="seq_vuelo",allocationSize=1)
	@Column(name="vuel_id")
	private Integer id;
	
	@Column(name="vuel_numero")
	private String numero;
	
	@Column(name="vuel_fecha_vuelo", columnDefinition="TIMESTAMP")
	private LocalDateTime fechaVuelo;
	
	@Column(name="vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	
	@Column(name="vuel_asientos_ocupados")
	private Integer asientosOcupados;
	
	@Column(name="vuel_valor_asiento")
	private BigDecimal valorAsiento;
	
	@Column(name="vuel_estado")
	private String estado;
	
	@Column(name="vuel_origen")
	private String origen;
	
	@Column(name="vuel_destino")
	private String destino;
	
	@Column(name="vuel_categoria")
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name="avio_id")
	private Avion avion;
	
	@OneToMany(mappedBy="vuelo")
	 private List<CompraPasaje> compras;

	
	//Metodos GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public Integer getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(Integer asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<CompraPasaje> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraPasaje> compras) {
		this.compras = compras;
	}

	//To String
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", numero=" + numero + ", fechaVuelo=" + fechaVuelo + ", asientosDisponibles="
				+ asientosDisponibles + ", asientosOcupados=" + asientosOcupados + ", valorAsiento=" + valorAsiento
				+ ", esatado=" + estado + ", origen=" + origen + ", destino=" + destino + ", categoria=" + categoria
				+ "]";
	}
	
	

}
