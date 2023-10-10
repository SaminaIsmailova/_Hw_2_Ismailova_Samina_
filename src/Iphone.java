public class Iphone extends Smartphone implements Printable {

    public Iphone(String name, double memory) {
        super(name, memory);
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Memory: " + this.getMemory());
    }
}
