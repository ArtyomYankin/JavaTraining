package grow.online.training;

public class CTask3 {
    private int SUM;
    public int SumOfSqr(){
        for (int i=1;i<101;i++)
        {
            SUM+=i*i;
        }
        return SUM;
    }
}
