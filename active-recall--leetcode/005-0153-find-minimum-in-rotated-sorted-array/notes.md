# 153 Find Minimum in Rotated Sorted Array
Def: Rotated as one end of an array is cycled back to the other end.  
Example: [0, 1, 2, 3, 4] -> [3, 4, 0, 1, 2]

If we were to approach this linearly, we could go for a pivot point.
However, this problem requires an algorithm that is $O(log\ n)$ so we cannot use a linear search.
This is a huge hint as we can use a modified binary search.

Notice that we have an array that is really two separately sorted array.  
Example: $[3, 4, 5, 1, 2]$  
When searching this for the minimum value, our global minimum may be smaller than the local minimum that we have stepped into. So we will need to keep track of both minimums and set our global minimum to the value of `min()`.

For our example, let: $l=3$, $m=5$, and $r=2$.  
If our $m$ is smaller than our $r$, our minimum value should be in the range of $l$ and $m$.  
If our $m$ is larger than our $r$, our minimum value should be in the range of $m$ and $r$.  

```python
class Solution():
    def findMinInSorted(nums:List[int]):
        res = nums[0]
        l, r = 0, len(nums)-1

        while l <= r:
            if nums[l] < nums[r]:
                res = min(res, nums[l])
                break

            m = (l + r) // 2
            res = min(res, nums[m])
            if nums[m] >= nums[l]:
                l = m + 1
            else:
                r = m - 1
        
        return res
```