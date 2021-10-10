import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OatmealRaisinCookie cookie1 = new OatmealRaisinCookie(13.0f, 12.0f,15.0f,"soft", 350, 1);
        ChocolateChipCookie cookie2 = new ChocolateChipCookie(12.0f, 12.0f,12.0f,"chewy", 350, 300);

        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie1);
        cookies.add(cookie2);

        for(Cookie cookie : cookies){
            System.out.println(cookie.printRecipe() + "\n");
        }
    }

}
