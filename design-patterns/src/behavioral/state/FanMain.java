package behavioral.state;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan();   // set state to off via constructor
        fan.pressButton(); //initial is off -> low
        fan.setState(new LowState());

        fan.pressButton(); // low -> high
        fan.setState(new HighState());

        fan.pressButton(); //high ->off
        fan.setState(new OffState());
    }
}
