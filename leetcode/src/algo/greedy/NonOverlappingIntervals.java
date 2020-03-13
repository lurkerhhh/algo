package algo.greedy;

import java.util.*;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length == 0) {
            return 0;
        }
        // 结尾早的靠前
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int count = 1;
        int pre = 0;
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] >= intervals[pre][1]) {
                count++;
                pre = i;
            }
        }
        return intervals.length - count;


    public static void main(String[] args) {
        int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};

        System.out.println((new NonOverlappingIntervals()).eraseOverlapIntervals(intervals1));
    }
}
