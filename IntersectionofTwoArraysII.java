/*https://leetcode.com/problems/intersection-of-two-arrays-ii/description/*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> l =new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])){
                mp.put(nums1[i],mp.get(nums1[i])+1);
            }
            else{
                mp.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i])>0){
                mp.put(nums2[i],mp.get(nums2[i])-1);
                l.add(nums2[i]);
            }
        }
        int[] ans=new int [l.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}
