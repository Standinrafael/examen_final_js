package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avion {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_avion")
	@SequenceGenerator(name="seq_avion",sequenceName="seq_avion",allocationSize=1)
	@Column(name="avio_id")
	private Integer id;
	
	@Column(name="avio_capacidad_asientos")
	private Integer capacidadAsientos;
	
	@Column(name="avio_nombre")
	private String nombre;
	
	@OneToMany(mappedBy="avion")
	private List<Vuelo> vuelos;

	// Metodos GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	//To String
	@Override
	public String toString() {
		return "Avion [id=" + id + ", capacidadAsientos=" + capacidadAsientos + ", nombre=" + nombre +  "]";
	}
	
	
	
}
