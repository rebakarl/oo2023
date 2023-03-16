public class Inimene {
        String nimi;
        String perenimi;
        String vanus;
        String sugu;

        // konstruktor
    public Inimene(String nimi, String perenimi, String vanus, String sugu) {
        this.nimi = nimi;
        this.perenimi = perenimi;
        this.vanus = vanus;
        this.sugu = sugu;
    }

    //funktsioonid

    public String getNimi(){
        return nimi;
    }
    public String getPerenimi(){
        return perenimi;
    }
    public String getVanus(){
        return vanus;
    }
    public String getSugu(){
        return sugu;
    }
}
