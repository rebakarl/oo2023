import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    // fori
    // sout
    // "||" on "or"
    // javas alati semikoolone (;) lõpus
    // string sonaline= "sõnaline muutuja";  tekstiline väärtus
    // char taheline ='s'; ehk üks täht
    // double komakohaga= 32324.232323;
    // float komakohaga2= 323.213213F; komakohaga numbrite jaoks
    // boolean kahendv22rtus= true; 0 ja 1 (jah/ei)
    // byte pisikeNumber= 100;
    // short lyhikeNumber= 312;
    // long pikkNumber= 33333333333333333333333333333333L;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        World world=new World(10,5);

        Player player=new Player(world.width,world.height);
        Dragon dragon=new Dragon(world.width,world.height);
        Orc orc=new Orc(world.width,world.height);
        // MITTE java.lang import
        // saatke printMap sisse hoopis character ja if/else asemel funktsiooni sees forEach tsükkel
        List<Character> characters = new ArrayList<>(Arrays.asList(player, dragon, orc));

        Item sword = new Item(10, 1, "Mõõk", world.width, world.height);
        Item hammer= new Item(5,3,"Haamer", world.width, world.height);
        Item boot= new Item(1,10,"Saabas", world.width, world.height);

        //import! java.util.list
        //import java.util.ArrayList
        // import java.util.Arrays
        //List --> muudetav ; Array--> ei ole muudetav
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer,boot));

        // Item[] items1={sword,hammer,boot};

        world.printMap(world.width, world.height,
                player.Xcoordinaate, player.Ycoordinaate, player.symbol,
                dragon.Xcoordinaate, dragon.Ycoordinaate, dragon.symbol,
                orc.Xcoordinaate, orc.Ycoordinaate, orc.symbol, items);

        while(!input.equals("end")){
            player.move(input, world);
           world.printMap(world.width, world.height,
                    player.Xcoordinaate, player.Ycoordinaate, player.symbol,
                    dragon.Xcoordinaate, dragon.Ycoordinaate, dragon.symbol,
                    orc.Xcoordinaate, orc.Ycoordinaate, orc.symbol, items);
            System.out.println(); //et sisestus tuleks mapi alla, mitte kõrvale println = newline
            for (Item i: items) {
                if (i.xCoordinaate == player.Xcoordinaate && i.yCoordinaate== player.Ycoordinaate) {
                    player.item=i;
                    System.out.println("Korjasid eseme:" + player.item.name);
                    break;
                }
            }
            input=scanner.nextLine();
        }

    }


}

