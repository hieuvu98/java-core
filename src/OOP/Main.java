package OOP;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400.0);
        doAnimaStuff(animal, "slow");
    }

    public static void doAnimaStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
