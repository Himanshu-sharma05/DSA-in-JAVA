package LeetCode;
public class ReachTarget {
    public static void main(String[] args) {
        int steps = 1;
        int ta = 5;
        int poi = 0;
        while(steps+poi != ta){
            if(steps+poi<ta){
                poi += steps;
                steps++;
            }else{
                poi -= steps;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
