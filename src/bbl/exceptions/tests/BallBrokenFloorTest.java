package bbl.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bbl.exceptions.BallBrokenFloor;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 100;
	@Test
	void test() throws Exception
	{
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
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
