public class Aliment {
    private Float calorii ;
    private Double pret ;
    private String[] ingrediente ;

    private enum categorii {
        Paine,
        Lactate,
        Mezeluri
    }

    public Float getCalorii() {
        return calorii;
    }

    public void setCalorii(Float calorii, Double pret) {
        this.calorii = calorii;
        this.pret = pret ;
    }

    public Aliment(Float calorii) {
        System.out.println("Constructor aliment");
        this.calorii = calorii ;
    }
}


