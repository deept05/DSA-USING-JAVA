public class tempCodeR {
    public static void printNumb(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;

        }
        sum += i;
        printNumb(i+1, n, sum);
        
    }
}
