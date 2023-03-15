package Build;

public class Pizza {
    private String sauce;
    private String thon;
    private String olive;
    private String viande_hachee;

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setOlive(String olive) {
        this.olive = olive;
    }

    public void setViande_hachee(String viande_hachee) {
        this.viande_hachee = viande_hachee;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", thon='" + thon + '\'' +
                ", olive='" + olive + '\'' +
                ", viande_hachee='" + viande_hachee + '\'' +
                '}';
    }
}
