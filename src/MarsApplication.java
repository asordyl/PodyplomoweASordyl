public class MarsApplication {
    public static void main(String[] args){
        MarsRobot spirit = new MarsRobot();

        System.out.println("spirit: ");
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();
        spirit.checkStatus();

        System.out.println("");
        System.out.println("Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temepratury");
        spirit.checkTemperature();
        spirit.checkStatus();
        spirit.showAttributes();


        MarsRobot opportunity = new MarsRobot();

        System.out.println("");
        System.out.println("opportunity: ");
        opportunity.status = "eksploracja";
        opportunity.speed = 4;
        opportunity.temperature = -50;
        opportunity.showAttributes();

        System.out.println("");
        opportunity.temperature = -85;
        opportunity.checkTemperature();
        opportunity.checkStatus();
    }
}
