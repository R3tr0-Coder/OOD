package oodj_bp;
import java.util.Scanner;


public class OODJ_BPswitchnumber {
    
    public static void main(String[] args) {
    
        /*WAP for swapping of 2 numbers
        No1    No2
        5      9     input
        .
        .
        .
        9      5     Output
        
        solution 1: use third variable
        No1    No2
        5      9     input
        5      9
        9      9
        9      5     Output
        
        Solution 2: use +, - operator
        
        */
        //solution 1
        int no1, no2, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 values here: ");
        no1 = s.nextInt();
        no2 = s.nextInt();
        
        System.out.println("Before swapping values are: no1: "+no1+"\tno2: "+no2);
        temp = no1;
        no1 = no2;
        no2 = temp;
        
        System.out.println("After swapping values are: no1: "+no1+"\tno2: "+no2);
        
        //solution 2: use +, - operator
        /*
        num1    num2
        5       7
        12      7
        12      5
        7       5
        */
        int num1, num2;
        System.out.println("Enter 2 values here: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        
        System.out.println("Before swapping values are: num1: "+num1+"\tnum2: "+num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping values are: num1: "+num1+"\tnum2: "+num2);
    }
    
}
