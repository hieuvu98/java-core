package OOP;

public class Animal {
    private String type;
    private String size;
    private Double weight;

    public Animal(String type, String size, Double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise.");
    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + this.type + ", size=" + this.size + ", weight=" + this.weight + '}';
    }
}
