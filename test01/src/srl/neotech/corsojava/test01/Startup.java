package srl.neotech.corsojava.test01;

public class Startup {
	
	public static void main(String[] args) {
		
		Albero sequoia=new Albero();
		Albero pino=new Albero();
	    sequoia.altezza=5;
	    pino.altezza=1;
	    sequoia.frutti=0;
	    pino.frutti=10;
	    sequoia.calcoloAltezzaAlbero();
	    pino.calcoloAltezzaAlbero();
	    String tipoAlberoSequoia=sequoia.calcoloAltezzaAlbero();
	    String tipoAlberoPino=pino.calcoloAltezzaAlbero();
	    System.out.println("la sequoia: "+tipoAlberoSequoia);
	    System.out.println("il pino: "+tipoAlberoPino);
	    
	    
	}
}
