/**
 * 
 */

/**
 * @author Bhavana Goud
 *
 */
public class SimpleCompound {


		/**
		 * simple interest
		 * @parameters principle, rateOfInterest, time
		 */

		public double simpleInterest(double principle,double rateOfInterest,double time)
		{
			return (principle*time*rateOfInterest);
		}
		/**
		 * compound interest
		 * @param principle,rateOfInterest,time
		 */
		public double compoundInterest(double principle,double rateOfInterest,double time)
		{
			return principle*(Math.pow((1+rateOfInterest/100), time));
		}


}
