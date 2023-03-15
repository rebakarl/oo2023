public class Bmi {
    double kehakaal;
    double pikkus;
    double pikkus_m;
    double BMI;

    public Bmi(double kehakaal, double pikkus, double pikkus_m){
       this.kehakaal=82;
       this.pikkus=182;
       this.pikkus_m=1.82;
       this.BMI=getBmi(kehakaal, pikkus_m);
    }
    public double getBmi(double kehakaal, double pikkus_m) {
        return kehakaal /(pikkus_m * pikkus_m);
    }

    public String BMI_hinnang(double BMI) {
        if (BMI <18.5) {
            return "oled alakaalus.";
        } else if (BMI <24.9) {
            return "oled normaalkaalus.";
        } else if (BMI <29.9) {
            return "oled ülekaalus.";
        } else {
            return "oled kõvasti ülekaalus.";
        }

}
}

