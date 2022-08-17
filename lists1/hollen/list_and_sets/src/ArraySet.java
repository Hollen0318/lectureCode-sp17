import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySet<T> implements Iterable<T>{
    private T[] items;
    private int size;
// The new item will be added to items[size]
    public int size() {
        return this.size;
    }
    public ArraySet() {
        this.items = (T[]) new Object[100];
        this.size = 0;
    }
    public boolean contains(T x) {
//        we can write code that is null safe

        for (int i = 0; i < this.size; i += 1) {
//            if (items[i] == null) {
//                if (x == null) {
//                    return true;
//                }
//            }
            if (x.equals(items[i])) {
//  We use the .equals to check if semantically equal
                return true;
            }
        }
        return false;
    }
    public void add (T x) {
        if (x == null) {
            throw new IllegalArgumentException("You can't add null");
        }
        if (this.contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }
    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;
        public ArraySetIterator() {
            this.wizPos = 0;
        }
        public boolean hasNext() {
            return wizPos < size;
        }
        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }
    @Override
    public String toString() {
        return "Fuck you";
    }
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }


    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
//        System.out.println(s.contains("horse"));
//        System.out.println(s.size());

        Set<String> s2 = new HashSet<>();
        s2.add(null);
        s2.add("hollen");
        s2.add("sodda");
        s2.add("britain");
        s2.add("usa");
//
//        Iterator<String> seer = s2.iterator();
//        while (seer.hasNext()) {
//            String string = seer.next();
//            System.out.println(string);
//        }

//        Iterator<String> seer2 = s.iterator();
//        while (seer2.hasNext()) {
//            String string2 = seer2.next();
//            System.out.println(string2);
//        }

//        for (String i : s) {
//            System.out.println(i);
//        }
//        System.out.println(s2.contains(null));
        System.out.println(s);
    }
}
