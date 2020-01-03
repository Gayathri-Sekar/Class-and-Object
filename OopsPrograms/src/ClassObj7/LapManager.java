package ClassObj7;

public class LapManager {

	
  // private String si[];
	String[] t=new String[100];
	public LapManager(String s,byte b) {
		int num=(int)b;
		 t[num]=s.split(" ");
}
	public void display(Lap l)
	{
		//for(int i=0;i<3;i++)
		System.out.print(l+"\n");
	}
    public void displayFastestInLap(String s)
    {
      	
      	
    }
    
}
