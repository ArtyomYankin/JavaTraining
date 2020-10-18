package grow.online.training;

public class Task2 {
    private double a,b,c;
    public Task2(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double Solution(){
        return (((b+Math.sqrt(b*b+4*a*c))/2*a)-a*a*a*c+Math.pow(b,(-2)));
    }

}
