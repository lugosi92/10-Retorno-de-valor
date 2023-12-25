
public class Transporte {
	
	//Atribiuto
	int precio = 0;
	
	public Transporte(int precio) {
		System.out.println("Se creo un objeto transporte");
		this.precio = precio;
		
	}
	
	public int precio() {
		//instrucciones que devuelven un valor
		return this.precio;
	}
}
