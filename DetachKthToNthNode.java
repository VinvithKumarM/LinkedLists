package LearnLinkedLists;

public class DetachKthToNthNode {

	
	public Node detachFewNodesAt(Node node, int k) {
	Node current, follower;
	current = node;
	follower = node;
	
	for(int i=0;i<k;i++)
	{
		while(current.next!= null)
		{
			current = current.next;
		}
		if(current.next == null) return null;
		
	}
	follower = follower.next;
	
	while(current.next!= null)
	{
		current = current.next;
		follower = follower.next;
	}
	return follower;
}
}
