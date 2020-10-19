package grow.online.training;

public class Task6 {
    private double x,y;
    private boolean b;
    public Task6(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void Koordinates(){
        if((x>0 && y>0 && x<2 && y<4) || (x<0 && y>0 && x>-2 && y<4) || (x<0 && y<0 && x>-4 && y>-3) || (x>0 && y<0 && x<4 && y>-3) )
        {
          b=true;
        }
        else b=false;
        System.out.println(b);
    };
}
