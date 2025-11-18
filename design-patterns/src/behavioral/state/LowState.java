package behavioral.state;

public class LowState implements State{
    @Override
    public void handleRequest() {
        System.out.println("fan is on low speed");
    }
}
