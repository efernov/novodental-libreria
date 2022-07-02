package novodental.ortodoncia;

public class Ortodoncia {
	

	private String tipoTrabajo;
	
	private float importeOrtodoncia;
	
	public Ortodoncia() {
		super();
	}
	
	
	public String getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(String tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	

	public float getImporteOrtodoncia() {
		return importeOrtodoncia;
	}

	public void setImporteOrtodoncia(float importeOrtodoncia) {
		this.importeOrtodoncia = importeOrtodoncia;
	}


	@Override
	public String toString() {
		return "Ortodoncia [tipoTrabajo=" + tipoTrabajo + ",  importeOrtodoncia=" + importeOrtodoncia + "]";
	}
	
	

}
