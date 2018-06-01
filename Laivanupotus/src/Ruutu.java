
public class Ruutu {
	/*ATTRIBUUTIT:
	 * Ruudun koordinaatit*/
	private int xKoordinaatti;
	private int yKoordinaatti;
	
	/*Tieto siit�, onko ruutuun ammuttu.*/
	private boolean osuma;
	
	/*Konstruktorit: Ensimm�inen ei ota parametrej� ja luo n�in origon
	 *  toinen saa parametreina ruudun koordinaatit.*/
	public Ruutu(){
		xKoordinaatti = 0;
		yKoordinaatti = 0;
		osuma = false;
	}
	public Ruutu(int x, int y){
		xKoordinaatti = x;
		yKoordinaatti = y;
		osuma = false;
	}
	/*Setterit ja getterit*/
	public void setX(int x){
		xKoordinaatti = x;
	}
	public void setY(int y){
		yKoordinaatti = y;
	}
	public int getX(){
		return xKoordinaatti;
	}
	public int getY(){
		return yKoordinaatti;
	}
	public void setOsuma(){
		osuma = true;
	}
	public boolean getOsuma(){
		return osuma;
	}
	
}
