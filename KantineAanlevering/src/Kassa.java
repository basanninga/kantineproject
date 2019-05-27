import java.util.Iterator;

public class Kassa {

    private KassaRij kassarij;
    private int verkochteArtiklen;
    private double inKassa;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        // method body omitted
        this.kassarij = kassarij;
        verkochteArtiklen = 0;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        // method body omitted

        int aantalArtikelen = klant.getAantalArtikelen();
        double totaalPrijs = klant.getTotaalPrijs();
        double totaal = aantalArtikelen + totaalPrijs;
        verkochteArtiklen += aantalArtikelen;
        inKassa += totaalPrijs;


    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        // method body omitted
        return verkochteArtiklen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        // method body omitted
        return inKassa;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        // method body omitted
        verkochteArtiklen = 0;
        inKassa = 0;
    }
}