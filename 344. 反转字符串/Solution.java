class Solution {
	
	/**
	 * 头尾指针
	 * @param s
	 */
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<j) {
        	char t = s[i];
        	s[i] = s[j];
        	s[j] = t;
        	i++;
        	j--;
        }
    }
}