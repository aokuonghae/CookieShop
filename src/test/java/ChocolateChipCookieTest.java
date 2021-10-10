import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChocolateChipCookieTest {
    @Test
    public void printRecipe_givenChocolateChipCookie_PrintsCookieProperties(){
        // Every test should include aspects of:
        //  when I do some action (call a method or constructor),
        //  given a specific scenario (by setting up specific properties on my class under test),
        //  I expect some specific outcome (the thing I expect to happen as a result of the action)

        // Arrange - set up your test scenario - create a class with properties needed to get your final outcome
        ChocolateChipCookie cookie1 = new ChocolateChipCookie(12.0f, 12.0f,12.0f,"soft", 350, 120);

        // Act - call the method under test - this is the action you're executing that you want to verify the behavior of
        String cookieRecipePrinted = cookie1.printRecipe();

        // Assert - verify that the outcome of that action - the specific scenario you set up produced the outcomes you expected
        // Here, we care that a Chocolate Chip Cookie has the properties we set in the constructor, as well as "Chocolate Chips" printed out in the recipe
        String expectedFlour = "Flour: " + cookie1.getFlour();
        assertTrue(cookieRecipePrinted.contains(expectedFlour));

        String expectedButter = "Butter: " + cookie1.getButter();
        assertTrue(cookieRecipePrinted.contains(expectedButter));

        String expectedSugar = "Sugar: " + cookie1.getSugar();
        assertTrue(cookieRecipePrinted.contains(expectedSugar));

        String expectedTexture = "Texture: " + cookie1.getTexture();
        assertTrue(cookieRecipePrinted.contains(expectedTexture));

        String expectedBakingTemp = "Baking Temperature: " + cookie1.getBakingTemp();
        assertTrue(cookieRecipePrinted.contains(expectedBakingTemp));

        String expectedChocolateChipsString = "Chocolate Chips: " + cookie1.getChocolateChips();
        assertTrue(cookieRecipePrinted.contains(expectedChocolateChipsString));
    }

}
