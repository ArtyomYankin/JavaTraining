package grow.online.training;

public class Task4 {
    private double SomeValue;
    public Task4(double SomeValue){
        this.SomeValue=SomeValue;
    }
    double ChangePlace(){
        return (((SomeValue*1000)%1000)+((int)SomeValue/1000.0));
    }
}
