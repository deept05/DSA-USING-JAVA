public class rec4 {
    public static int FactorialOfNumber(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factorial = FactorialOfNumber(n-1);
        int fact_num = n * factorial;
        return fact_num;


    }
    public static void main(String args[]){
        int n = 5;
        int ans = FactorialOfNumber(5);
        System.out.println(ans);

    }
}
