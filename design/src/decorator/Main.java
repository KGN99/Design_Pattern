package decorator;

public class Main {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        A3 audi3 = new A3(audi,"A3");
        audi3.showPrice();

        A4 audi4 = new A4(audi,"A4");
        audi4.showPrice();

        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();

    }
}
