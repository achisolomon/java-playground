package bintree;

public class findValueInTree {
	public static boolean findValInTree(Node n, String val)
	{
		//not found
		if ( n == null)
			return false;
		
		int compare = val.compareTo(n.getValue() );
		if (compare ==0) //found!
			return true;
		else if ( compare > 0 ) // search bigger values
			return findValInTree(n.getRightNode(), val);
		else // search smaller values
			return findValInTree(n.getLeftNode(), val); 
		
	}
	
	
	public static boolean findValinTreeWhile(Node n, String val) 
	{
		if ( n == null)
			return false;
		
		while ( n != null)
		{
			int compare = val.compareTo(n.getValue());
			if ( compare == 0  )
				return true;
			else if ( compare < 0 )
			{
				n = n.getLeftNode();
			}
			else if ( compare > 0 )
			{
				n = n.getRightNode();
			}
		}
		
		return false;
		
	}
}
