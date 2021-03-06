package ro.ase.cts.Clase;

//EAGER=> REFERINTA STATICA e obtinuta prin constructor FP: creeare anticipata

//sau un ENUM cu un un sg element

//REGISTRU DE MAI MULTE SINGLETONURI:
//  private static HashMap<String, ConexiuneBD> registruConexiuni = new HashMap<>();

//              singleton => sa nu se apeleze constructorul de mai multe ori ci doar o sg data, aici
public class Parlament {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    //un singur apel, sa nu se apeleze constructorul de mai multe ori ci doar o sg data, aici
    private static Parlament parlament = new Parlament();

    //instanta, care e si statica ... RETURNEZ INSTNTA UNICA, PE CARE O APELEZ DIN MAIN si => singurul ob creat
    public static Parlament getInstance(){
        return parlament;
    }

    //TOTI constructorii privati
    private Parlament() {
        this.tara= "";
        this.nrParlamentari=0;
        this.durataMandat = 0;
        this.denumireSediu="";
    }

    private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parlament{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
