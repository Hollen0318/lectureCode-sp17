public class ArraySet<T> {
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
        for (int i = 0; i < this.size; i += 1) {
            if (x.equals(items[i])) {
//  We use the .equals to check if semantically equal
                return true;
            }
        }
        return false;
    }
    public void add (T x) {
        if (this.contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());
    }
}
