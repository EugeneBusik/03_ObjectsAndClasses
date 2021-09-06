public class Loader3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        while (!cat4.getStatus().equals("Exploded")){
            cat4.drink(500.00);
            System.out.println(cat4.getStatus());
        }
        System.out.println(Cat.getCount());

        while (!cat3.getStatus().equals("Dead")) {
            cat3.meow();
            System.out.println(cat3.getStatus());
        }
        System.out.println(Cat.getCount());

        while (!cat1.getStatus().equals("Exploded")) {
            cat1.feed(500.00);
            System.out.println(cat1.getStatus());
        }
        System.out.println(Cat.getCount());

        while (!cat2.getStatus().equals("Dead")) {
            cat2.pee();
            System.out.println(cat2.getStatus());
        }
        System.out.println(Cat.getCount());
    }
}
