package oodjfiletest;
import java.io.*;

public class OODJFileTest 
{

    public static void main(String[] args) 
    {
        try
        {
            //create file
            File f = new File("test.txt");
            System.out.println("File Created Successfully");
        
            //write data in file
            FileWriter fw = new FileWriter(f);
            fw.write("Ryan");
            fw.close();
        
            FileWriter fwl = new FileWriter(f, true);
            fwl.write("\nHarry");
            fwl.close();
            
            //Read single character from file
            FileReader fr = new FileReader(f);
            int code;
            code = fr.read();
            System.out.println((char)code);
            fr.close();
            
            //Read data from file
            FileReader frl = new FileReader(f);
            int code1;
            while((code1 = frl.read()) != -1)
            {
                System.out.println((char)code1);
            }
            frl.close();
            
            //BufferedWriter to write data
            BufferedWriter bf = new BufferedWriter(new FileWriter("Data.txt"));
            bf.write("Harry1");
            bf.write("\tPeter1");
            bf.write("\nTanveer1");
            bf.close();
            
            BufferedWriter bf1 = new BufferedWriter(new FileWriter("Data.txt",true));
            bf1.write("Harry1");
            bf1.write("\tPeter1");
            bf1.write("\nTanveer1");
            bf1.close();
            
            
            BufferedReader in = new BufferedReader(new FileReader("Data.txt"));
            String str;
            while ((str = in.readLine()) !=null)
            {
                System.out.println("\n"+str);
            }
            in.close();
            
            //PrintWriter to write data
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("newfile.txt")));
            pw.print("Hello");
            pw.println("Hi");
            pw.print("\nBye");
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    } 
}
