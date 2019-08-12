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
	 * �Ѿ����㱻ɾ���Ľڵ㣬û�а취��ȡ�ýڵ��ǰһ���ڵ�
	 * ����һ���ѵ�ǰ�ڵ���ֵ����ǰ�ƶ�һλ��ɾ������һ���ڵ�
	 * ������������һ���ڵ��ֵ��ǰ�ƶ���ɾ����һ���ڵ�
	 * @param node
	 */
    public void deleteNode(ListNode node) {
        s2(node);
    }
    
    //��ǰ�ڵ㲻�����һ��
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
    
    //��ǰ�ڵ㲻�����һ��
    private void s2(ListNode node) {
    	node.val=node.next.val;
    	node.next=node.next.next;
    }
}