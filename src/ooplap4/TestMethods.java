package ooplap4;

public class TestMethods {
    //global variabal
    public static int number=10;

//Methods
// type 2
        public static void B (int x,int y) {
            System.out.println("Hello B"+x);
        }//A
        public static void main (String[]args) {
            System.out.println("Hello Main");
            A();
            B();

    }//main
}//class
