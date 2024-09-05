public class maze {
 public static int countpaths(int i, int j, int n, int m)
{
    if(i==n || j==n){
        return 0;
    }

    if( i == n-1 && j ==m-1){
        return 1;
    }

    int downPaths = countpaths(i+1, j, n, m);
    int rightPaths = countpaths(i, j+1, n, m);
    return downPaths+rightPaths;
 
}
 public static void main(String[] args) {
    int n = 3;
    int m = 3;
    int totalpaths = countpaths(0, 0, n, m);
    System.out.println(totalpaths);

 } 
}
