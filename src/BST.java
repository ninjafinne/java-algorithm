/*
* Work in progress -- Binary Search Tree
*/

public final class BST {
	public void insert(int val) {
		root = insert(root, val);
	}
	
	public boolean contains(int val) {
		return contains(root, val);
	}
	
	public int size() {
		return size(root);
	}
		
	private int size(Node cur) {
		int sz = 0;
		if (cur != null) {
			sz++;
			sz += size(cur.left);
			sz += size(cur.right);	
		}
		return sz;
	}
	
	public void print() {
		final int depth = max_depth(root);
		System.out.println("printing depth: " + depth);
		for (int i = 0; i <= depth; i++) {
			printDepth(root, depth, i, 1);
			System.out.println();
		}
	}
	
	public void printOrder() {
		printOrder(root);
		System.out.println();
	}
	
	private void printOrder(Node cur) {
		if (cur != null) {
			printOrder(cur.left);
			System.out.print(cur.val + " ");
			printOrder(cur.right);
		}
	}
	
	private int max_depth(Node cur) {
		if (cur == null)
			return 0;
		final int left = max_depth(cur.left);
		final int right = max_depth(cur.right);
		if (left > 0 || right > 0)
			return left > right ? left + 1 : right + 1;
		return 1;
	}
	
	private void printDepth(Node cur, int max, int target, int level) {
		if (target == level) {
			for (int i = 0; i < (max - level + 1) * 2 ; i++) {
				System.out.print(" ");
			}
			if (cur == null) {
				System.out.print("-");
			} else {
				System.out.print(cur.val);
			}
		} else {
			if (cur != null) {
				printDepth(cur.left, max, target, level + 1);
				printDepth(cur.right, max, target, level + 1);
			}	
		}
	}
	
	private boolean contains(Node cur, int val) {
		if (cur == null)
			return false;
		return cur.val == val || contains(cur.left, val) || contains(cur.right, val);
	}
	
	private Node insert(Node cur, int val) {
		//System.out.println("val (" + val + ") at: " + cur + "\n");
		if (cur == null) {
			return new Node(val);
		}
		if (cur.val > val)
			cur.left = insert(cur.left, val);
		if (cur.val < val)
			cur.right = insert(cur.right, val);
		return cur;
	}
	
	private final class Node {
		final int val;
		Node left = null;
		Node right = null;
		Node(int _val) { val = _val; }
	}
	private Node root = null;
}
/*
public static void main(String[] args) {
	BST bst = new BST();
	bst.insert(5);
	bst.insert(3);
	bst.insert(4);
	bst.insert(6);
	bst.insert(7);
	bst.insert(8);
	bst.insert(2);
	if (bst.contains(1))
		System.out.println("Should not have 1!");
	if (bst.contains(8))
		System.out.println("yes, 8!");
	System.out.println("done");
	bst.print();
	bst.printOrder();
	System.out.println("Size: " + bst.size());
}
*/