package ejercicio04;

public class Reloj {
	String marca;
	boolean digital;
	
	double precio;
	public Reloj() {
		marca="Casio G-shock";
		digital=false;
		
		precio=299.00;
	}
	  public String Tipo() {
	        return digital ? "digital" : "analógico";
	    }
	
}
