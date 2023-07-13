package day39_a_polymorphisim.clothes;

public class Jacket extends Clothes implements HasHood {

    @Override
    public void wear() {
        System.out.println("Wearing a Jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting the hood on");
    }
}
