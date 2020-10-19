package grow.online.training;

public class VTask2 {
    private double a,b,c,d;
    private double MIN1, MIN2, MAX;
    public VTask2(double a, double b, double c, double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public double MaxValue(){
       MIN1=Math.min(a,b);
       MIN2=Math.min(c,d);
       MAX=Math.max(MIN1,MIN2);
       return MAX;
    }
}
