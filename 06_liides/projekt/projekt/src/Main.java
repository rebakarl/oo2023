public class Main {
    public static void main(String[] args) {
        isikukoodEE ee1= new isikukoodEE("Mihkel", "50001029996");
        System.out.println(ee1.getSugu());
        System.out.println(ee1.getKuupaev());
        System.out.println(ee1.getVanus());
        isikukoodEE ee2 = new isikukoodEE("Mihkel", "70303039914");
        System.out.println(ee2.getSugu());
        System.out.println(ee2.getKuupaev());
        System.out.println(ee2.getVanus());
        isikukoodEE ee3 = new isikukoodEE("Mihkel", "30303039914");
        System.out.println(ee3.getSugu());
        System.out.println(ee3.getKuupaev());
        System.out.println(ee3.getVanus());
        isikukoodEE ee4 = new isikukoodEE("Mihkel", "50701019992");
        System.out.println(ee4.getSugu());
        System.out.println(ee4.getKuupaev());
        System.out.println(ee4.getVanus());
        isikukoodEE ee5 = new isikukoodEE("Mihkel", "40404049996");
        System.out.println(ee5.getSugu());
        System.out.println(ee5.getKuupaev());
        System.out.println(ee5.getVanus());

        isikukoodFI fi1 = new isikukoodFI("Miikael", "111111-111C");
        System.out.println(fi1.getSugu());
        System.out.println(fi1.getKuupaev());
        isikukoodFI fi2 = new isikukoodFI("Miikael", "010101-0101");
        System.out.println(fi2.getSugu());
        System.out.println(fi2.getKuupaev());
        isikukoodFI fi3 = new isikukoodFI("Miikael", "010101A900R");
        System.out.println(fi3.getSugu());
        System.out.println(fi3.getKuupaev());
        isikukoodFI fi4 = new isikukoodFI("Miikael", "010101-0102");
        System.out.println(fi4.getSugu());
        System.out.println(fi4.getKuupaev());
        isikukoodFI fi5 = new isikukoodFI("Miikael", "111111-111Q");
        System.out.println(fi5.getSugu());
        System.out.println(fi5.getKuupaev());
    }
}