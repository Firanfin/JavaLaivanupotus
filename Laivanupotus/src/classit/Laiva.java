package classit;

public class Laiva{
  enum LaivanTyyppi{
    JOLLA,TIEDUSTELUALUS,SUKELLUSVENE,TAISTELUALUS,LENTOTUKIALUS
  }
  Ruutu[] laiva;
  LaivanTyyppi tyyppi;
  
  public Laiva(LaivanTyyppi tyyppi, int pituus){
	  this.tyyppi = tyyppi;
	  laiva = new Ruutu[pituus];
  }
}