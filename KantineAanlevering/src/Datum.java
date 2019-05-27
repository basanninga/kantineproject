import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	boolean check;

	  /**
	   * Constructor
	   */
	public Datum(int dag, int maand, int jaar){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;

		bestaatDatum(dag,maand,jaar);

		if(!check){
			setDag(0);
			setMaand(0);
			setJaar(0);
		}

	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public boolean bestaatDatum(int dag, int maand, int jaar) {

		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		format.setLenient(false);

		String date = Integer.toString(dag) + "-" + Integer.toString(maand) + "-" + Integer.toString(jaar);
		try {
			format.parse(date);
			check = true;
		} catch (ParseException e) {
			check = false;
		}

		return check;
	}
	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		String datum = Integer.toString(dag) + "-" + Integer.toString(maand) + "-" + Integer.toString(jaar);
		return datum;
		}
}
