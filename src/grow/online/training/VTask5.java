package grow.online.training;

public class VTask5 {
    private double x;
    public VTask5(double x){
        this.x=x;
    }
    public double F(){
        if (x<=3)
            return x*x-3*x+9;
        else
            return 1/(x*x*x+6);
    }
}
