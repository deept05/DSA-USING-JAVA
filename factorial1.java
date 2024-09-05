public class factorial1 {
    public static int calfactorials(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nminus1 = calfactorials(n-1);
        int fact = n * fact_nminus1;
        return fact; 
    }
    public static void main(String args[]){
        int n =5;
        int ans = calfactorials(n);
        System.out.println(ans);
    }
}
