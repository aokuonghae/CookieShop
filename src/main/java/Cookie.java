public abstract class Cookie {
    Float flour;
    Float butter;
    Float sugar;
    String texture;
    Integer bakingTemp;

    public Cookie(Float flour, Float butter, Float sugar, String texture, Integer bakingTemp) {
        this.flour = flour;
        this.butter = butter;
        this.sugar = sugar;
        this.texture = texture;
        this.bakingTemp = bakingTemp;
    }

    public Float getFlour() {
        return flour;
    }

    public void setFlour(Float flour) {
        this.flour = flour;
    }

    public Float getButter() {
        return butter;
    }

    public void setButter(Float butter) {
        this.butter = butter;
    }

    public Float getSugar() {
        return sugar;
    }

    public void setSugar(Float sugar) {
        this.sugar = sugar;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public Integer getBakingTemp() {
        return bakingTemp;
    }

    public void setBakingTemp(Integer bakingTemp) {
        this.bakingTemp = bakingTemp;
    }

    public abstract String printRecipie();
}
