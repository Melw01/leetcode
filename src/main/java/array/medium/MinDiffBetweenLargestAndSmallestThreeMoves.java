package array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * #1509
 */
public class MinDiffBetweenLargestAndSmallestThreeMoves {
    public int solve(int[] nums) {
        int numSize = nums.length;
        if (numSize <= 4) return 0;

        // Priority Queue in Java is minHeap by default. By
        // putting Collections.reverseOrder, it turs into maxHeap
        // such that the largest element is given the highest priority
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > 4) {
                //maxHeap.poll() method in Java retrieves and
                //removes the element with the highest priority
                //from the PriorityQueue
                maxHeap.poll();
            }
        }
        List<Integer> smallestFour = new ArrayList<>(maxHeap);
        Collections.sort(smallestFour);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > 4) {
                minHeap.poll();
            }
        }

        List<Integer> largestFour = new ArrayList<>(minHeap);
        Collections.sort(largestFour);

        int minDiff = Integer.MAX_VALUE;

        // total of 4 scenarios to compute the minimum difference
        for (int i = 0; i < 4;i++) {
            minDiff = Math.min(minDiff, largestFour.get(i) - smallestFour.get(i));
        }
        return minDiff;
    }
}
