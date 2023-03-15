package Singleton;

public class Serveur {
    private static Serveur seuleinstance;
    private String donner;

    private Serveur() {
        donner="donner perspnnelles";
    }

    public static Serveur getSeuleinstance() {
        if(seuleinstance==null){
            seuleinstance=new Serveur();
        }
        return seuleinstance;
    }

    public String getDonner() {
        return donner;
    }

    public void setDonner(String donner) {
        this.donner = donner;
    }
}
