
public class Fraction {

	public float nb1= 1.0;
	public float nb2 = 2.0;
	
	public static float Fraction()
	{
		float res=0;
		res = nb1/nb2;
		return res;
	}
	
	public String toString(float nb) {
		   return "Fraction de " + this.nb1 + " et de " + this.nb2 +
			  " est égal à " + nb;
		}

}
