import java.util.*;
import java.util.Scanner;

public class series1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++){
            int c = (int) Math.pow(3,i);
            System.out.print( + c + " ");
        }
    }
    
}
