public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 28, 32, 34, 76, 68, 7 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int instIndex = i;
            int currentIndex = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentIndex) {
                arr[j + 1] = arr[j];
                instIndex = j;
                j--;
            }
            arr[instIndex]=currentIndex;
        }
        System.out.print("Sorted Array" + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
