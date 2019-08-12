import org.junit.Test;

public class Solution {
	
	@Test
	public void test() {
		ListNode t = null;
		ListNode a = new ListNode(4);
		ListNode node = new ListNode(5);
		a.next=node;
		t=node.next=new ListNode(1);
		t.next=new ListNode(9);
		deleteNode(node);
		System.out.println(a);
	}
	
	/**
	 * 已经给点被删除的节点，没有办法获取该节点的前一个节点
	 * 方法一：把当前节点后的值都往前移动一位，删除最后的一个节点
	 * 方法二：把下一个节点的值往前移动，删除下一个节点
	 * @param node
	 */
    public void deleteNode(ListNode node) {
        s2(node);
    }
    
    //当前节点不是最后一个
    private void s1(ListNode node) {
        ListNode curr = node;
        ListNode pre = null;
        for (curr = node; curr != null; curr = curr.next) {
        	if (curr.next != null) {
        		curr.val = curr.next.val;
        	}
        	if (curr.next != null) {
        		pre = curr;
        	}
        }
        pre.next = null;
    }
    
    //当前节点不是最后一个
    private void s2(ListNode node) {
    	node.val=node.next.val;
    	node.next=node.next.next;
    }
}