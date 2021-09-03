public class Loader2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        System.out.println(cat1.getWeight());

        cat1.feed(150.00);

        for(int i = 0; i < 4; i++)
            cat1.pee();

        System.out.println(cat1.getWeight());

        System.out.println(cat1.getFood() + " граммов");

    }
}
