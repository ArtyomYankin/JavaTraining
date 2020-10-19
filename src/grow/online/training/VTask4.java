package grow.online.training;

public class VTask4 {
    private double A, B;
    private double WallMax,WallMin;
    private double x,y,z;
    private double BrickMin,BrickMiddle;

    public VTask4(double A, double B, double x, double y, double z){
        this.A=A;
        this.B=B;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void Brick(){
        WallMax=Math.max(A,B);
        WallMin=Math.min(A,B);
        BrickMin=Math.min(x,Math.min(z,y));
     if (x<y && x>z)
         BrickMiddle=x;
     else if (y<x && y>z)
         BrickMiddle=y;
     else BrickMiddle=z;
        System.out.println(WallMax+" "+WallMin+" "+ BrickMin+" "+BrickMiddle);
        if (WallMax>=BrickMiddle && WallMin>=BrickMin)
            System.out.println("Кирпич пройдёт в отверстие");
        else System.out.println("Кирпич не пройдёт в отверстие");
    }
}
