package grow.online.training;

public class CTask2 {
    private int a,b,h,y;
    public CTask2(int a, int b, int h ){
        this.a=a;
        this.b=b;
        this.h=h;
    }
    public void CalculateFunction(){
        while (a<=2 && a<=b)
        {
            System.out.print(-a + "  ");
            a+=h;
        }
        if (a==b)
            return;
        System.out.println();
        while (a<=b)
        {
            System.out.print(a + "  ");
            a+=h;
        }
        System.out.println();
    }
}
