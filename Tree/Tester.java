import java.util.ArrayList;
import java.util.Iterator;


public class Tester {
public static void main(String[] args)
{   
	LinkTree<Integer> tree = new LinkTree<Integer>();
	tree.addRoot(2);
	Position<Integer> parent = tree.root();
	tree.addNode(5, parent);
	tree.addNode(10, parent);
	Iterable<Position<Integer>> children = tree.children(parent); 
	Iterator<Position<Integer>> it = children.iterator();
	Position<Integer> child1 = it.next();
	tree.addNode(75, child1);
	tree.addNode(40, child1);
	child1 = it.next();
	tree.addNode(95, child1);
	tree.addNode(60, child1);
	children = tree.children(child1);
	it = children.iterator();
	//System.out.println(tree.isInternal(child1));
	while(it.hasNext())
	{
		System.out.println(it.next().element());
	}	
	PositionList<Integer> totpos = new PositionList<Integer>();
	tree.preOrder(tree.root(),totpos);
	Iterator<Position<Integer>> it2 = totpos.iterator();
	System.out.println("Pre Positions from here");
	while(it2.hasNext())
	{
		System.out.println(it2.next().element());
	}
	
	
	PositionList<Integer> totpos2 = new PositionList<Integer>();
	tree.postOrder(tree.root(),totpos2);
	Iterator<Position<Integer>> it3 = totpos2.iterator();
	System.out.println("Post Positions from here");
	while(it3.hasNext())
	{
		System.out.println(it3.next().element());
	}
	
	System.out.println(tree.size);
	
	BinaryTree<Integer> BT = new BinaryTree<Integer>();
	Position<Integer> root = BT.addRoot(4);
	Position<Integer> root_left = BT.insertLeft(2,root);
	Position<Integer> root_right  = BT.insertRight(6,root);
	BT.insertLeft(1,root_left);
	BT.insertRight(3,root_left);
	BT.insertLeft(5,root_right);
	BT.insertRight(7,root_right);
	ArrayList<Position<Integer>> traversal = new ArrayList<Position<Integer>>();
	BT.inOrder(root,traversal);
	for(Position<Integer> elem: traversal )
	{
	System.out.print(elem.element());	
	}
	System.out.println();
	ArrayList<Position<Integer>> traversal2 = new ArrayList<Position<Integer>>();
	//traversal = null;
	BT.eulerTour(root,traversal2);
	for(Position<Integer> elem: traversal2  )
	{
	System.out.print(elem.element());	
	}
	
	
	
}
}
