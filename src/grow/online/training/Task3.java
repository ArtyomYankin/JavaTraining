package grow.online.training;

public class Task3 {
    private double x,y;
    public Task3(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double Solution(){
        return ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
    }
}
