package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
                System.out.println(" ");
            }
            System.out.println("");
        }

    }
    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int[] done = new int[strs.length];
        for(int i=0;i<strs.length-1;i++){
            List<String> temp = new ArrayList<>();
            boolean addToAns = false;
            temp.add(strs[i]);
            String sortedWord = SortString(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(done[j] != 0){
                    continue;
                }
                String compareWord = SortString(strs[j]);
                if(compareWord.equals(sortedWord)){
                    addToAns = true;
                    temp.add(strs[j]);
                    done[j] += 1;
                }
            }
            if(addToAns){
                ans.add(temp);
            }else{
                if(done[i] == 0){
                    List<String> temp2 = new ArrayList<>();
                temp2.add(strs[i]);
                ans.add(temp2);
                }
                
            }
        }
        return ans;

    }
    static String SortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String rcharArray = new String(charArray);
        return rcharArray;
    }
}
