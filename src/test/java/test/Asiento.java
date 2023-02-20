package Prueba;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	public Asiento(String string, int i, int j) {
		this.color = string;
		this.precio = i;
		this.registro = j;
	}

	void cambiarColor(String color) {
		if (color == "rojo"){
			this.color = color;
		}else if(color == "verde") {
			this.color = color;
		}else  if(color == "amarillo") {
			this.color = color;
		}else  if(color == "negro") {
			this.color = color;
		}else  if(color == "blanco") {
			this.color = color;
		}
		
	}
}
