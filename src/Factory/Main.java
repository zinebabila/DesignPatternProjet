package Factory;

public class Main {
    public static void main(String[] args) {
        Plat plat=PlatFactory.createPlat("P");
        System.out.println(plat.recipe());
    }
}
