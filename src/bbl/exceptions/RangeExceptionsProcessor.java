package bbl.exceptions;

public class RangeExceptionsProcessor 
{
private RangeExceptions rangeExceptions;
private int counterGreateMax;
private int counterLessMin;
private int counterRange;
	public RangeExceptionsProcessor(RangeExceptions rangeException)
	{
		this.rangeExceptions=rangeException;
	}
	public void numberProcessor(int number)
	{		
		try
		{
			rangeExceptions.checkNumber(number);
			counterRange++;
		}
		catch (NumberGreaterRangeMaxException e)
		{
			counterGreateMax++;
		}
		catch (NumberLessRangeMinException e)
		{
			counterLessMin++;
		}
	}
	public RangeExceptions getRangeExceptions()
	{
		return rangeExceptions;
	}
	
	
	public int getCounterGreateMax()
	{
		return counterGreateMax;
	}
	
	public int getCounterLessMin()
	{
		return counterLessMin;
	}
	
	public int getCounterRange()
	{
		return counterRange;
	}	
	
}
