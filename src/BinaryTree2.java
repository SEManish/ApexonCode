package src;

public class BinaryTree2 {
	
	public static void main(String[] args) {
		BinaryTree2 a=new BinaryTree2();
		a.tree();
	}
		
	public void tree() {
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(4);
		node.right.right=new TreeNode(5);
		System.out.println("Inorder Traversal:");
        inorderTraversal(node);
	}
	
	  void inorderTraversal(TreeNode node){
		if(node==null) {
			return;
		}
	inorderTraversal(node.left);
	System.out.print(node.value+ " ");
	inorderTraversal(node.right);
	}
	  
	  
	  
	class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value){
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	
	
}
