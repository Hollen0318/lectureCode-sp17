public class sort {
    public void SortArray (int[] a) {
        int position = 0;
        if ( a.length == 1) {
            return;
        }else{
            while (position < a.length) {
                int[] aw = minInArray(a, position);
                int temp = a[position];
                a[position] = aw[0];
                a[aw[1]] = temp;
                position += 1;
            }
        }
    }

    public int[] minInArray (int[] a, int start) {
        int[] arr = new int[2];
        int min = a[start];
        int index = 0;
        for (int i = start+1; i < a.length; i += 1){
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        arr[0] = min;
        arr[1] = index;
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[] {2,3,4,5,10,1,0,-1,-4};
        SortArray(a);
    }

}
