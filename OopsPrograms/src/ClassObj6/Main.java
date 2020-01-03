package ClassObj6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String playerName;
		String playerPosition;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player name:");
		playerName=sc.next();
		System.out.println("Enter player position:");
		playerPosition=sc.next();
        Player p=new Player(playerName,playerPosition);
        p.display();
        //System.out.println(p.getclass());
	}

}
