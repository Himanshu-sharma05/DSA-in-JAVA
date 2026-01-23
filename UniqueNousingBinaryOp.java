public class UniqueNousingBinaryOp {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,6,8,5,2,8};
        System.out.println(unique(arr));
    }
    static int unique(int[] num){
        int unique = 0;
        for(int i=0;i<num.length;i++){
            unique = unique ^ num[i];
        }
        return unique;
    }
}
