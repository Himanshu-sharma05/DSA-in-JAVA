package Recursion.Backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        // path("",3,3);
        // System.out.println(pathRet("", 3, 3));
        // System.out.println(pathRetDiag("",3,3));
        // boolean[][] maze = {
        //     {true,true,true},{true,false,true},{true,true,true}
        // };
        // pathObstacles("", maze, 0, 0);
    }

    static int count(int c,int r){
        if(r == 1 || c == 1){
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

    static ArrayList<String> pathRet(String p,int c,int r){
        if(c == 1 && r == 1){
            ArrayList<String> newList = new ArrayList<String>();
            newList.add(p);
            return newList;
        }
        ArrayList<String> list = new ArrayList<String>();
        if(r>1){
            list.addAll(pathRet(p + 'D', c, r-1));
        }
        if(c>1){
            list.addAll(pathRet(p + 'R',c-1,r));
        }
        return list;
    }

    static ArrayList<String> pathRetDiag(String p,int c,int r){
        if(c == 1 && r == 1){
            ArrayList<String> newList = new ArrayList<String>();
            newList.add(p);
            return newList;
        }
        ArrayList<String> list = new ArrayList<String>();

        if(r>1 && c>1){
            list.addAll(pathRetDiag(p + 'D',c-1,r-1));
        }

        if(r>1){
            list.addAll(pathRetDiag(p + 'V', c, r-1));
        }
        if(c>1){
            list.addAll(pathRetDiag(p + 'H',c-1,r));
        }
        return list;
    }

    static void pathObstacles(String p,boolean[][] maze,int c,int r){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length - 1){
            pathObstacles(p + 'D', maze, c, r+1);
        }
        if(c < maze[0].length - 1){
            pathObstacles(p + "R",maze,c+1,r);
        }

    }

}
