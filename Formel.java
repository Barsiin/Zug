public class Formel
{
    public int calc(int y, int x)
    {
        int z;
        z=6*y -2*x+1;
        return z;
    }
    
    public int calc(int a, int b, int c)
    {
        int e;
        e = calc(a,c)+calc(b,a)+calc(c,3);
        return e;
    }
}