package ClassObj3;

public class PlayerRecord {
      private byte num;
      private byte loss;
      private float avgspeed;
      private float maxlap;
      private float avgthrow;
	public PlayerRecord(byte numOfWins, byte numOfLosses, float avgLapSpeed, float maxLapSpeed, float avgThrowDistance,
			float maxThrowDistance) {
		this.num=numOfWins;
		this.loss=numOfLosses;
		this.avgspeed=avgLapSpeed;
		this.maxlap=maxLapSpeed;
		this.avgthrow=avgThrowDistance;
	}
	void Display()
	{
		System.out.println(num);
		System.out.println(loss);
		System.out.println(avgspeed);
		System.out.println(maxlap);
		System.out.println(avgthrow);
	}

}
