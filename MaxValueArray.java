public class MaxValueArray {
    public static void main(String[] args) {
        int [] arrMax ={28,204,67,84,43,104};
        int maxValue = arrMax[0];
        for(int i= 0; i<arrMax.length;i++){
            if(arrMax[i]>maxValue){
                maxValue=arrMax[i];
            }
        }
        System.out.println(maxValue +" "+"this is Maximum number in array");
    }
}
