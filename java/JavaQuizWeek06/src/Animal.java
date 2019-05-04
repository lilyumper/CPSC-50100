public class Animal {

    public int height;
    public int weight;
    public boolean warmBlooded;

    public Animal(){}

    public Animal (int height, int weight, boolean warmBlooded) {
        this.height = height;
        this.weight = weight;
        this.warmBlooded = warmBlooded;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isWarmBlooded() {
        return warmBlooded;
    }
}
