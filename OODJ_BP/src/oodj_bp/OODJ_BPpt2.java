package oodj_bp;
import java.util.Scanner;

public class OODJ_BPpt2 {
    
    public static void main(String[] args) {
    
        //WAP to Calculate Area and Circumference of Circle (Area = PIr2 circumference = 2PIr).
    
        int r;
        double area, cir;
        final double pi = 3.14;
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius value here: ");
        r = s.nextInt();
    
        area = pi * r * r;
        cir = 2 * pi * r;
        
        System.out.println("Area of circle is: "+area+"\nCircumference of circle is: "+cir);
    }
    
}
