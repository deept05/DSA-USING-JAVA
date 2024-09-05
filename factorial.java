import java.util.*;
public class factorial {
    public static void Factorials(int n){
        int factorial = 1;
        for(int i = n; i>=1;i--){
            factorial *= i;
        }
        System.out.println(factorial);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorials(n);
    }
}
