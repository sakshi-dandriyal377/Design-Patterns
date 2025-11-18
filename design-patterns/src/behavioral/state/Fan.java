package behavioral.state;

public class Fan {
    private State state;
    public Fan(){
        state = new OffState();//initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton(){      //action
        state.handleRequest();
    }
}
