package Intro;

import java.util.HashMap;

public class Solution {
    static int researchIndex(int arr[]) {
        int h = 0;

        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {

            Integer currentCount = counter.get(arr[i]);
            System.out.println(currentCount);
            if (currentCount == null) {
                counter.put(arr[i], 1);
            } else {
                counter.put(arr[i], currentCount + 1);
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int[] test = { 1, 1, 3, 4, 4, 4, 5, 7 };
        researchIndex(test);
    }
}