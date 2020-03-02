/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Lampu lampu1 = new Lampu();
        lampu1.turnOn();
        lampu1.getState();
        lampu1.turnOn();
        lampu1.getState();
        lampu1.turnOn();
        lampu1.getState();
        lampu1.turnOn();
        lampu1.getState();
        lampu1.turnOff();
        lampu1.getState();
    }
}