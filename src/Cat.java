
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
        count = count + 1;
    }
    public void meow(){
        if (getCheck()) {
            weight = weight - 1;
            System.out.println("Meow");
            if (!getCheck())
                count = count - 1;
        }
    }
    public void pee (){
        if (getCheck()) {
            weight = weight - 50;
            System.out.println("The сat pee successfully");
            if (!getCheck())
                count = count - 1;
        }
    }
    public void feed(Double amount) {
        if (getCheck()) {
            weight = weight + amount;
            food += amount;
            if (!getCheck())
                count = count - 1;
        }
    }
    public void drink (Double amount) {
        if (getCheck()) {
            weight = weight + amount;
            if (!getCheck())
                count = count - 1;
        }
    }

    public boolean getCheck(){return minWeight <= weight && weight <= maxWeight;}

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