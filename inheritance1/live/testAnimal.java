public class testAnimal {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        a.greet(d);
        a.sniff(d);
        d.flatter(d);
        a.flatter(d);
//        The flatter method doesn't overide but overload
    }
}
