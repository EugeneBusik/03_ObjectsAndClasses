public class Loader3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        while (!cat1.getStatus().equals("Exploded")){
            cat1.drink(100.00);
        }
        System.out.println(Cat.getCount());

        while (!cat2.getStatus().equals("Dead")){
            cat2.meow();
        }
        System.out.println(Cat.getCount());

        while (!cat3.getStatus().equals("Dead")) {
            cat3.pee();
        }
        System.out.println(Cat.getCount());

        while (!cat4.getStatus().equals("Exploded")){
            cat4.drink(200.00);
        }
        System.out.println(Cat.getCount());

        while (!cat2.getStatus().equals("Exploded") && !cat2.getStatus().equals("Dead")){
            cat2.drink(100.00);
        }
        System.out.println(Cat.getCount());

    }
}
