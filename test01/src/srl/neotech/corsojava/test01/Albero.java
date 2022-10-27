package srl.neotech.corsojava.test01;

public class Albero {

	public int eta;
	public int altezza;
	public int diametro;
	public boolean fruttifero;
	public int frutti;
	
	public String calcoloFrutti () {
		String tipoAlberoFruttifero=null;
		fruttifero=true;
		if(frutti==0) tipoAlberoFruttifero="non e' fruttifero";
		if(frutti>=1) tipoAlberoFruttifero="e' fruttifero";
		return tipoAlberoFruttifero;
		
	}
	public String calcoloAltezzaAlbero() {
		String tipoAlberoRestituito=null;
		if(altezza<=2&&frutti>=1) tipoAlberoRestituito="si puo' raccogliere a mano";
		if(altezza<=2&&frutti==0) tipoAlberoRestituito="non puo' raccogliere a mano";
		return tipoAlberoRestituito;
		
		

	}
	
	
	
}
