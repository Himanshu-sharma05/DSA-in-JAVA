package Recursion.Backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},{true,true,true},{true,true,true}
        };
        allpath("", maze, 0, 0);
    }
    static void allpath(String p,boolean[][] maze,int c,int r){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1){
            allpath(p + 'D', maze, c, r+1);
        }
        if(c < maze[0].length - 1){
            allpath(p + "R",maze,c+1,r);
        }

        if(r>0){
            allpath(p + 'U', maze, c, r-1);
        }
        if(c>0){
            allpath(p + 'L', maze, c-1, r);
        }

        maze[r][c] = true;

    }
}
