public class FibonacciNumber{
public static void main(String[] args) {
    int pre2 =0;
    int pre1 =1;
    System.out.println(pre2);
    System.out.println(pre1);
    for(int i=0;i< 18;i++){
        int newFibo = pre2 +pre1;
        System.out.println(newFibo);
        pre2=pre1;
        pre1=newFibo;
    }
}
}
