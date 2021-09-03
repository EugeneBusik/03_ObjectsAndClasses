
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double food;



    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        food = 0.0;
    }

    public void meow(){
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void pee(){
        weight = weight - 50;
        System.out.println("The сat pee successfully");
    }

    public void feed(Double amount) { weight = weight + amount;
    food = amount;}

    public Double getFood(){return food;}

    public void drink(Double amount) {weight = weight + amount; }

    public Double getWeight() {return weight;}

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