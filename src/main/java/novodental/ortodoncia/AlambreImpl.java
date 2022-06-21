package novodental.ortodoncia;

public class AlambreImpl extends Material implements Alambre {
	
	private float diametroMilimetro;
	private int longitudCentimetro;
	
	public AlambreImpl() {
		super();
	}
	

	public AlambreImpl(int id, float precio, float diametroMilimetro, int longitudCentimetro) {
		super(id, precio);
		this.diametroMilimetro = diametroMilimetro;
		this.longitudCentimetro = longitudCentimetro;
	}

	@Override
	public float getDiametroMilimetro() {
		return diametroMilimetro;
	}

	@Override
	public void setDiametroMilimetro(float diametroMilimetro) {
		this.diametroMilimetro = diametroMilimetro;
	}

	@Override
	public int getLongitudCentimetro() {
		return longitudCentimetro;
	}

	@Override
	public void setLongitudCentimetro(int longitudCentimetro) {
		this.longitudCentimetro = longitudCentimetro;
	}

	@Override
	public String toString() {
		return "Alambre [diametroMilimetro=" + diametroMilimetro + ", longitudCentimetro=" + longitudCentimetro + "]";
	}
	
	

}
