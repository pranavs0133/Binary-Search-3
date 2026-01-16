//TC = O(n - k)
//SC = O(1)

/*
Start with a window covering the entire array and shrink it until its size becomes k.
At each step, remove the element farther from x by comparing both ends.
Since the window shrinks n - k times, the time complexity is O(n - k).
*/

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

        while((right - left + 1) != k) {
            if(arr[left] - x >= x - arr[right]) {
                right--;
            } else {
                left++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = left;i<=right;i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
