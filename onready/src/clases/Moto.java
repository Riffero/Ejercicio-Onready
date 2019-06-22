package clases;

public class Moto extends Vehiculo {
	private String cilindradas;

	public Moto(String marca, String modelo, Double precio, String cilindradas) {
		super(marca, modelo, precio);
		this.cilindradas = cilindradas;
	}

	public String getCilindradas() {
		return this.cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Cilindradas: "
				+ this.getCilindradas() + " // Precio: $" + super.getPrecio());

	}

}
