public class ChocolateChipCookie extends Cookie{
    private Integer chocolateChips;
    public ChocolateChipCookie(Float flour, Float butter, Float sugar, String texture, Integer bakingTemp, Integer chocolateChips) {
        super(flour, butter, sugar, texture, bakingTemp);
        this.chocolateChips=chocolateChips;
    }

    public Integer getChocolateChips() {
        return chocolateChips;
    }

    public void setChocolateChips(Integer chocolateChips) {
        this.chocolateChips = chocolateChips;
    }

    @Override
    public String printRecipe() {
        String recipe = String.format("Chocolate Chip Cookie Recipe: \nFlour: %s \nButter: %s \nSugar: %s\nTexture: %s\nBaking Temperature: %s\nChocolate Chips: %s\n", this.flour, this.butter, this.sugar, this.texture, this.bakingTemp, this.chocolateChips);

        return recipe;
    }
}
