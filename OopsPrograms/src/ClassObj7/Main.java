package ClassObj7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		byte lapNo;
		byte lapNo1;
		byte throwsMade;
		String fastestPlayer;
        float fastestTime;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of laps:");
        lapNo=sc.nextByte();
        lapNo1=lapNo;
        String[] temp=new String[lapNo1];
        Lap l[]=new Lap[lapNo1];
        for(byte i=0;i<lapNo1;i++)
        {
        	System.out.print("Enter details of lap "+(i+1)+":");
        throwsMade=sc.nextByte();
        fastestPlayer=sc.next();
        fastestTime=sc.nextFloat();
        lapNo=(byte) (i+1);
         l[i]=new Lap(lapNo,throwsMade,fastestPlayer,fastestTime);
        temp[i]=l[i].toString();
        LapManager lp=new LapManager(temp[i],i);
        }
        LapManager lm=new LapManager();
        int num;
        
        do
        {
        System.out.print("LAP MANAGER\n1. Lap Details\n2. Fastest in Lap\n3. Maximum Throws\n4. Exit"); 	    	
        System.out.print("\nEnter choice:");
        num=sc.nextInt();
        if(num==1)
        {
        	System.out.print("LAP THROWS FASTEST PLAYER TIME\n");
        for(int i=0;i<lapNo1;i++)
        { 
        lm.display(l[i]);
       // System.out.print("\n");
        }
        }
        else if(num==2)
        {
        	for(int i=0;i<lapNo1;i++)
          lm.displayFastestInLap();
        }
        }while(num!=1);
	}

}
