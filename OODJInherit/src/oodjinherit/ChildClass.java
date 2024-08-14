package oodjinherit;

/**
 *
 * @author ryanc
 */
public class ChildClass extends ParentClass {
    
    void display()
    {
        System.out.println("This is Child Class.");
    }
    
    void display(int a)
    {
        System.out.println("This is overloading method in child class");
    }
    
}
