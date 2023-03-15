public class Main {
    public static void main(String[] args) {

        // BMI arvutus
    Bmi bodymas =new Bmi(82, 183, 1.83);

        // BMI hinnang
    String hinnang = bodymas.BMI_hinnang(bodymas.BMI);
    System.out.print("Su BMI on: " + String.format("%.2f", bodymas.BMI) + " - " + hinnang + "\r\n");



    }

}





