package es.grupostudium.Practica6;

public class Coche {
	private String matricula;
	private String motor;
	private String modelo;
	private String fabricante;

	public Coche() {
		matricula = "";
		motor = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		motor = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		String textoMetodo1 = "El coche con matricula ";
		if (motor == "Gasolina") {
			resultado += textoMetodo1 + matricula + " ";
			resultado += metodoGasolina(modelo, fabricante);
		} else if (motor == "Diesel") {
			resultado += textoMetodo1 + matricula + " ";
			resultado += metodoDiesel(modelo, fabricante);
		} else if (motor == "Híbrido") {
			resultado += textoMetodo1 + matricula + " ";
			resultado += metodoHibrido(modelo, fabricante);
		} else {
			resultado += textoMetodo1 + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

}
