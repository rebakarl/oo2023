import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        // BMI arvutus
        double kehakaal = 82;
        double pikkus = 182;
        double pikkus_m = pikkus / 100;
        double BMI = getBmi(kehakaal, pikkus_m);

        // BMI hinnang
        String hinnang = BMI_hinnang(BMI);
        System.out.print("Su BMI on: " + String.format("%.2f", BMI) + " - " + hinnang + "\r\n");

        // Halbade sõnade põrsakassa
        double mitu_korda = 10;
        double korra_tasu=0.5;
        double summa=0;
        double p2eva_summa=p2eva_sum(mitu_korda,korra_tasu,summa);

        System.out.println("Täna pead põrsakassasse panema: "+p2eva_summa+"€.");

    }

    private static double p2eva_sum(double mitu_korda, double korra_tasu, double summa) {
        for (int i = 0; i < mitu_korda; i++) {
            double tasu=i* korra_tasu;
            summa = summa +tasu;
        }
        return summa;
    }


    private static double getBmi(double kehakaal, double pikkus_m) {
        return kehakaal /(pikkus_m * pikkus_m);
    }

    private static String BMI_hinnang(double BMI) {
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

