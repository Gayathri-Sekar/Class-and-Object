package ClassObj3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		byte numOfWins;
		byte numOfLosses;
		float avgLapSpeed;
		float maxLapSpeed;
		float avgThrowDistance;
		float maxThrowDistance;
		Scanner sc=new Scanner(System.in);
		numOfWins=sc.nextByte();
		numOfLosses=sc.nextByte();
		avgLapSpeed=sc.nextFloat();
		maxLapSpeed=sc.nextFloat();
		avgThrowDistance=sc.nextFloat();
		maxThrowDistance=sc.nextFloat();
		PlayerRecord pr=new PlayerRecord(numOfWins,numOfLosses,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
		pr.Display();
		
	}

}
