import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = { 10 , 15 , 20 , 5 , 25};
        inserton(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inserton(int[] arr) {
        for(int i = 0; i < arr.length - i; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int change = arr[first];
        arr[first] = arr[second];
        arr[second] = change;
    }
}
