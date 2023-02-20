package Prueba;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[20];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados=0;
	

	public Auto(String string, int i, Motor motor1, String string2, Asiento asien1[], int j) {
		this.modelo = string;
		this.precio = i;
		this.motor = motor1;
		this.asientos = asien1;
		this.marca = string2;
		this.registro = j;
		Auto.cantidadCreados = Auto.cantidadCreados +1;
		
	}
	
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
