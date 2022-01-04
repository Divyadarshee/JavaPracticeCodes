public class BFSforBST {
 Node root;
 public BFSforBST() {
 root = null;
 }
  void printLevelOrder() {
    int h = getLevelHeight(root);
    for(int i =0;i<h;i++) {
      void printGivenLevel(root, i);
    }
  }
  
  public int getLevelHeight(Node node) {
    if(root==null) reuturn 0;
    return 1+ Math.max(getLevelHeight(node.left), getLevelHeight(node.right));
  }
  public void printGivenLevel(Node root, int level) {
    if(root == null) return;
    if(level==0) System.out.println(root.val+ " ");
    else {
      printGivenLevel(root.left, level-1):
      printGivenLevel(root.right, level-1);
    }
  }
