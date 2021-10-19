public class Loader5 {
    public static void main(String[] args) {

        Cat cat6 = getKitten();
        Cat cat7 = getKitten();
        Cat cat8 = getKitten();

    }
    private static Cat getKitten() {
        Cat cat = new Cat(1100);
        return cat;
    }
}
