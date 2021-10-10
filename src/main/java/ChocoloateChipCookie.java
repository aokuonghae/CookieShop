public class ChocoloateChipCookie extends Cookie{
    private Integer chocolateChips;
    public ChocoloateChipCookie(Float flour, Float butter, Float sugar, String texture, Integer bakingTemp, Integer chocolateChips) {
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
    public String printRecipie() {
        return null;
    }
}
