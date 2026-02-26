package Recursion.String;

public class SimiliarSentence {
    public static void main(String[] args) {
        String sentence1 = "A lot of words";
        String sentence2 = "of";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int l1 = s1.length;
        int l2 = s2.length;
        int minlength = (l1>l2)?l2:l1;
        int count = 0;
        for(int i=0;i<minlength;i++){
            if(s1[i].equals(s2[i])){
                count++;
                continue;
            }else{
                break;
            }
        }
        int remaining = minlength-count;
        for(int i=0;i < remaining;i++){
            if(s1[l1-i-1].equals(s2[l2-i-1])){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

