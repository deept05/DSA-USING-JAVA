import java.util.Scanner;

public class ascending_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // printing array elements 
        boolean isAscending = true;

        for(int i =0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending = false;
            }
            if(numbers[i] < numbers[i+1]){
                isAscending = true;
            }

        }
        if (isAscending){
            System.out.println("array is in ascending order");
        }else{
            System.out.println("not ascending ");
        }
    }
}
