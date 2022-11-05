public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("---------------------------");

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("---------------------------");

        System.out.println("Zmiana temperatury do -60");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("---------------------------");

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();


        System.out.println("============================");


        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja2";
        opportunity.speed = 2;
        opportunity.temperature = -30;
        opportunity.showAttributes();

        System.out.println("---------------------------");

        System.out.println("Zwiększanie prędkości do 5.");
        opportunity.speed = 5;
        opportunity.showAttributes();


        System.out.println("---------------------------");

        System.out.println("Zmiana temperatury do -90");
        opportunity.temperature = -90;
        opportunity.showAttributes();

        System.out.println("---------------------------");

        System.out.println("Sprawdzenie temperatury");
        opportunity.checkTemperature();
        opportunity.showAttributes();


        System.out.println("========================");


        System.out.println("Spirit: ");

        spirit.checkStatus();

        System.out.println("Opportunity:  ");

        opportunity.checkStatus();

    }
}