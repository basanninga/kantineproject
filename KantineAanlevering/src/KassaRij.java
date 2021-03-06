import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {

    private ArrayList<Dienblad> rij;

    /**
     * Constructor
     */
    public KassaRij() {
        // method body omitted
        rij = new ArrayList<Dienblad>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        // method body omitted
        rij.add(klant);


    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        // method body omitted
        if(rij.size() == 0)
        {
            return null;
        }
        else
        {

            Dienblad eerste = rij.get(0);

            rij.remove(0);
            return eerste;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        // method body omitted

        return(rij.size() > 0);
    }
}