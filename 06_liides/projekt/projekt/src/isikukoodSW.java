public class isikukoodSW extends Isikukood implements Andmed{

    public isikukoodSW(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        return null;
    }

    @Override
    public String getKuupaev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}
