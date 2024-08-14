package oodjinherit;

/**
 *
 * @author ryanc
 */
public class OODJInherit {

    
    public static void main(String[] args) {
        int no;
        no = 100;
        ChildClass cc = new ChildClass();
        cc.display();
        ParentClass pc = new ChildClass();
        pc.display();
        ParentClass p1 = new ParentClass();
        p1.display();
        cc.display(no);
    }
    
}
