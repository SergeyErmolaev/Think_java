import java.util.Scanner;

/**
 * Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your
 * program should include a recursive method that does the hard part, but you
 * might want to write additional methods to separate other parts of the
 * program. As you develop your code, test it with a small number of verses,
 * like 3.
 */

 /**
  * @author Sergey Ermolaev
  * @version 1
  */
import java.util.Scanner;

public class beer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many bottles? ");

        int n = in.nextInt();

        System.out.println(noBeer(n));
    }
    public static String noBeer(int n) {
        String lastString = "No bottles of beer on the wall, no bottles of beer, ya' can't take one down," +
        "ya' can't pass it around, 'cause there are no more bottles of beer on the" + 
        "wall!";
        String modString = "" + n + " bottles of beer on the wall, " + n + " bottles of beer, ya' take one down, ya'"+ 
        "pass it around, "+ (n-1)+" bottles of beer on the wall.";
        if (n == 0) {
            return lastString;
        } else {
            n-=1;
            return modString + "\n" + noBeer(n);
        }
    }
}
