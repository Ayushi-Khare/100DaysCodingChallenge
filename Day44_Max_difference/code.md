```java
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[4];
        arr[0]=nums[nums.length-1];
        arr[1]=nums[nums.length-2];
        arr[2]=nums[0];
        arr[3]=nums[1];
        int x = (arr[0]*arr[1])-(arr[2]*arr[3]);
        return(x);
    }
}
```
