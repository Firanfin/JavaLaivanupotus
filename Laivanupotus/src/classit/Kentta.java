package classit;

//Pit�isik� t�m�n olla interface juttu, niin voisi k�ytt�� tykiss�?
public class Kentta{
  private Ruutu[][] kentta;
  
  public Kentta(){
    kentta = new Ruutu[10][10];
  }
  
  //getterit ja setterit
  public void setKentta(Ruutu[][] kentta){
    this.kentta = kentta;
  }
  public Ruutu[][] getKentta(){
    return kentta;
  }
  
  public void addRuutu (Ruutu ruutu, int eka, int toka){
    kentta[eka][toka] = ruutu;
  }
  
  public void Ammu(int numero, char kirjain) /*throws JoAmmuttu, VirheellinenKoordinaatti*/{
	  int tokaindeksi = (int)kirjain - (int)'A' - 1;
	  if (kentta[numero][tokaindeksi].getTila() == RuudunTila.OSUTTU){
		  //throw new JoAmmuttu();
	  }
	  if(kentta[numero][tokaindeksi].getTyyppi() == RuutuTyyppi.LAIVA){
		  //Piirret��n laivaruutu
		  kentta[numero][tokaindeksi].setTila(RuudunTila.OSUTTU);
	  }
	  else if(kentta[numero][tokaindeksi].getTyyppi() == RuutuTyyppi.MERI){
		  //Piirret��n meriruutu
		  kentta[numero][tokaindeksi].setTila(RuudunTila.OSUTTU);
	  }
  }
    
}