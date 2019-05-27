import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private ArrayList<Artikel> artikelen;
    private Persoon klant;


    /**
     * Constructor
     */
    public Dienblad() {
        artikelen = new ArrayList<Artikel>();
    }


    public Dienblad(Persoon klant){
        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegArtikelToe(Artikel artikel) {
        artikelen.add(artikel);
    }


    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
       int aantalArtikelen = artikelen.size();

       return aantalArtikelen;
    }


    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        double totaalPrijs = 0;

        for(Artikel artikel : artikelen){
            totaalPrijs += artikel.getPrijs();
        }

        return totaalPrijs;

    }

    public Persoon getKlant() {
        return klant;
    }

    public void setKlant(Persoon klant) {
        this.klant = klant;
    }


}

