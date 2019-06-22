package interfaces;

import java.util.ArrayList;

import clases.Vehiculo;

public interface IConcesionario {
	public default void listarVehiculos(ArrayList<Vehiculo> list) {
		list.stream().forEach((obj) -> {
			obj.mostrarDatos();
		});
	}
	public abstract void ordernarPorPrecio(ArrayList<Vehiculo> list);
	public abstract void buscarModeloPorLetra(ArrayList<Vehiculo> list);
}
