package customClass;

public class Carpet {
    double width, length, unitPrice;
    boolean isPersian;

    public Carpet (double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calculateCost(){
        double cost = width * length * unitPrice;
        if(isPersian){
            cost += 100;
        }

         return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=$" + calculateCost() +
                '}';
    }
}
