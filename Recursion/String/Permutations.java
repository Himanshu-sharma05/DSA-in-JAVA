package Recursion.String;

public class Permutations {
    public static void main(String[] args) {
        permutation("", "abc");
    }
    public static void permutation(String p,String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s = p.substring(0, i);
            String f = p.substring(i,p.length());
            permutation(s + ch + f, up.substring(1));
        }
    }
}
