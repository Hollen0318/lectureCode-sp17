public class Dog implements Animal {
    @Override
    public void sniff(Animal a) {
        System.out.println("dog sniff animal");
    }

    public void flatter(Dog a) {
        System.out.println("u r cool dog");
    }
}
