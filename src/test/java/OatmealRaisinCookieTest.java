import org.junit.Test;

import static org.junit.Assert.*;

public class OatmealRaisinCookieTest {
    @Test
    public void printRecipe_givenOatmealRaisin_PrintsCookieProperties(){
        // Arrange
        OatmealRaisinCookie cookie1 = new OatmealRaisinCookie(12.0f, 12.0f,12.0f,"soft", 350, 120);

        // Act
        String recipe = cookie1.printRecipe();

        // Assert

        String expectedFlour = "Flour: " + cookie1.getFlour();
        assertTrue(recipe.contains(expectedFlour));

        String expectedButter = "Butter: " + cookie1.getButter();
        assertTrue(recipe.contains(expectedButter));

        String expectedSugar = "Sugar: " + cookie1.getSugar();
        assertTrue(recipe.contains(expectedSugar));

        String expectedTexture = "Texture: " + cookie1.getTexture();
        assertTrue(recipe.contains(expectedTexture));

        String expectedBakingTemp = "Baking Temperature: " + cookie1.getBakingTemp();
        assertTrue(recipe.contains(expectedBakingTemp));

        String expectedRaisins = "Raisins: "+cookie1.getRaisins();
        assertTrue(recipe.contains(expectedRaisins));
    }
}