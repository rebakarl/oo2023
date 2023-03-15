public class Item {
    int xCoordinaate;
    int yCoordinaate;
    int strength;
    int durability;
    String name;


    // parem klõps -> generate -> constructor -> ctrl valin kõik
    public Item( int strength, int durability, String name,int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
