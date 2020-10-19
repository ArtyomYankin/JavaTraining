package grow.online.training;

public class VTask3 {
    public double x1, y1, x2, y2, x3, y3;
    private double a,b;
    public VTask3(double x1,double y1, double x2, double y2,double x3, double y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    public void OneLine(){
        a=(y2-y1)/(x2-x1);
        b=y1-x1*a;
        if(y2==a*x2+b && y3==a*x3+b)
            System.out.println("Точки лежат на одной прямой");
        else System.out.println("Точки не лежат на одной прямой");
    }
}
