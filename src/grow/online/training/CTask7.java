package grow.online.training;

public class CTask7 {
    private int m,n;
    public CTask7(int m, int n){
        this.m=m;
        this.n=n;
    }
    public void Deliteli(){
         while (m<=n){
             System.out.print(m +": ");
             for (int i=2;i<m-1;i++)
             {
                 if (m%i==0) System.out.print(i+" ");
             }
             System.out.println();
             m++;
         }

    }
}
