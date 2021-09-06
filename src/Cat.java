
public class Cat {

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double food;

    static int count = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        food = 0.0;
        count = count + 1;// Lesson 3
    }

    public Integer meow() {
        if (weight >= minWeight) {
            weight = weight - 1;
            System.out.println("Meow");
        if (weight <= minWeight) {
            count = count - 1;
            }
        }return count;
    }

    public Integer pee (){
        if (weight >= minWeight) {
            weight = weight - 50;
            System.out.println("The сat pee successfully");
            if (weight <= minWeight){
                count = count - 1;
            }
        }return count;
    }

    public Integer feed(Double amount){
        if (weight <= maxWeight) {
            weight = weight + amount;
            food = amount;
            if (weight >= maxWeight){
                count = count - 1;
            }
        }return count;
    }

    public Integer drink (Double amount) {
        if (weight <= maxWeight) {
            weight = weight + amount;
            if (weight >= maxWeight) {
                count = count - 1;
            }
        }return count;
    }

    public Double getWeight(){return weight;}

    public Double getFood(){return food;}

    static Integer getCount(){return count;}

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}