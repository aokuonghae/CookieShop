public class OatmealRaisinCookie extends Cookie{
    private Integer raisins;

    public OatmealRaisinCookie(Float flour, Float butter, Float sugar, String texture, Integer bakingTemp, Integer raisins) {
        super(flour, butter, sugar, texture, bakingTemp);
        this.raisins = raisins;
    }

    public Integer getRaisins() {
        return raisins;
    }

    @Override
    public String printRecipe() {
        String recipe = "Oatmeal Cookie Recipe:";
        recipe += "\nFlour: " + this.flour;
        recipe += "\nRaisins: " + this.raisins;
        recipe += "\nButter: " + this.butter;
        recipe += "\nSugar: " + this.sugar;
        recipe += "\nTexture: " + this.texture;
        recipe += "\nBaking Temperature: " + this.bakingTemp;

        return recipe;
    }
}
