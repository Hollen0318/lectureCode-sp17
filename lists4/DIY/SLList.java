/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */
public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at first.next. */
    private IntNode first;
    private int size;

    /** Creates an empty SLList. */
    public SLList() {
        first = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(63, null);
        first.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        first.next = new IntNode(x, first.next);
        size = size + 1;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return first.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
        size = size + 1;

        IntNode p = first;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    public void reverseRecur () {
        first = reverseHelper(first);
    }

    private IntNode reverseHelper(IntNode lst) {
        if (lst == null || lst.next == null){
            return lst;
        }else {
            IntNode endOfReversed = lst.next;
            IntNode reversed = reverseHelper(lst.next);
            endOfReversed.next = lst;
            lst.next = null;
            return reversed;
        }
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList();
        L.addLast(20);
        L.addFirst(5);
        L.addLast(6);
        L.reverseRecur();
    }
}