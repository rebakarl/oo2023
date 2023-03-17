public class Main {
    public static void main(String[] args) {
    Inimene inimene = new Inimene("Juhan ","Pedajas ","27 ", "mees ");
    Terviseandmed terviseandmed = new Terviseandmed(182, 75,60);

    isikukaart isikukaart = new isikukaart(inimene,terviseandmed);

    isikukaart.kuva_inimene();
    isikukaart.kuva_terviseandmed();


    }
}