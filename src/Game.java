import java.util.ArrayList;

public class Game {
    ArrayList<Ball> balls;

    public Game() {
        balls = new ArrayList<>();
    }
    public void addBall(){
        Ball newball= new Ball("ball3");
        balls.add(newball);
    }
}
