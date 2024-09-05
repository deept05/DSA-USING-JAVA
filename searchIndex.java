import java.util.Scanner;

public class searchIndex {
    static int search(int arr[], int x) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x ){
                return i;
            }
        }
        return -1;        // Your code here
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int result = search(arr, x);
        
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}
