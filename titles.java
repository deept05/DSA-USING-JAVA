public class titles {

    public static int titles(int n, int m){

        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }


        //vertically 
        int verticalTiles = titles(n-m, m);


        //horizontally
        int horizontalTiles = titles(n-1, m);

        int totalPlacements = verticalTiles + horizontalTiles;

        return totalPlacements;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(titles(n,m));
    }
    
}
