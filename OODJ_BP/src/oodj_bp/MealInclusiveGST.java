package oodj_bp;

import java.util.Scanner;

public class MealInclusiveGST {
    
    public static void main(String[] args) {
        /*
        Compute the total cost of a meal inclusive of GST (Goods and Service Tax) and tipping.
        Assume that the GST is fixed at 6% but the amount to tip will depend on the customer.
        Your program should input the cost of the meal (before GST and tipping) and tip amount
        (to be input as a percentage).
        Your program should display:
               The total cost of the meal BEFORE GST and tipping
               The total cost of the meal AFTER GST
               The total cost of the meal AFTER GST and tipping
        */
                
        double amount, tip, gstBill, tipBill;
        final double gst = 0.06;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter meal amount: RM ");
        amount = s.nextDouble();
        
        System.out.println("Enter Tip Amout: RM");
        tip = s.nextDouble();
        
        gstBill = amount + (amount * gst);
        tipBill = gstBill + tip;
        
        System.out.println("\n1. The total cost of the meal BEFORE GST and tipping: RM " +amount+
                "\n2. The total cost of the meal AFTER GST : RM " +gstBill+
                "\n3. The total cost of the meal AFTER GST and tipping: RM "+tipBill);
    }
}
