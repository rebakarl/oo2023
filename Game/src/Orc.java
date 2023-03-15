public class Orc {

    int Xcoordinaate; //täisarvuline muutuja
    int Ycoordinaate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    public Orc(int worldWidth, int worldHeight) {
        this.Xcoordinaate = getRandomCoordinaate(worldWidth);
        this.Ycoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'O';
    }
    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
