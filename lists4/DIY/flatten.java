public class flatten {
    public static int[] flattenArray (int[][] src){
        int sum = 0;
        for (int i = 0; i < src.length; i++){
            sum += src[i].length;
        }
        int [] asw = new int[sum];
        int size = 0;
        for (int i = 0; i < src.length; i++){
            for (int j = 0; j < src[i].length; j++){
                asw[size] = src[i][j];
                size += 1;
            }
        }
        return asw;
    }
    public static void main(String[] args) {
        int [][] src = new int[][] {{2,3,4},{1,2},{7,8}};
        int [] asw = flattenArray(src);
        for (int i = 0; i < asw.length; i++){
            System.out.print(asw[i] + " ");
        }
    }
}
