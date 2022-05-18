import java.util.ArrayList;

public class Box implements Packable {
    private double maxCap;
    private double weight;
    private ArrayList<Packable> packables;
    int itemCount;
    public Box(double maxCap) {
        this.packables = new ArrayList<>();
        this.maxCap = maxCap;
        this.weight = 0;
    }

    public double weight() {
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() + weight < maxCap) {
            packables.add(packable);
            weight += packable.weight();
            itemCount++;
        } else {
            System.out.println("no room in the box");
        }
    }

    public String toString() {
        return "Box: " + itemCount + " items, total weight: " + weight + "kg";
    }
}
