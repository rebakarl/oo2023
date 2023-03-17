import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // HARMOONILINE KESKMINE

        // 2km lõikude keskmised kiirused
        System.out.println(kaheKMkeskminekiirus(10.0,20.0));
        // 2 punkt - 1 km keskmine kiirus (kui antud kiirused kokkuliidetuna) ja korrad
        System.out.println(yheKMkeskminekiirus(200,5));
        // 2. punkt kui kiirused on antud listina sisse
        double[] sisend={20,10,15,40,50};
        System.out.println(Arrays.toString(YheKMkeskmineKiirusEraldi(sisend)));



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
    public static double YheKMkeskmineKiirusEraldi(double[] kiirused){
        for (int i = 0; i < kiirused.length; i++) {
            double kiirusedkokku=kiirusedkokku+kiirused[i];
            double YheKMkesk=kiirusedkokku/kiirused.length;
        }
    } return YheKMkesk;


}
