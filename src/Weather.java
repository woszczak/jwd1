public class Weather {


    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ...");
        fah = fah -32;
        fah = fah / 9;
        fah = fah +5;

        System.out.println(fah + " stopni Celciusza\n");

        float cel = 33;
        System.out.println(cel + " stopni Celciusza to ...");
        cel = cel *9;
        cel = cel / 5;
        cel = cel +32;
        System.out.println(cel + " stopni Fahrenheita");

    }
}