package Factory;

public class Tacos implements Plat{
    @Override
    public String recipe() {
        return "viande hachee poulet sauce algeriene";
    }

    public Tacos() {
    }
}
