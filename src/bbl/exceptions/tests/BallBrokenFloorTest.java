package bbl.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bbl.exceptions.BallBrokenFloor;
import bbl.exceptions.RangeExceptions;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 100;
	private static final int N_FLOORS_0 = 0;
	@Test
	void test() throws Exception
	{
		assertThrowsExactly(IllegalArgumentException.class,	() -> BallBrokenFloor.getBallBrokenFloor(N_FLOORS_0));
		BallBrokenFloor bbf= BallBrokenFloor.getBallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));

	}

	private int getMinBrokenFloor(BallBrokenFloor bbf) throws Exception 
	{	
		//using binary search algorithm and only method checkFloor
		//of the class BallBrokenFloor 
		//you should find minimal floor, from which a ball will be broken
		
		int down=0;
		int up=bbf.getnFloors();
		int middle=0;

		while(down<=up )
		{		
			middle=down+(up-down)/2;
			try
			{
				bbf.checkFloor(middle);
				down=middle+1;
			}
			catch(Exception ex)
			{
				up=middle-1;		
			}
		}
		return middle;
	}
}
