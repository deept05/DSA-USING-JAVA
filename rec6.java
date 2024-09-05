public class rec6 {
    public static int CalcPower(int x, int n){
        if(n == 0 ){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpowernm1 = CalcPower(x, n-1);
        int xpowern = x * xpowernm1;
        return xpowern;

    }
    public static void main(String args []){
        int x = 2,  n = 5;
        int ans = CalcPower(x, n);
        System.out.println(ans);
    }
}
