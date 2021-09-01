public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        cat1.feed(150.00);
        cat2.feed(200.00);
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        while (!cat3.getStatus().equals("Exploded")) {
            cat3.feed(150.00);
            System.out.println(cat3.getStatus());
        }
        while (!cat4.getStatus().equals("Dead")){
            cat4.meow();
            System.out.println(cat4.getStatus());
        }
    }
}
