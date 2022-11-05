public class Ball {
    String name;
    int hitPoints;

    public Ball(String n){
        name = n;
        hitPoints = (int)(Math.random() * 50 + 1);
    }

    public void sayHi(){
        System.out.println("Hi, I'm " + name + "!");
        System.out.println("I have " + hitPoints + " hit points.");
    }
}
