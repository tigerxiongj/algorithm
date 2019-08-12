
public class Solution {
	
	/**
	 * �ݹ飬��ǰ�ڵ�+����������������
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