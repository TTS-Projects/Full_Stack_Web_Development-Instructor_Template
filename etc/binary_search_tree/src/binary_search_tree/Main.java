package binary_search_tree;

public class Main {
	public static void main(String[] args) {
//		Node root = new Node(5);
//		BinaryTree bst = new BinaryTree();
//		bst.root = root;
		
		
		BinaryTree bt = new BinaryTree();
		
		int[] Nodes = {7, 12, 4, 8, 6, 13, 14, 78, 24, 2};
		
		for (int n : Nodes) {
			bt.add(n);
		}
		System.out.println(bt);
		
	}
}
