package String;
public class BinaryStringProblem {
    public static void main(String[] args) {
        String s = "0111111111111111111111111111111101111101111111111111111110";
        int minJump = 5;
        int maxJump = 26;
        boolean ans = canReach(s, minJump, maxJump);
        System.out.println(ans);

    }
    static boolean canReach(String s, int minJump, int maxJump) {
        int[] arr = new int[s.length()];
        arr[0] = 1;
        if(s.charAt(s.length()-1) == '1'){
            return false;
        }
        for(int i=0;i<s.length()-1 ;i++){
        
            if(s.charAt(i) == '0'){
                for(int j = i+minJump; j <= Math.min(i+maxJump,s.length()-1);j++){
                    if(s.charAt(j)== '0'){
                        arr[j] = 1;
                    }
                }
            } 
        }
        
        if(arr[s.length()-1] == 1){
            return true;
        } 
        return false;
    }
}
