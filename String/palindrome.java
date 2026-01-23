package String;

public class palindrome {
    public static void main(String[] args) {
        String st = "yooy";
        int start = 0;
        int end = st.length() - 1 ;
        boolean ans = true;
        while(start<end){
            if(st.charAt(start) != st.charAt(end)){
                ans = false;
                start++;
                end--;
            }
            start ++;
            end--;

        }
        System.out.println(ans);
    }

}
