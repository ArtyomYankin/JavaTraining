package grow.online.training;
import java.util.ArrayList;
public class CTask8 {
    private int a,b;
    public CTask8(int a,  int b){
        this.a=a;
        this.b=b;
    }
    public void Values()
    {
        System.out.println("a: "+numberEnter(a));
        System.out.println("b: "+numberEnter(b));
    }
    public static ArrayList numberEnter(int c){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(c > 0){
            int i = 0;
            array.add(i, c % 10);
            c = c / 10;
            i++;
        }
        return array;

}

}
