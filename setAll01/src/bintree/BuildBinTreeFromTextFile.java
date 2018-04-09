package bintree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuildBinTreeFromTextFile {
	
	public static Node buildtreefromfile(File f) throws IOException
	{
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine ();
		Node root = null;
		
		// go over all the lines in the file
		while(line != null )
		{
			root = addNode2Tree(root, line);
			line = br.readLine ();
		}
		return root;
	}

	public static Node addNode2Tree( Node current, String value)
	{
		if (current == null)
		{
			return new Node(value);
		}
		
		int compare = current.getValue().compareTo(value); 
		
		if ( compare > 0 ) //add to the left
		{
			current.setLeftNode(addNode2Tree(current.getLeftNode(), value));
		}
		else if ( compare < 0 ) // add to the right
		{
			current.setRightNode(addNode2Tree(current.getRightNode(), value));
		}
		else // allready have this value
		{
			return current;
		}
		
		return current;
	}
}
