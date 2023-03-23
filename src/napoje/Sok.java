package napoje;

public class Sok extends Napoje{
    private String Marka;
    private String smak;
    private int pojemnosc_butelki_ml;

    public Sok( String marka, String smak, int pojemnosc_butelki_ml) {
        Marka = marka;
        this.smak = smak;
        this.pojemnosc_butelki_ml = pojemnosc_butelki_ml;
    }


    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getSmak() {
        return smak;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public int getPojemnosc_butelki_ml() {
        return pojemnosc_butelki_ml;
    }

    public void setPojemnosc_butelki_ml(int pojemnosc_butelki_ml) {
        this.pojemnosc_butelki_ml = pojemnosc_butelki_ml;
    }

    public void pij(int ilepic){
        int pozostałość = getPojemnosc_butelki_ml()-ilepic;
        System.out.println("W butelce zostało od " +getMarka()+ getSmak() + "zostało: " + pozostałość + "ml" );
    }

    @Override
    public String toString() {
        return "Sok{" +
                "Marka= '" + Marka + '\'' +
                ", smak= '" + smak + '\'' +
                ", pojemnosc_butelki_ml= " + pojemnosc_butelki_ml +
                '}';
    }
}
