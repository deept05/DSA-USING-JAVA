public class isSorted {
    public static Boolean isSortedArr(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isSortedArr(arr, idx + 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5};
        System.out.println(isSortedArr(arr, 0));
    }
}
