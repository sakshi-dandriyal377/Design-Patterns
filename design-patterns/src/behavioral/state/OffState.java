package behavioral.state;

public class OffState implements State{
    @Override
    public void handleRequest() {
        System.out.println("fan is off");
    }
}
