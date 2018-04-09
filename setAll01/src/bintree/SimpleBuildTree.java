package bintree;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleBuildTree {
	private Node root=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try 
		{
			root = BuildBinTreeFromTextFile.buildtreefromfile(new File ("/Users/achisolomon/Documents/GitHub/setAllO1/setAll01/bin/bintree/input.txt"));
			printBinTree.printtree(root);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@After
	public void tearDown() throws Exception {
		root =null;
	}

	@Test
	public void test() {
		String value = "G";
		boolean found = findValueInTree.findValInTree(root, value);
		System.out.println(" value "+value+" is found in tree? "+ found);
		assert (found ==true);
	}
	
	@Test
	public void testwhile()
	{
		String value = "C";
		boolean found = findValueInTree.findValinTreeWhile(root, value);
		System.out.println(" while - value "+value+" is found in tree? "+ found);
		assert((found==true));
	}

	
	

}
