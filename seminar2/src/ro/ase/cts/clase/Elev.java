package ro.ase.cts.clase;


import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String numeTutore;
	private static float sumaFinantata=30;

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getNumeTutore() {
		return numeTutore;
	}

	public void setNumeTutore(String numeTutore) {
		this.numeTutore = numeTutore;
	}

	@Override
	public String toString() {
		return super.toString()+ "Clasa=" + clasa + ", Tutore=" + numeTutore;
	}
	
	public Elev() {
		super();
	}

	@Override
	public float getFinantare() {
		return sumaFinantata;
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String numeTutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.numeTutore = numeTutore;
	}
	

	
}
