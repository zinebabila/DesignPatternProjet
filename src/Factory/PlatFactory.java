package Factory;

public class PlatFactory {
    public static Plat createPlat(String name){
        if(name==null){return null;}
        switch (name.toLowerCase()){
            case "p":return new Priza();
            case "t":return  new Tacos();
            default:return null;
        }
    }
}
