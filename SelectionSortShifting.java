public class SelectionSortShifting {
    public static void main(String[] args) {
        int[] arr = { 32, 34, 4, 2, 1, 78, 0, 3, 104 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int min_value = arr[min_index];
            for (int k = min_index; k > i; k--) {
                arr[k] = arr[k - 1];
            }
            arr[i]=min_value;
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
