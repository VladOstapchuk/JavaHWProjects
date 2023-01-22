package homeworks.oop;


public class Cat {

    private String name;
    private int weight;
    private String color;


    public Cat(String name, int weight, String color) {
        this(name, weight);
        this.color = color;
    }
    public Cat(String name, int weight) {
        this(name);
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String meow() {
        return "meow1 meow2";
    }
    public void jump() {
        System.out.println("hop=jump");
    }


    public String toString() {
        return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
    }


}