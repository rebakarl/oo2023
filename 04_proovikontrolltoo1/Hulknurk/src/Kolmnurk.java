import java.util.List;

public class Kolmnurk {

    List<Double> xCoordinate; //x koordinaadi list
    List<Double> yCoordinate;  // y koordinaadi list

    //konstruktor
    public Kolmnurk(List<Double> xCoordinate, List<Double> yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //funktsioon koordinaatide lisamiseks
    public double lisaJaAnnaYmberm66t(double newX, double newY){
        xCoordinate.add(newX);
        yCoordinate.add(newY);
        return 2.0;
    }



}
