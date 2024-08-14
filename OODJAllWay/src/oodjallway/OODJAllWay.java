/*
Different ways to solve java program
1. Structured Java Program
2. Static Way
    2.1 inside of same class
    2.2 inside of other class
3. Object Oriented Way
    3.1. Normal Method
    3.2. Get-Set Method
    3.3. Constructor Method
*/
//WAP to display addition of 2 numbers using all different ways of Java Program
package oodjallway;
import java.util.*;

public class OODJAllWay {

    public static void main(String[] args) {
        
        //1. Structured Way
        int no1, no2, add;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers here: ");
        no1 = s.nextInt();
        no2 = s.nextInt();
        
        add = no1 + no2;
        
        System.out.println("1. Structure Way\n\tAddition is: "+add);
        
        //2. Static Way 2.1. inside of same class
        addition(no1, no2);
        
        //2. Static Way 2.1. inside of same class
        StaticMethod.addition(no1, no2);
        
        //3. Object Oriented Way  3.1 Normal Method
        OOPsNormalMethod nm = new OOPsNormalMethod();
        nm.addition(no1, no2);
        
        //3. Object Oriented Way  3.2 Get-Set Method
        GetSetMethod gs = new GetSetMethod();
        gs.setData(no1, no2);
        System.out.println("\t3.2. Get-Set Method\n\t\tAddition is: "+gs.getData());
        
        //3. Object Oriented Way  3.3 Constructor Method
        ConstructorMethod cm = new ConstructorMethod(no1, no2);
        System.out.println("\t3.3. Constructor Method\n\t\tAddition is: "+cm.addition());
    }
    
    static void addition (int a, int b)
    {
        int result;
        result = a + b;
        System.out.println("2. Static Way\n\t2.1. inside of same class \n\t\tAddition is: "+result);
    }
}
