public class Ball {
    String name;
    float x;
    float y;
    int size;

    public Ball(String n) {
        name = n;
        x = 0;
        y = 0;
        size = (int) (Math.random() * 50 + 1);
    }

    public void sayHi() {
        System.out.println("Hi, I'm " + name + "!");
        System.out.println("I have " + size + " area.");

    }

    public void fight(Ball b) {
        Ball winner;
        if (size > b.size) {
            winner = this;
        } else {
            winner = b;
        }
        System.out.println("The winner is " + winner.name + "!");
        System.out.println("Win by " + Math.abs(size - b.size) + " points");
    }
}
