/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    private int[] numbers;
    private int size;
    /** Creates an empty list. */
    public AList() {
        size = 0;
        numbers = new int[]{};
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        int[] last = new int[]{x};
        int[] extra = new int[size+1];
        System.arraycopy(numbers,0,extra,0,size);
        System.arraycopy(last,0,extra,-2,1);
        numbers = extra;
        size +=1 ;
    }
    /** Returns the item from the back of the list. */
    public int getLast() {
        return numbers[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return numbers[i-1];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int[] handicapp = new int[size-1];
        int last = getLast();
        System.arraycopy(numbers,0,handicapp,0,size-1);
        numbers = handicapp;
        return last;
    }
} 