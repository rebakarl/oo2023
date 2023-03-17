import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter pw =new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("Tere-tere!");
        pw.print("Juku ");
        pw.print("Juhan ");
        pw.println("Juuli ");
        pw.println("Mis toimps? Räige möll?");
        pw.println("Hää küll, ellab, peremees!");
        pw.close();

    }
}