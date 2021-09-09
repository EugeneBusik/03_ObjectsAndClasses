public class Loader3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        while (cat1.getCheck()) cat1.drink(100.00);

        System.out.println(Cat.getCount());

        while (cat2.getCheck()) cat2.meow();

        System.out.println(Cat.getCount());

        while (cat3.getCheck()) cat3.pee();

        System.out.println(Cat.getCount());

        while (cat4.getCheck()) cat4.drink(200.00);

        System.out.println(Cat.getCount());

    }
}
