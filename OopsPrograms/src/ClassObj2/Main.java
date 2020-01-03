package ClassObj2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String PlayerName;
		String PlayerPosition;
		Scanner sc=new Scanner(System.in);
		PlayerName=sc.nextLine();
		PlayerPosition=sc.next();
        Player p=new Player(PlayerName,PlayerPosition);
        
        
	}

}
