public class SetBits {
    public static void main(String[] args) {
        int count = 0;
        int n = 56422;
        System.out.println(Integer.toBinaryString(n));
        while(n > 0){
            count++;
            n -= (n & -n);
        }
        System.out.println(count);
    }
}
