

public class beer {
    public static void main(String[] args) {
        System.out.println(noBeer(3));
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
