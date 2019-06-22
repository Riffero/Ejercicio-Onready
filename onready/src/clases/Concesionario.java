package clases;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import interfaces.IConcesionario;

public class Concesionario implements IConcesionario {

	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

	public Concesionario() {
	}

	public void cargaDatos() {
		Auto autoA = new Auto("Peugeot", "206", 200000.00, 4);
		Auto autoB = new Auto("Peugeot", "208", 250000.00, 5);
		Moto motoA = new Moto("Honda", "Titan", 60000.00, "125c");
		Moto motoB = new Moto("Yamaha", "YBR", 80500.50, "160c");

		this.addListaVehiculos(autoA);
		this.addListaVehiculos(motoA);
		this.addListaVehiculos(autoB);
		this.addListaVehiculos(motoB);
	}

	public void addListaVehiculos(Vehiculo vehiculo) {
		this.listaVehiculos.add(vehiculo);
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return this.listaVehiculos;
	}

	@Override
	public void ordernarPorPrecio(ArrayList<Vehiculo> list) {

		// ordeno
		list.sort((o1, o2) -> o2.getPrecio().compareTo(o1.getPrecio()));

		// muestro
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		list.stream().forEach((vehiculo) -> {
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
		});
	}

	@Override
	public void buscarModeloPorLetra(ArrayList<Vehiculo> list) {
		Optional<Vehiculo> result = list.stream().filter(vehiculo -> vehiculo.getModelo().contains("Y")).findFirst();
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + result.get().getMarca() + " "
				+ result.get().getModelo() + " $" + result.get().getPrecio());
	}

	public void vehiculoMasYMenosCaro() {
		
		Optional<Vehiculo> resultMax = this.listaVehiculos.stream().max((vehiculoA, vehiculoB) -> vehiculoA.getPrecio().compareTo(vehiculoB.getPrecio()));
		System.out.println("El vehiculo mas caro: "+ resultMax.get().getMarca()+" "+resultMax.get().getModelo());
		
		Optional<Vehiculo> resultMin = this.listaVehiculos.stream().min((vehiculoA, vehiculoB) -> vehiculoA.getPrecio().compareTo(vehiculoB.getPrecio()));
		System.out.println("El vehiculo mas barato: "+ resultMin.get().getMarca()+" "+resultMin.get().getModelo());

	}

}
