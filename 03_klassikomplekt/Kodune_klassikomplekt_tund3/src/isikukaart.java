public class isikukaart {

        Inimene inimene;
        Terviseandmed terviseandmed;

    public isikukaart(Inimene inimene, Terviseandmed terviseandmed) {
        this.inimene = inimene;
        this.terviseandmed = terviseandmed;
    }

    // Inimese andmete kuvamine
    public void kuva_inimene(){
    System.out.println("Eesnimi: "+ inimene.getNimi());
    System.out.println("Perenimi: "+ inimene.getPerenimi());
    System.out.println("Vanus: "+ inimene.getVanus());
    System.out.println("Sugu: "+ inimene.getSugu());
    }

    public void kuva_terviseandmed(){
        System.out.println("Pikkus: "+ terviseandmed.pikkus_cm()+" cm");
        System.out.println("Kaal: "+ terviseandmed.getKaal_kg()+" kg");
        System.out.println("Piha ümbermõõt on "+ terviseandmed.getPihaymberm66t()+ " cm");
        System.out.println("BMI: "+ terviseandmed.getBmi(terviseandmed.kaal_kg, terviseandmed.pikkus_m));
    }
}
