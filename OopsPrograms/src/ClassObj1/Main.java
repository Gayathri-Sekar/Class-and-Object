package ClassObj1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String teamName;
		String cityRepresented;
		Scanner sc=new Scanner(System.in);
		teamName=sc.nextLine();
		cityRepresented=sc.next();
		Team t=new Team(teamName,cityRepresented);
		
		

	}

}
