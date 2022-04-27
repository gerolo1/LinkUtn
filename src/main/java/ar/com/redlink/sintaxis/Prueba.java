package ar.com.redlink.sintaxis;

public class Prueba {
	
	private int num;

	public Prueba(int i) {
		this.num = i;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int suma(int otro) throws sumarCeroException {
		if(otro == 0) {
			throw new sumarCeroException("No tiene sentido sumar 0");
		}
		return this.num + otro;
	}
	
}
