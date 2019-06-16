package es.grupostudium.Practica6;

public class Moto {
	private String matricula;
	private int cilindrada;

	public Moto() {
		matricula = "";
		cilindrada = 0;
	}
	/**
	 * 
	 * @param m matricula: matricula de la moto.
	 * @param c cilindrada: Nos dice la cilindrada que tiene la moto.
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
