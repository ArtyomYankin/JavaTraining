package grow.online.training;

public class Task5 {
    private double TIME;
    private double hh,mm, ss;
    public Task5(double TIME){
        this.TIME=TIME;
    }

    void TimeOut(){
        hh=TIME/3600;
        mm=((TIME-((int)hh*3600))/60);
        ss=TIME-(int)hh*3600-(int)mm*60;
    System.out.println((int)hh +"ч "+(int)mm+"м "+(int)ss+"c ");
    }
}
