package Recursion.Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},{true,true,true},{true,true,true}
        };

        int[][] path = new int[maze.length][maze[0].length];
        // allpath("", maze, 0, 0);
        allpathPrint("", maze, path, 1, 0, 0);
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

    static void allpathPrint(String p,boolean[][] maze,int[][] path,int step,int c,int r){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            path[r][c] = step;
            for(int[] arr: path){
                System.err.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allpathPrint(p + 'D', maze,path,step+1, c, r+1);
        }
        if(c < maze[0].length - 1){
            allpathPrint(p + "R",maze,path,step+1,c+1,r);
        }

        if(r>0){
            allpathPrint(p + 'U', maze,path,step+1, c, r-1);
        }
        if(c>0){
            allpathPrint(p + 'L', maze,path,step+1, c-1, r);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }
}
