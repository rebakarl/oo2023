import java.util.Scanner;
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


        world.printMap(world.width, world.height, player.Xcoordinaate, player.Ycoordinaate, player.symbol,
                dragon.Xcoordinaate, dragon.Ycoordinaate, dragon.symbol,
                orc.Xcoordinaate, orc.Ycoordinaate, orc.symbol);


        while(!input.equals("end")){
            player.move(input, world);
           world.printMap(world.width, world.height, player.Xcoordinaate, player.Ycoordinaate, player.symbol,
                    dragon.Xcoordinaate, dragon.Ycoordinaate, dragon.symbol,
                    orc.Xcoordinaate, orc.Ycoordinaate, orc.symbol);
            System.out.println(); //et sisestus tuleks mapi alla, mitte kõrvale println = newline
            input=scanner.nextLine();
        }

    }


}

