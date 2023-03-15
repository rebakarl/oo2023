public class Player {
    int Xcoordinaate; //täisarvuline muutuja
    int Ycoordinaate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;
    Direction direction; // 3nda tunni teema

    //constructor
    public Player(int worldWidth, int worldHeight){
        this.Xcoordinaate = getRandomCoordinaate(worldWidth);
        this.Ycoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol='X';
        this.direction=Direction.UP;
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }

    public void move(String input, World world){
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        }else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        }else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.Ycoordinaate >1) {
            this.Ycoordinaate = this.Ycoordinaate - 1;
        } else if (direction.equals(Direction.DOWN)&& this.Ycoordinaate < world.height -2) {
            this.Ycoordinaate = this.Ycoordinaate + 1;
        }else if (direction.equals(Direction.LEFT)&& this.Xcoordinaate > 1) {
            this.Xcoordinaate = this.Xcoordinaate - 1;
        }else if (direction.equals(Direction.RIGHT) && this.Xcoordinaate < world.width-2) {
            this.Xcoordinaate = this.Xcoordinaate + 1;
        }
    }


}