
public class Laiva {
	/*ATTRIBUUTIT:
	 * Nimi ja taulukko ruutuja.*/
	private String nimi;
	private Ruutu[] ruudut;
	
	
	/*Konstruktori*/
	public Laiva(String nimi, int n){
		this.nimi = nimi;
		ruudut = new Ruutu[n];
	}
}
