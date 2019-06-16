/**
 * Coches
 * 
 * @author Richard Castaño
 * @version 16.06.2019
 */
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
	/**
	 * Constructor por parametros
	 * 
	 * @param m matricula: matricula del coche.
	 * @param c motor: tipo de motor.
	 * @param mo modelo: nombre del modelo del coche.
	 * @param f fabricante: empresa fabricante del coche.
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		motor = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * Dependiendo del tipo de motor mostrará una de las cadenas
	 * @return Devuelve una cadena que contiene el modelo y el fabricante, en caso de existir.
	 */
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
	/**
	 * 
	 * @param modelo2 nombre del modelo del coche.
	 * @param fabricante2 nombre del fabricante del coche.
	 * @return Una cadena incluyendo el modelo y el fabricante.
	 */
	private String metodoHibrido(String modelo2, String fabricante2) {

		return "Es un " + modelo2 + fabricante2 + "y no necesita combustible";
	}
	/**
	 * 
	 * @param modelo2 nombre del modelo del coche.
	 * @param fabricante2 nombre del fabricante del coche.
	 * @return Una cadena incluyendo el modelo y el fabricante.
	 */
	private String metodoDiesel(String modelo2, String fabricante2) {

		return "Es un " + modelo2 + fabricante2 + "y gasta 1,052 euros por litro";
	}
	/**
	 * 
	 * @param modelo2 nombre del modelo del coche.
	 * @param fabricante2 nombre del fabricante del coche.
	 * @return Una cadena incluyendo el modelo y el fabricante.
	 */
	private String metodoGasolina(String modelo2, String fabricante2) {

		return "Es un " + modelo2 + fabricante2 + "y gasta 1,337 euros por litro";
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
