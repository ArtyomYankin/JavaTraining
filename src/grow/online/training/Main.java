package grow.online.training;

public class Main {

    public static void main(String[] args) {
	Task1 Solution1 = new Task1(4,5,2);
	System.out.println(Solution1.z());
	Task2 Solution2 = new Task2(1,2,3);
	System.out.println(Solution2.Solution());
    Task3 Solution3 = new Task3(Math.PI/2,Math.PI/3);
    System.out.println(Solution3.Solution());
    Task4 Solution4 = new Task4(123.456);
    System.out.println(Solution4.ChangePlace());
    Task5 TimeSolution = new Task5(61);
    TimeSolution.TimeOut();
    Task6 Graphic = new Task6(3,3);
    Graphic.Koordinates();
    VTask1 Corners = new VTask1(60,30);
    Corners.Triangle();
    VTask2 Max = new VTask2(3,6,-2,-5);
    System.out.println("Максимальное:"+Max.MaxValue());
    VTask3 Line = new VTask3(8,3,9,8,10,13);
    Line.OneLine();
    VTask4 Hole = new VTask4(10,7,20,10,6);
    Hole.Brick();
    VTask5 VSolution = new VTask5(3);
    System.out.println("F(X) = " + VSolution.F());
    CTask1 CiklSolution=new CTask1(6);
    System.out.println("Сумма:"+CiklSolution.Sum());
    CTask2 CiklSolution2=new CTask2(-3,5,2);
    CiklSolution2.CalculateFunction();
    CTask3 CiklSolution3 = new CTask3();
    System.out.println("Сумма квадратов первых ста чисел: "+CiklSolution3.SumOfSqr());
        CTask4 CiklSolution4 = new CTask4();
        CiklSolution4.MultiOfSqr();
        CTask5 CiklSolution5 = new CTask5(7,0.001);
        System.out.println(CiklSolution5.SumOfABS());
        CTask6 CiklSolution6 = new CTask6();
        CiklSolution6.ASCII();
        CTask7 CiklSolution7 = new CTask7(11,19);
        CiklSolution7.Deliteli();
        CTask8 CiklSolution8 = new CTask8(145, 269);
        CiklSolution8.Values();
}}
