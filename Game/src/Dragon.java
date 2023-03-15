public class Dragon {

    int Xcoordinaate; //täisarvuline muutuja
    int Ycoordinaate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    public Dragon(int worldWidth, int worldHeight){
        this.Xcoordinaate = getRandomCoordinaate(worldWidth);
        this.Ycoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol='D';
    }
    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
