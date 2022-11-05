public class Triangle {
    public static void main(String[] args) {


        //==================== sposób 1
        char c = 169;
        System.out.println("   " + c + "\n  " + c + " " + c + "\n " + c + "   " + c + "\n" + c + " " +  c + " " +  c + " " +  c);




        //=================== sposób 2

        System.out.println("\n------------------------------\n");

        char copyright = 169;
        String space = " ";

        String row1 = space + space + space + copyright;
        String row2 =  space + space + copyright + space + copyright;
        String row3 = space + copyright + space + space + space + copyright;
        String row4 = copyright + space + copyright + space + copyright + space + copyright;;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);


    }
}