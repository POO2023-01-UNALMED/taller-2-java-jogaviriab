package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsiento(){
		
	}

	String verificarIntegridad() {
		if(this.registro == this.motor.registro && this.registro == this.asientos.registro ) {
			System.out.println("Auto original");
		}else {
			System.out.println("Las piezas no son originales");
		}
	}
}
