import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        // HARMOONILINE KESKMINE //

        // 1. punkt - 2km lõikude keskmised kiirused
        System.out.println("1. punkt - lahendus: "+kaheKMkeskminekiirus(10.0, 20.0));

        // 2 punkt - 1 km keskmine kiirus (kui antud kiirused kokkuliidetuna) ja korrad
        System.out.println("2. punkt - esimene lahendus: "+yheKMkeskminekiirus(200, 5));

        // 2. punkt kui kiirused on antud listina sisse
        ArrayList<Double> kiirused2 = new ArrayList<>(Arrays.asList(10.0,20.0,30.0,40.0,50.0));
        double keskminekiirus = YheKMkeskmineKiirusEraldi(kiirused2);
        System.out.println("2. punkt - teine lahendus (Arrayga): " + keskminekiirus);

        // 3. punkt
        //Faili sisselugemine
        BufferedReader br= new BufferedReader(new FileReader("sisselugemine.txt"));
        String rida = br.readLine();

        //tühjad väärtused tsükli jaoks
        Double kogusum3=0.0;
        Double kiirused3=0.0;

        //arvutus
        while(rida !=null){
            double reav22rtus= Double.parseDouble(rida);
            kogusum3+=reav22rtus;
            kiirused3+=1;
            rida=br.readLine();
        }
        // Faili kirjutamine
        PrintWriter pw = new PrintWriter(new FileWriter("keskmine.txt"));
        pw.print(kogusum3 / kiirused3);
        pw.close();

    }
    // 1 punkt - funktsioon - kahe kiiruse keskmise leidmiseks
    public static double kaheKMkeskminekiirus(double kmH1, double kmH2){
        return ((kmH1+kmH2)/2);
    }

    // 2 punkt- funktsioon - kilomeetriste lõikude keskmine kiirus (antakse kõik keskmised kokkuliidetuna)
    public static double yheKMkeskminekiirus (double kiirused, double korrad) {
        return (kiirused/korrad);
        }

    // 2 punkt - funktsioon - kilomeetriste lõikude keskmne kiirus (antakse kiirused eraldi)
    public static double YheKMkeskmineKiirusEraldi(ArrayList<Double> kiirused2) {
        double kiirustesumma = 0.0;
        for (double kiirus2 : kiirused2) {
            kiirustesumma += kiirus2;
        }
        double keskmine2 = kiirustesumma / kiirused2.size();
        return keskmine2;
        }
}



