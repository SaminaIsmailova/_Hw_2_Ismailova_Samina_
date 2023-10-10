public class Xiaomi extends Smartphone implements Printable{

    public Xiaomi(String name, double memory) {
        super(name, memory);
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Memory: " + this.getMemory());
    }
}
