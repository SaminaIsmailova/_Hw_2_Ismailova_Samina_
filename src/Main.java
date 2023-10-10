public class Main {
    public static void main(String[] args) {


        Printable iphone = createObject("2");
        Printable xiaomi = createObject("3");
        Printable samsung = createObject("4");
        Printable[] phones = {iphone, xiaomi, samsung};
        for (Printable phone: phones
        ) {
            phone.print();
        }

    }

    public static Printable createObject(String phoneName){
        switch (phoneName){
            case "2":
                Iphone iphone = new Iphone("13", 512);
                return iphone;
            case "3":
                Xiaomi xiaomi = new Xiaomi("Redmi Note 10s", 256);
                return xiaomi;
            case "4":
                Samsung samsung = new Samsung("SamsungGalaxy a54", 128);
                return samsung;
            default:
                System.out.println("не известный тип обьекта ");
                return null;
        }
    }
}
