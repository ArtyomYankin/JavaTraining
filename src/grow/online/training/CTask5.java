package grow.online.training;

public class CTask5 {
    private double a, Epsilon;
    private double SUM=0;
    public int n;
    public CTask5( int n, double Epsilon){
        this.n=n;
        this.Epsilon=Epsilon;
    }
    public double SumOfABS(){
        for (int i=1;i<n;i++)
        {
            a=(1/Math.pow(2,i))+(1/Math.pow(3,i));
            if (Math.abs(a)>=Epsilon)
                 SUM+=a;
            a=0.0;

        }
        return SUM;
    }
}
