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

    public static int[] insert(int[] arr, int item, int position) {
        int[] newArr = new int[arr.length+1];
        if ( position==0 ) {
            System.arraycopy(arr,0,newArr,1,arr.length);
            newArr[0] = item;
        } else if (position >= arr.length) {
            System.arraycopy(arr,0,newArr,0,arr.length);
            newArr[arr.length] = item;
        }else{
            System.arraycopy(arr,0,newArr,0,position);
            newArr[position] = item;
            System.arraycopy(arr,position,newArr,position+1,arr.length-position);
        }
        return newArr;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i += 1) {
            int mid = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-1-i] = mid;
        }
    }



    public static void main(String[] args) {
        int[] a = new int[] {5,4,6,1,2};
//        int[] b = AList.insert(a,0,1);
//        int[] c = AList.insert(a,0,0);
//        int[] d = AList.insert(a,0,a.length);
//        int[] e = AList.insert(a,0,a.length-1);
        AList.reverse(a);
    }
} 