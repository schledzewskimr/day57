import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }

    public IOU() {
        this.iou = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        Double howMuch = iou.get(toWhom);
        if (howMuch == null) {
            howMuch = 0.0;
        }
        return howMuch;
    }
}
