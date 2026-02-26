package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(intervals);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
        
    }
    static int[][] merge(int[][] intervals) {
        List<List<Integer>> ansl = new ArrayList<>();
        if(intervals.length == 0 || intervals.length == 1){
            return intervals;
        }
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1] >= intervals[i][0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(intervals[i-1][0]);
                temp.add(intervals[i][1]);
                ansl.add(temp);
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ansl.add(temp);
            }
        }
        int[][] ans = new int[ansl.size()][2];
        for(int i=0;i<ansl.size();i++){
            ans[i][0] = ansl.get(i).get(0);
            ans[i][1] = ansl.get(i).get(1);
        }
        return ans;
    }
}
