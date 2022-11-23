import java.util.ArrayList;

public class Game {
    ArrayList<Ball> balls = new ArrayList<>();
    int numberOfNPCBalls;
    int width;
    int height;

    public Game(int numberOfNPCBalls, int width, int height) {
        this.numberOfNPCBalls = numberOfNPCBalls;
        this.width = width;
        this.height = height;
    }

    void initGame() {
        generateRandomBalls();
    }

    void generateRandomBalls() {
        for (int i = 0; i < numberOfNPCBalls; i++) {
            String name = "npc";
            float randomX = (float) (width * Math.random());
            float randomY = (float) (height * Math.random());
            int randomSize = (int) (Math.random() * 5 + 2);
            Ball randomBall = new Ball(name, randomX, randomY, randomSize);
            balls.add(randomBall);
        }
    }

    void sayHiFromAllTheBalls(){
        for (int i = 0; i < balls.size(); i++) {
            Ball b = balls.get(i);
            System.out.println("--------------");
            System.out.println("Ball " + (i+1) + " says:");
            b.sayHi();
        }
    }
  
  
    void updateLocations(){
      for (int i = 0; i < balls.size(); i++) {
            Ball b = balls.get(i);
            b.updateLocation();
        }
    }
}
