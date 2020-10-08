package Lab2;

import java.util.Scanner;

public class code_lab2 {
    public static void main(String[] args) {
        int num = 5 ;
        int product = 0;
        while(num <= 10){
            product = num*10;
            System.out.printf("\n %d * 10 = %d",num,product);
            num++;
        }
        System.out.println("out side the loop");
    }
}
