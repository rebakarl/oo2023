public class isikukaart {

        Inimene inimene;
        Terviseandmed terviseandmed;

    public isikukaart(Inimene inimene, Terviseandmed terviseandmed) {
        this.inimene = inimene;
        this.terviseandmed = terviseandmed;
    }

    // Inimese andmete kuvamine
    public void kuva_inimene(){
    System.out.print("Eesnimi: "+ inimene.getNimi());
    System.out.print("Perenimi: "+ inimene.getPerenimi());
    System.out.print("Vanus: "+ inimene.getVanus());
    System.out.print("Sugu: "+ inimene.getSugu());
    }

    public void kuva_terviseandmed(){
        System.out.print("Pikkus: "+ terviseandmed.pikkus_cm());
        System.out.print("Kaal: "+ terviseandmed.getKaal_kg());
        System.out.print("Piha ümbermõõt: "+ terviseandmed.getPihaymberm66t());
        System.out.print("BMI: "+ terviseandmed.getBmi(terviseandmed.kaal_kg, terviseandmed.pikkus_m));
    }
}
