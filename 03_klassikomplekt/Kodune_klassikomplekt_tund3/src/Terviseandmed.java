public class Terviseandmed {

    double pikkus_cm;
    double kaal_kg;
    int pihaymberm66t;
    double pikkus_m;

    // konstruktor
    public Terviseandmed(double pikkus_cm, double kaal_kg, int pihaymberm66t) {
        this.pikkus_cm = pikkus_cm;
        this.kaal_kg = kaal_kg;
        this.pihaymberm66t = pihaymberm66t;
        this.pikkus_m=pikkus_cm/100;
    }

    //Bmi arvutaja
    public double getBmi(double kehakaal, double pikkus_m){
        return kehakaal/(pikkus_m*pikkus_m);
    }

    public double getPikkus_cm(){
        return pikkus_cm;
    }
    public double getKaal_kg(){
        return kaal_kg;
    }
    public int getPihaymberm66t(){
        return pihaymberm66t;
    }

    public double pikkus_cm() {
    return pikkus_cm;
    }
}
