public class Persoon {

    public int BSN;
    public String voornaam;
    public String achternaam;
    public Datum geboortDatum;
    public char geslacht;


    public Persoon(int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
        setBSN(BSN);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeslacht(geslacht);

        geboortDatum = new Datum(dag,maand,jaar);

    }


    public Persoon() {
        this.BSN = 0;
        this.voornaam = "";
        this.achternaam = "";
        this.geslacht = 'X';

        geboortDatum = new Datum(0, 0, 0);

    }


    public void getGeboortDatum() {
        geboortDatum.getDatumAsString();
    }

    public void setGeboortDatum(Datum geboortDatum) {
        this.geboortDatum = geboortDatum;
    }

    public String getGeslacht() {
        if(geslacht == 'M' || geslacht == 'm'){
            return "Man";
        }
        else if(geslacht == 'V' || geslacht == 'v'){
            return "Vrouw";
        } else {
            return "Onbekend";
        }

    }

    public int getBSN() {
        return BSN;
    }

    public void setBSN(int BSN) {
        this.BSN = BSN;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setGeslacht(char geslacht) {
        if(geslacht == 'M' || geslacht == 'm' || geslacht == 'V' || geslacht == 'v'){
            this.geslacht = geslacht;
        } else{
            this.geslacht = 'X';
        }

    }

    public String toString() {
        return "Persoon{" +
                "BSN=" + BSN +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortDatum=" + geboortDatum +
                ", geslacht=" + geslacht +
                '}';
    }

}
