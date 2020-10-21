package grow.online.training;

public class CTask6 {
    public void ASCII(){
        int j=0;
        for(char i=0;i<256;i++, j++){
            if (j<15)
                System.out.print(i + "  ");
            else{
                System.out.print(i+"  ");
                j=0;
            }
        }
    }

}
