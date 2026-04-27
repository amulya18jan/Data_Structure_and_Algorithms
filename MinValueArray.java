public class MinValueArray {
    public static void main(String[] args) {
        int arr[] ={2,35,65,0,28,40,56};
        int minValue =arr[0];
        for (int i =0;i< arr.length;i++){
            if(arr[i]<minValue){
            minValue=arr[i];
            }
        }
        System.out.println("Lowest value is " +minValue);
    }
}
