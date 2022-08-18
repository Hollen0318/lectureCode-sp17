import java.util.*;

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
//    @Override
//    public String toString() {
////        String returnString = "{";
////        for (int i = 0; i < this.size - 1; i += 1) {
////            returnString += items[i].toString();
////            returnString += ", ";
////        }
////        returnString += items[this.size - 1];
////        returnString += "}";
////        return returnString;
//
////        The string concentation is very slow
////        So we use the stringbuilder
//        StringBuilder returnSB = new StringBuilder("{");
//        for (int i = 0; i < size - 1; i += 1) {
//            returnSB.append(items[i].toString());
//            returnSB.append(", ");
//        }
//        returnSB.append(items[this.size - 1]);
//        returnSB.append("}");
//        return returnSB.toString();
//    }
    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for (T x : this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(",", listOfItems) + "}";
//        This string add is not efficient
    }
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {return false;}
        if (this == other) {return true;}
        if (other.getClass() != this.getClass()) {
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if (o.size() != this.size()) {
            return false;
        }
        for (T item: this) {
            if (!o.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        System.out.println(s);
        ArraySet<String> s2 = new ArraySet<>();
        s2.add("horse");
        s2.add("fish");
        s2.add("house");
        s2.add("fish");

        System.out.println(s.equals(s2));
        System.out.println(s.equals(null));
        System.out.println(s.equals("null"));
    }
}
