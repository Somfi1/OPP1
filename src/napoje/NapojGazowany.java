package napoje;

public class NapojGazowany extends Napoje{
    private String nazwa;
    private String marka;
    private int pojemnosc_butelki_ml;

    public NapojGazowany(String nazwa, String marka, int pojemnosc_butelki_ml) {
        this.nazwa = nazwa;
        this.marka = marka;
        this.pojemnosc_butelki_ml = pojemnosc_butelki_ml;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPojemnosc_butelki_ml() {
        return pojemnosc_butelki_ml;
    }

    public void setPojemnosc_butelki_ml(int pojemnosc_butelki_ml) {
        this.pojemnosc_butelki_ml = pojemnosc_butelki_ml;
    }

    public void pij(int ilepic){
        int pozostałość = getPojemnosc_butelki_ml()-ilepic;
        System.out.println("W butelce zostało od " +getNazwa() + "zostało: " + pozostałość + "ml" );
    }

    @Override
    public String toString() {
        return "NapojGazowany{" +
                "nazwa= '" + nazwa + '\'' +
                ", marka= '" + marka + '\'' +
                ", pojemnosc_butelki_ml= " + pojemnosc_butelki_ml +
                '}';
    }
}
