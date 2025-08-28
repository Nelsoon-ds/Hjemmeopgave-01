package Opgave;

public class Navneskilt {
    public static void main(String[] args) {
        printNavneskilt();
        //printNavneskilt02();
        //printAsterisk(name);
        // Should compile into this:
        // ********************
        //* David Søbæk Olsen*
        //*    daol@kea.dk   *
        //********************

    }

    public static void printNavneskilt() {
      //  String fullName = " David Søbæk Olsen";
        // printAsterisk(fullName);
       // System.out.print('*');
       //  System.out.print(fullName + "\t");
      //   System.out.println("*");
       // printAsterisk(fullName);
        System.out.println("*************************");
        System.out.print("*");
        System.out.println("\tDavid Søbæk Olsen" + "\t*");
        System.out.print("*");
        System.out.println("\tdaol0002@stud.ek.dk" + "\t*");
        System.out.print("*************************");
    }
    public static void printNavneskilt02() {
        String text = "*************************\n*\n*";
    }
    public static void printAsterisk(String name){
        for (int i = 0; i<=name.length(); i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
