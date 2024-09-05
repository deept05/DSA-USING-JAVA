public class sumofnatural {
    public static void sumnatural(int i, int n, int sum){
        if( i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        sumnatural(i+1, n, sum);
    }
    public static void main(String[] args) {
        sumnatural(1, 5, 0);
    }
}
