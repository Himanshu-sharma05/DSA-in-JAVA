public class Solution{
    public static void main(String[] args) {
        int n=3;
        int[][] arr = generateMatrix(n);
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0,left = 0;
        int bottom = n-1, right = n-1;
        int num = 1;

        while(right >= left && bottom >= top){

            
            for(int i=left;i<=right;i++){
                arr[top][i] = num;
                num++;
            }
            top++;
            
            
          
            
            
        
            for(int i=top;i<=bottom;i++){
                arr[i][right] = num;
                num++;
            }
            right--;
        
        
        
        
       
            for(int i=right;i >= left;i--){
                arr[bottom][i] = num;
                num++;
            }
            bottom--;
        
        
        
            for(int i=bottom;i>=top;i--){
                arr[left][i] = num;
                num++;
        }
            left++;
        
        

        }
        return arr;
    

    }
}
