package pm;

public class Car {
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }
    
    public Car() {
        this("ÀÌ¸§¾øÀ½", 0);
        // this.name = "ÀÌ¸§¾øÀ½";
        // this.number = 0;

    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}