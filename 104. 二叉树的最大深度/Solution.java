
public class Solution {
	
	/**
	 * 递归，当前节点+左右子树的最大深度
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDep = maxDepth(root.left);
		int rightDep = maxDepth(root.right);
		if (leftDep > rightDep) {
			return leftDep+1;
		} else {
			return rightDep+1;
		}
	}
	
}