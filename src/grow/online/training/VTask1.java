package grow.online.training;

public class VTask1 {
    private double Alfa, Beta, Gamma;
    private double SUM;
    public VTask1 (double Alfa, double Beta){
        this.Alfa=Alfa;
        this.Beta=Beta;
    }

    public void Triangle(){
Gamma=180.0-Alfa-Beta;
        SUM=Gamma+Alfa+Beta;
        if(SUM==180.0) {
            System.out.println("Такой треугольник существует");
        if (Alfa==90.0 || Beta==90.0 || Gamma==90.0) System.out.println("Треугольник прямоугольный");
        else System.out.println("Треугольник не прямоугольный");  }
    else System.out.println("Такого треугольника не существует");

    }

}
