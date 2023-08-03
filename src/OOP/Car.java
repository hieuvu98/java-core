package OOP;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla":
                this.make = make;
                break;
            default:
                this.make = "Unsupported";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCars() {
        System.out.println(doors + "- Door " + color + " " + make + " " + (convertible ? "Convertible" : ""));
    }
}
