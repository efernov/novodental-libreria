package novodental.ortodoncia;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class Ortodoncia {
	
	private int id;
	private String tipoTrabajo;
	private Instant fechaEntrada;
	private LocalDate fechaSalida;
	private float importeOrtodoncia;
	private List<Material> materiales;
	
	public Ortodoncia() {
		super();
	}

	public Ortodoncia(int id, String tipoTrabajo, Instant fechaEntrada, LocalDate fechaSalida, float importeOrtodoncia,
			List<Material> materiales) {
		super();
		this.id = id;
		this.tipoTrabajo = tipoTrabajo;
		this.fechaEntrada = Instant.now();
		this.fechaSalida = fechaSalida;
		this.importeOrtodoncia = importeOrtodoncia;
		this.materiales = materiales;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(String tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	public Instant getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Instant fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public float getImporteOrtodoncia() {
		return importeOrtodoncia;
	}

	public void setImporteOrtodoncia(float importeOrtodoncia) {
		this.importeOrtodoncia = importeOrtodoncia;
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	@Override
	public String toString() {
		return "Ortodoncia [id=" + id + ", tipoTrabajo=" + tipoTrabajo + ", fechaEntrada=" + fechaEntrada
				+ ", fechaSalida=" + fechaSalida + ", importeOrtodoncia=" + importeOrtodoncia + ", materiales="
				+ materiales + "]";
	}
	
	

}
