package src;

public class PostOrderTraversal {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
		this .data=data;
		this.left=null;
		this.right=null;
		
		}
	}
		static class BinaryTree{
			static int  idex=-1;
			public static Node buildTree(int node[]) {
				idex++;
				if(node[idex]==-1) {
					return null;
				}
				Node newNode=new Node(node[idex]);
				newNode.left=buildTree(node);
				newNode.right=buildTree(node);
				return newNode;
			}
			
		}
	public static void postOder(Node root) {
		if(root==null) {
			return;
		}
		postOder(root.left);
		postOder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public static void main(String[] args) {
		int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt=new BinaryTree();
		Node root=bt.buildTree(node);
		postOder(root);
	}
}
