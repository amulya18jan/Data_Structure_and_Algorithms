public class BubbleSortImprovement {
    public static void main(String[] args) {
        int[] arr ={298,3,45,1,43,22,44,104};
        int n = arr.length;
    
        for (int i= 0; i<n-1;i++){
            boolean swapped =false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
            
        }
        System.out.print("Sorted Array" + " ");
        for(int  i =0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
