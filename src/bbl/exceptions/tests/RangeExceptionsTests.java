package bbl.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bbl.exceptions.NumberGreaterRangeMaxException;
import bbl.exceptions.NumberLessRangeMinException;
import bbl.exceptions.RangeExceptions;

class RangeExceptionsTests {

	@Test
	void factoryMethodTest() throws NumberGreaterRangeMaxException, NumberLessRangeMinException
	{	 
			RangeExceptions range = RangeExceptions.getRangeException(3, 30);
			assertThrowsExactly(IllegalArgumentException.class,
					() -> RangeExceptions.getRangeException(30, 3));
			range.checkNumber(5);
			assertThrowsExactly(NumberGreaterRangeMaxException.class,
					() -> range.checkNumber(35));
			assertThrowsExactly(NumberLessRangeMinException.class,
					() -> range.checkNumber(2));
			
	}

}
