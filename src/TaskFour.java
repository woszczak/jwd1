public class TaskFour {
    public static void main(String[] args) {


        int a = 5;
        int pole = a*a;
        System.out.println("Pole kwadratu o wymiarach " + a + " x " + a + " wynosi " + pole);



        String value = String.format("%32s", Integer.toBinaryString(pole)).replace(' ', '0');

        System.out.println("W systemie binarnym: " + value);
        System.out.println( "W systemie ósemkowym:" + Integer.toOctalString(pole));
        System.out.println("W systemie dziesiątkowym: " + Integer.toHexString(pole));

    }
}