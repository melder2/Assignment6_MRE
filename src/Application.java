/**
 * @author Nathan Johnson, Bellarmine University
 * @author Michael Elder 
 * 
 * Application class creates a tree, generates a test tree, DFS method returns the tree in 
 * depth first search order, height method returns the height of the tree, and numberOfNodes
 * method returns the number of nodes it traversed 
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		System.out.println("Practice tree: ");
		Node root=aTree.generatePracticeTree(5);//generates values for a practice search
		DepthFirstSearch aSearch=new DepthFirstSearch();//creates aSearch for a new depth first search
		System.out.println("Depth first search order: ");
		aSearch.DFS(root);//puts nodes in a depth first search order
		System.out.println("Height of the tree: ");
		aSearch.Height(root);//returns the height of the tree
		System.out.println("Number of nodes traversed: ");
		aSearch.numberOfNodes(root);//returns the number of nodes traversed
	}//end main

}//end class