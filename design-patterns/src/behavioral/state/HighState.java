package behavioral.state;

public class HighState implements State{
    @Override
    public void handleRequest() {
        System.out.println("fan is on high state");
    }
}
