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
        System.out.println("*************************");
        System.out.print("*");
        System.out.println("\tDavid Søbæk Olsen" + "\t*");
        System.out.print("*");
        System.out.println("\t\tdaol@kea.dk" + "\t\t*");
        System.out.print("*************************");
    }
}
