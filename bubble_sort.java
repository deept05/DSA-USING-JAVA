public class bubble_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};

        for(int i=0; i<arr.length-1; i++){

            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);

    }
}



// public class bubble_sort {
//     public static void printArray(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " "); // Print each element followed by a space
//         }
//         System.out.println(); // Move to the next line after printing the entire array
//     }

//     public static void main(String args[]) {
//         int arr[] = {7, 8, 3, 1, 2};

//         // Outer loop for the number of passes
//         for(int i = 0; i < arr.length - 1; i++) {
//             // Inner loop for comparing and swapping elements
//             for(int j = 0; j < arr.length - i - 1; j++) {
//                 if(arr[j] > arr[j + 1]) {
//                     // Swap arr[j] and arr[j + 1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         // Print the sorted array
//         printArray(arr);
//     }
// }
