package onready;

import clases.Concesionario;

public class Principal {

	public static void main(String[] args) {
		Concesionario con = new Concesionario();
		
		//Carga de datos
		con.cargaDatos();
		
		con.listarVehiculos(con.getListaVehiculos());
		
		System.out.println("=============================");
		
		con.vehiculoMasYMenosCaro();
		
		con.buscarModeloPorLetra(con.getListaVehiculos());
		
		System.out.println("=============================");
		
		con.ordernarPorPrecio(con.getListaVehiculos());;

		
	}

}
