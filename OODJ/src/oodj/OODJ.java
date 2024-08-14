package oodj;

public class OODJ
{
    public static void main(String[] args)
    {
        
    }
        try {
            int j = 12 + 4 / 0;
        } catch (Exception e) {
            System.out.println("Inside 1st catch block");
        } finally {
            System.out.println("Inside 1st finally block");
        }
        try {
            int j = 12+4*0;   ;
        } catch (Exception e) {
            System.out.println("Inside 2st catch block");
        } finally {
            System.out.println("Inside 2st finally block");
        }
    }
}