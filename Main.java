import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
           case 1,2,3,4,5 -> System.out.println("Weekday");
           case 6,7 -> System.out.println("Weekend");
           default -> System.out.println("Please enter a valid day");
        }
    in.close();
    }
    
}