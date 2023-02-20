package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos ;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados=0;
	
	
	int cantidadAsientos() {
		int cant = 0;
		for(int i =0;i<20;i++) {
			if (this.asientos[i] != null) {
				cant++;
			}
		}
		return cant;
		
		
	}
	String verificarIntegridad() {
		String msg;
		if(this.registro != this.motor.registro) {
			msg = "Las piezas no son originales";
			return msg;
		}
		
		
		for(int i =0;i<20;i++) {
			if (this.asientos[i] != null) {
				if(this.asientos[i].registro!= this.registro) {
					msg = "Las piezas no son originales";
					return msg;
				}
			}
		}
		msg = "Auto original";
		return msg;

	}
	
}
