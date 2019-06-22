package clases;

public class Auto extends Vehiculo {
	private int cantidadPuertas;

	public Auto(String marca, String modelo, Double precio, int cantidadPuertas) {
		super(marca, modelo, precio);
		this.cantidadPuertas = cantidadPuertas;
	}

	public int getCantidadPuertas() {
		return this.cantidadPuertas;
	}

	public void setCantidadPuertas(int puertas) {
		this.cantidadPuertas = puertas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: "
				+ this.getCantidadPuertas() + " // Precio: $" + super.getPrecio());
	}

}
