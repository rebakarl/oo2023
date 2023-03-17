import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> xCoordinate=new ArrayList<>(Arrays.asList(1.0,2.0,3.0));
        List<Double> yCoordinate=new ArrayList<>(Arrays.asList(1.0,2.0,3.0));

        Kolmnurk kolmnurk =new Kolmnurk(xCoordinate,yCoordinate);

        System.out.println(kolmnurk.xCoordinate);
        System.out.println(kolmnurk.yCoordinate);
    }

}