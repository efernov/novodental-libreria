package novodental.ortodoncia;

public class TornilloImpl extends Material implements Tornillo {
	
	private String direccionApertura;
	private int aperturaMilimetros;
	
	public TornilloImpl() {
		super();
	}
	

	public TornilloImpl(int id, float precio, String direccionApertura, int aperturaMilimetros) {
		super(id, precio);
		this.direccionApertura = direccionApertura;
		this.aperturaMilimetros = aperturaMilimetros;
	}

	@Override
	public String getDireccionApertura() {
		return direccionApertura;
	}

	@Override
	public void setDireccionApertura(String direccionApertura) {
		this.direccionApertura = direccionApertura;
	}

	@Override
	public int getAperturaMilimetros() {
		return aperturaMilimetros;
	}

	@Override
	public void setAperturaMilimetros(int aperturaMilimetros) {
		this.aperturaMilimetros = aperturaMilimetros;
	}

	@Override
	public String toString() {
		return "Tornillo [direccionApertura=" + direccionApertura + ", aperturaMilimetros=" + aperturaMilimetros + "]";
	}
	
	

}
