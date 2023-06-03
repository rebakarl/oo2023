public class Character implements WorldObject {
    int Xcoordinaate; //täisarvuline muutuja
    int Ycoordinaate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    public Character(int worldWidth, int worldHeight, char symbol) {
        this.Xcoordinaate = getRandomCoordinaate(worldWidth);
        this.Ycoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = symbol;
    }
    public int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
