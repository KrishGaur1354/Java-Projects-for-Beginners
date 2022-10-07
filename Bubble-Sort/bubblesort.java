import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        for(int i = 0 ; i < arr.length ; i++){
            swapped = false;
            for(int j = 1 ; j < arr.length - i ; j++) {
                if(arr[j] < arr[j-1]) {
                    int change = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = change;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
