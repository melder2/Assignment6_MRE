/**
 * 
 * @author Michael Elder
 * Assignment 6 
 * DepthFirstSearch class creates methods that put the tree in a depth first search order, finds the height, and finds the number of nodes it traversed. 
 */
public class DepthFirstSearch {       
       Node root;
       
       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }//end constructor
       
       /**
        * Depth First Search(DFS) method returns the tree traversed in depth first search order.
        * @param node
        */
       public void DFS(Node node)        {
           if(node == null) {
        	   return;
           }//end if statement
           
           System.out.println(node.getData());//prints out the data from the node
           DFS(node.getlChild());//calls the DFS method on the left subtree
           DFS(node.getrChild());//calls the DFS method on the right subtree

        }//end DFS method
        
       /**
        * Height method returns the height of the tree
        * @param node
        * @return
        */
        public int Height(Node node) {
        	if(node == null)
        	{
        		return 0;
        	}//end if statement
        	int leftSubtree = Height(node.getlChild());//getting the height of the left subtree
        	int rightSubtree = Height(node.getrChild());//getting the height of the right subtree
        	return 1 + Math.max(leftSubtree, rightSubtree);//getting the height of tree
        	
        }//end Height method
        
        /**
         * numberOfNodes method returns the number of nodes that it traversed
         * @param node
         * @return
         */
        public int numberOfNodes(Node node) {
        	if(node == null) {
        		return 0;
        	}//end if statement
        	int leftSubtree = numberOfNodes(node.getlChild());//getting the number of nodes traversed in the left subtree
        	int rightSubtree = numberOfNodes(node.getrChild());//getting the number of nodes traversed in the right subtree
        	return 1 + leftSubtree + rightSubtree;//returns the total of numbers traversed by adding the root, left subtree, and right subtree
        }//end numberOfNodes method
        
}//end class