package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[20];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados=0;
	
	
	int cantidadAsientos() {
		int cant = 0;
		for(int i =0;i<20;i++) {
		
			if (asientos[i] != null) {
				cant++;
			}
		}
		return cant;
		
		
	}
	String verificarIntegridad() {
		String msg;
		if(registro != motor.registro) {
			msg = "Las piezas no son originales";
			return msg;
		}
		
		
		for(int i =0;i<20;i++) {
			if (asientos[i] != null) {
				if(asientos[i].registro!= registro) {
					msg = "Las piezas no son originales";
					return msg;
				}
			}
		}
		msg = "Auto original";
		return msg;

	}
	
}
