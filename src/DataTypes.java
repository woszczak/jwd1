public class DataTypes {

    public static void main(String[] args){
        //liczby calkowite
        //byte - 1 00000000
        //short -2 00000000 00000000
        //int -4 00000000 00000000 00000000 00000000
        // long - 8 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000


        //domyslnie liczby całkowite traktowane są jako int

        System.out.println(23423);
        System.out.println(234254354353L);


        byte b = -120;

        short s = 31678;

        int i = 1_123_456_789;

        long l = i * b;

        long itemsNumber = 245676543l;
        //   char c = 12;
        //  System.out.println(c);

//liczby zmiennoprzecinkowe
        // float - 4
        // double - 8

        //domyślnie liczby zmiennoprzecinkowe traktowane są jako double
        double a = 34.35;
        float f = 15.12F;
        double d = 23456987654356789.567890456;

// typ znakowy
        System.out.println('a');
        System.out.println('\'');
        System.out.println('\t');


        char c = 64;
        System.out.println((int)c);   //jawna zamiana na inny typ
//

        boolean choosen = true;
        boolean q = false;
        System.out.println(q);

        //ciągi znaków
        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć, jestem " + name);

        System.out.println("" + 1 + 2 + "tekst");

    }
}