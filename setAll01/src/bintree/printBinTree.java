package bintree;

public class printBinTree {
	public static void printtree(Node current)
	{
		if (current == null )
			return;
		
		printtree(current.getLeftNode());
		
		System.out.println("\n"+ current.getValue());
		
		printtree(current.getRightNode());
	}

}
