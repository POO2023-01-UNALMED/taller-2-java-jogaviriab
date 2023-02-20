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
		String msg;
		if(this.registro == this.motor.registro && this.registro == this.asientos.registro ) {
			msg = "Auto original";
		}else {
			msg = "Las piezas no son originales";
		}
		return msg;
	}
}
