package Prueba;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public Motor(int i, String string, int j) {
		this.numeroCilindros = i;
		this.tipo = string;
		this.registro = j;
	}

	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		if (tipo == "electrico"){
			this.tipo = tipo;
		}else if (tipo == "gasolina") {
			this.tipo = tipo;
		}
	}
}
