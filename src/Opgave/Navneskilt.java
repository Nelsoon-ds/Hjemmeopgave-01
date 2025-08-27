package Opgave;

public class Navneskilt {
    public static void main(String[] args) {
        printNavneskilt();
        // Should compile into this:
        // ********************
        //* David Søbæk Olsen*
        //*    daol@kea.dk   *
        //********************
    }
    public static void printNavneskilt() {
        System.out.println("********************");
        System.out.print("* ");
        System.out.println("David Søbæk Olsen" + "*");
        System.out.print("*    ");
        System.out.println("daol@kea.dk" + "   *");
        System.out.print("*******************");
        System.out.print("*");
    }
}
