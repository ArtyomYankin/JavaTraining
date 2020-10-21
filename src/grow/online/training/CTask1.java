package grow.online.training;

public class CTask1 {
    private int Value;
    private int SUM=0;
    public CTask1(int Value){
        this.Value=Value;
    }
    public int Sum(){
        for (int i=1;i<Value;i++)
        {
            SUM+=i;
        }
        return SUM;
    }
}
