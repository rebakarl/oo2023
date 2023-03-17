import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //private v public (kas saab väljaspool antud file kasutada, klassis/mainis vms)

        //funktsiooni väljakutsumine // 3 arvu aritmeetiline keskmine leidmine
        System.out.println(aritmkeskmine(3,4,5));
        System.out.println(aritmkeskmine(4,5,6));

        // funktsiooni väljakutsumine;          ^ Arrays tuleb importida ^
        double[] sisend={3,4,5,6};
        System.out.println(Arrays.toString(libisevkeskmine(sisend)));

        // klassi väljakutsumine
        LibisevKeskmine libisev = new LibisevKeskmine(2,3,4);
        libisev.lisaArv(5);
        System.out.println(libisev.arvudKeskmisega);
        libisev.lisaArv(6);
        libisev.lisaArv(7);
        System.out.println(libisev.arvudKeskmisega);
    }
    //funktsioonid
    //aritm keskmine
        private static double aritmkeskmine (double nr1,double nr2, double nr3) {
            return ((nr1+nr2+nr3)/3);
        }
    //libisev keskmine
    private static double[]  libisevkeskmine (double[] arvud) {
        double[] valjund= new double[arvud.length-2];
        for (int i = 0;i < arvud.length-2; i++) {
        valjund[i]=(arvud[i]+arvud[i+1]+arvud[i+2])/3.0;

        }
        return valjund;
    }
    
    //List numbriteList = new ArrayList <----- manipuleeritav (juurde, vähemaks, järjekorda vms)
    // List<Double> sisend=new ArrayList(Arrats.asList(3,4,5,6,6)); <-- sellega rohkem importimist
    // numbriteList[] <----- read only
}