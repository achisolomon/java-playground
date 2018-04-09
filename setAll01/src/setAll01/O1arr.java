package setAll01;

public class O1arr {
	private Integer [] arr = null;
	private Integer joker = null;
	
	O1arr(int lenght)
	{
		arr = new Integer [lenght];	
	}
	
	public void set(int index, Integer value)
	{
		joker=null; // turn  off Joker
		arr[index]= value;
	}
	
	public void setAll ( Integer value)
	{
		joker = value;
	}
	
	public Integer get( int index ) 
	{
		if (joker != null)
		{
			return joker;
		}
		return arr[index];
	}
}
