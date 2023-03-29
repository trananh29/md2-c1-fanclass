public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setSpeed(fan1.Fast);
        fan1.setColour("yellow");
        fan1.setRadius(10);
        fan1.turnOn();
        fan2.setSpeed(fan2.Medium);
        fan2.setColour("blue");
        fan2.setRadius(5);
        fan2.turnOff();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
