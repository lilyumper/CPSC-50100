
public class Monkey extends Animal {
    public String color;
    public String name;


    public Monkey(String name,int height, int weight, boolean warmBlooded) {
        super(height, weight, warmBlooded);
        this.color = "Brown";
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void climbTree(){
        System.out.println(name + " Climbed a Tree");
    }

    public void eat() {
        System.out.println(name + " Ate a Banana");
    }

    public String getName() {
        return name;
    }
}
