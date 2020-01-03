package ClassObj4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String teamName;
		String cityRepresented;
		Team t=new Team();
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team name:");
		teamName=sc.next();
		System.out.println("Enter city represented:");
		cityRepresented=sc.next();
		do {
			System.out.println("\n");
		System.out.println("VERIFY AND UPDATE DETAILS");
		System.out.println("1. Update Team Name\n2. Update City Represented\n3. Save and Exit");
		System.out.println("\n");
		System.out.println("Enter your choice");	
		i=sc.nextInt();
		if(i==1)
		{
			System.out.println("Enter Team:");
			teamName=sc.next();
			System.out.println("\n");
		}
		else if(i==2)
		{
			System.out.println("Enter City:");
			cityRepresented=sc.next();
			System.out.println("\n");
		}
		else if(i==3)
		{
			System.out.println("Thank you!");
			break;
		}
		t.setTeamName(teamName);
		t.setCityRepresented(cityRepresented);
		t.display();
		}while(i!=0);
	}

}
