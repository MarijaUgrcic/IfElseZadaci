public class OstatakDeljenja {

    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;


        if (x % y == 0) {
            System.out.println("Ostatak ne postoji!");
        } else {
            if (x % y > 1000) {
                System.out.println("Ostatak je veci od hiljadu!");
            } else {
                System.out.println("Ostatak je manji od hiljadu!");
            }
        }

    }
}