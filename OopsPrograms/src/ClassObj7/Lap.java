/**
 * 
 */
package ClassObj7;


public class Lap {
    private byte lapno1;
    private byte throwsMade1;
    private String fastp;
    private float fasttym;
	public Lap(byte lapNo, byte throwsMade, String fastestPlayer, float fastestTime) {
	this.lapno1=lapNo;
	this.throwsMade1=throwsMade;
	this.fastp=fastestPlayer;
	this.fasttym=fastestTime;
	}  
	public byte getLapno1() {
		return lapno1;
	}
	public void setLapno1(byte lap) {
		this.lapno1 = lap;
	}
	public byte getThrowsMade1() {
		return throwsMade1;
	}
	public void setThrowsMade1(byte thro) {
		this.throwsMade1 = thro;
	}
	public String getFastp() {
		return fastp;
	}
	public void setFastp(String faspl) {
		this.fastp = faspl;
	}
	public float getFasttym() {
		return fasttym;
	}
	public void setFasttym(float fastty) {
		this.fasttym = fastty;
	}
	public String toString()
	{
		return this.lapno1+" "+this.throwsMade1+" "+this.fastp+" "+this.fasttym;
	}
    
   // LapManager lmm=new LapManager();
   // lmm.displayFastestInLap(fasttym);
}
