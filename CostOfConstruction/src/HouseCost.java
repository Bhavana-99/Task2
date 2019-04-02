/**
 * 
 * @author A.Bhavana Goud
 *
 */
 
 
 public class HouseCost{
 
 
   public Long calculateCost(Long materialType,Long areaOfHouse,boolean isAutomated)
	{
		Long cost=0L;
		if(materialType==1) // if option 1 is given we take is as standard material
			cost=1200L;
		else if(materialType==2) // 2 as above standard material
			cost=1500L;
		else if(materialType==3 && isAutomated) // 3 as high standard material and fully automated home
			cost=2500L;
		else // else we take it as high standard material
			cost=1800L;
		return areaOfHouse*cost; // Cost is product of area of the cost and Cost for material type 
		
	}
 
   }

