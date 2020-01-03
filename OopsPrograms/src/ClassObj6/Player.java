package ClassObj6;

public class Player {
     
	private String playn;
	private String playpos;
	public Player(String playerName, String playerPosition) {
	 
		this.playn=playerName;
		this.playpos=playerPosition;
	}
	public String getPlayn() {
		return playn;
	}
	public void setPlayn(String playn) {
		this.playn = playn;
		
	}
	public String getPlaypos() {
		return playpos;
	}
	public void setPlaypos(String playpos) {
		this.playpos = playpos;
	}
	void display()
	{
	System.out.println("Player Details-");
	System.out.println(getClass()+"["+playn+"---"+playpos+"]");
	}
}
