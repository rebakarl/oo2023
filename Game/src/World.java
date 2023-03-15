public class World {
    int width;
    int height;

    public World(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void printMap(int worldWidth, int worldHeight,
                                 int playerXcoordinaate, int playerYcoordinaate, char playersymbol,
                                 int dragonXcoordinaate, int dragonYcoordinaate, char dragonSymbol,
                                 int orcXcoordinaate, int orcYcoordinaate, char orcSymbol) {
        // algväärtus;  kulg;  iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1){
                    System.out.print("-");
                } else if (x== 0 || x== worldWidth -1) {
                    System.out.print("|");
                } else {
                    //ctl+alt+m parem klõps- extract method
                    printCharacters(playerXcoordinaate, playerYcoordinaate, playersymbol,
                            dragonXcoordinaate, dragonYcoordinaate, dragonSymbol,
                            orcXcoordinaate, orcYcoordinaate, orcSymbol, y, x);

                }
            }
        }
    }

//    private static int getRandomCoordinaate(int worldDimension) {
//        return (int) (Math.random() * (worldDimension - 2) + 1);
//    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi
    private void printCharacters(int playerXcoordinaate, int playerYcoordinaate, char playersymbol,
                                        int dragonXcoordinaate, int dragonYcoordinaate, char dragonSymbol,
                                        int orcXcoordinaate, int orcYcoordinaate, char orcSymbol, int mapY, int mapX) {
        if (playerXcoordinaate == mapX && playerYcoordinaate == mapY) {
            System.out.print(playersymbol);

        } else if (dragonXcoordinaate == mapX && dragonYcoordinaate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXcoordinaate == mapX && orcYcoordinaate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}
