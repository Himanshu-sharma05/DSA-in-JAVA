package Recursion.Backtracking;

public class maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        path("",3,3);
    }

    static int count(int c,int r){
        if(r == 1 && c == 1){
            return 1;
        }
        int left = count(c,r-1);
        int right = count(c-1,r);
        return left + right;
    }

    static void path(String p,int c,int r){
        if(c == 1 && r == 1){
            System.out.println(p);
        }

        if(r>1){
            path(p + "D",c,r-1);
        }
        if(c>1){
            path(p + "R",c-1,r);
        }

    }
    
}
