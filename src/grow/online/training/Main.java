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
}}
