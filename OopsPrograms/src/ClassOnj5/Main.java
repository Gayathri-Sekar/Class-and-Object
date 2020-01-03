package ClassOnj5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		byte lapNo;                                
		byte  throwsMade;             
		String fastestPlayer;                                  
		Float  fastestTime;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Laps:");
		num=sc.nextInt();
		Lap l[]=new Lap[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter the Details of lap :");
		lapNo=sc.nextByte();
		throwsMade=sc.nextByte();
		fastestPlayer=sc.next();
		fastestTime=sc.nextFloat();	
		System.out.print("\n");
		l[i]=new Lap(lapNo,throwsMade,fastestPlayer,fastestTime);
       // Lap l2=new Lap();
		}
		System.out.println("Lap Details:\n");
		for(int i=0;i<num;i++)
		{	
        //Lap l2 = null;
		//l2.display();
       // Lap l = null;
		l[i].display();
		}
        
        
        //l1.Lap;
	}

}
