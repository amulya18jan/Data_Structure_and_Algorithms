package basicsofprogramming;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for Table");
        int x = sc.nextInt();
        int table = 0;
        int i;
        for( i =1;i<=20;i++){
            table=x*i;
            System.out.println(+x + "X" + i + "=" + table);
        }
        
        sc.close();
    }
}
