package clases;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private Double precio;

	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	// metodo a implementar en las clases hijas
	public abstract void mostrarDatos();
}
