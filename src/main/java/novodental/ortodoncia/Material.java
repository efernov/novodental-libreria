package novodental.ortodoncia;

public abstract class Material {
	
	private int id;
	private float precio;
	
	
	public Material(int id, float precio) {
		super();
		this.id = id;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", precio=" + precio + "]";
	}

	
	
	

}
