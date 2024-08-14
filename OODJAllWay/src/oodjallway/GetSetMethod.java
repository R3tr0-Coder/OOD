package oodjallway;

public class GetSetMethod {
    
    int p, q;
    void setData(int a, int b)
    {
        p = a;
        q = b;
    }
    
    int getData()
    {
        int result;
        result = p + q;
        return result;
    }
}
