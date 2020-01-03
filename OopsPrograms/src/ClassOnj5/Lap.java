package ClassOnj5;

import java.util.Scanner;

public class Lap {
   
	private byte lapno;
    private byte thrm;
    private String fastestp;
    private float fasttime;
	public Lap(byte lapno1, byte thrm2, String fastestp3, float fasttime4) {
		//super();
		this.lapno = lapno1;
		this.thrm = thrm2;
		this.fastestp = fastestp3;
		this.fasttime = fasttime4;
	}
	public byte getLapno() {
		return lapno;
	}
	public void setLapno(byte lapno) {
		this.lapno = lapno;
	}
	public byte getThrm() {
		return thrm;
	}
	public void setThrm(byte thrm) {
		this.thrm = thrm;
	}
	public String getFastestp() {
		return fastestp;
	}
	public void setFastestp(String fastestp) {
		this.fastestp = fastestp;
	}
	public float getFasttime() {
		return fasttime;
	}
	public void setFasttime(float fasttime) {
		this.fasttime = fasttime;
	}
	public Lap()
	{   Scanner sc=new Scanner(System.in);
	lapno=sc.nextByte();
	thrm=sc.nextByte();
	fastestp=sc.next();
	fasttime=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Lap:"+lapno);
		System.out.println("Throws:"+thrm);
		System.out.println("Fastest Player:"+fastestp);
		System.out.println("Fastest Time:"+fasttime+"s");

	}
		
}
