public class Main {
    public static void main(String[] args) {
    Info info= new Info ("Mac", "16","Windows");
    Arvuti arvuti1 = new Arvuti(info, 1999 );
    arvuti1.suurendaMaksumus(100);


    Arvuti arvuti2= new Arvuti(new Info ("Loom", "8","macintosh"), 1222);
    arvuti2.paneDollaritesse();
    }
}