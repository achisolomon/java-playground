package bintree;

public class Node {
	private String value = null;
	private Node leftNode = null;
	private Node rightNode =null;
	
	
	public Node(String value2) {
		value  = value2;
	
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	
	@Override
	public String toString()
	{
		String left =null;
		String right = null;
				
		if ( leftNode != null)
			left = leftNode.toString();
		if ( rightNode != null )
			right = rightNode.toString();
		
		return "\n my value:"+ value ;	
	}
}
