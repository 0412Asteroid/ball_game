public class Ball {
    String name;
    float x;
    float y;
    int size;

    boolean movingLeft;
    boolean movingUp;

    public Ball(String name, float x, float y, int size) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    void sayHi() {
        System.out.println("Hi, my name's " + name + "!");
        System.out.println("I have a size of " + size);
        System.out.println("I'm at position " + x + ", " + y);
        System.out.println("I have speed of " + speed());
    }

    int speed() {
        return size + 1;
    }

    void updateLocation() {
        int currentSpeed = speed();
        if (movingLeft) {
            x = x - currentSpeed;
        } else {
            x = x + currentSpeed;
        }
        if (movingUp) {
            y = y - currentSpeed;
        } else {
            y = y + currentSpeed;
        }
    }

}
