/*https://leetcode.com/problems/largest-rectangle-in-histogram/description/*/
class Solution {
    public int []prevSmaller(int[]heights){
        int []prev=new int [heights.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prev[i]=-1;
            }
            else{
                prev[i]=s.peek();
            }
            s.push(i);
        }
        return prev;

    }
      public int []nextSmaller(int[]heights){
        int []next=new int [heights.length];
        Stack<Integer>s=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=heights.length;
            }
            else{
                next[i]=s.peek();
            }
            s.push(i);
        }
        return next;

    }
    public int largestRectangleArea(int[] heights) {
     int []prev=prevSmaller(heights);
     int []next=nextSmaller(heights);
int maxAns=0;
     for(int i=0;i<heights.length;i++){
int curr=(next[i]-prev[i]-1)*heights[i];
maxAns=Math.max(maxAns,curr);
     }   
     return maxAns;
    }
}
