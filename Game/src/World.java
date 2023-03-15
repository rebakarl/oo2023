import java.util.List;

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
                         int orcXcoordinaate, int orcYcoordinaate, char orcSymbol, List<Item> items) {
        // algväärtus;  kulg;  iga tsükkel
        char symbol=' ';//luuakse uus muutuja(deklareerimine(, esmakordne väärtuse andmine on initsialiseermine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1){
                    symbol='-';
                } else if (x== 0 || x== worldWidth -1) {
                    symbol='|';
                } else {
                    //ctl+alt+m või parem klõps- extract method
                    for (Item i: items){
                        if (i.xCoordinaate == x && i.yCoordinaate == y) {
                            symbol='I';
                            break;
                    }
                    }//sinine jooneke all kui on muutuvad seisundis muutuja
                    if (playerXcoordinaate == x && playerYcoordinaate == y) {
                        symbol = playersymbol;
                    } else if (dragonXcoordinaate == x && dragonYcoordinaate == y) {
                        symbol = dragonSymbol;
                    } else if (orcXcoordinaate == x && orcYcoordinaate == y) {
                        symbol = orcSymbol;
                    }

                }
                System.out.print(symbol);
                symbol=' ';
            }
        }
    }

//    private static int getRandomCoordinaate(int worldDimension) {
//        return (int) (Math.random() * (worldDimension - 2) + 1);
//    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi
}
