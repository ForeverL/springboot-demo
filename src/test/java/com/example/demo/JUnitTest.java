package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author: hansong
 * @date: 2023/09/11 10:46
 * @desc:TODO
 * @department:
 */
public class JUnitTest {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        Map<Integer, Integer> rstMap = new LinkedHashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (rstMap.get(nums1[i]) == null) {
                rstMap.put(nums1[i], 0);
            } else {
                rstMap.put(nums1[i], rstMap.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (rstMap.get(nums2[i]) == null) {
                rstMap.put(nums2[i], 0);
            } else {
                rstMap.put(nums2[i], rstMap.get(nums2[i]) + 1);
            }
        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> rstList = new ArrayList<>();

        int offset = 0;
        for (int i = 0; i < nums1.length;i++) {
            if (i >= m) {
                for (int j = offset; j < nums2.length; j++) {
                    rstList.add(nums2[j]);
                    offset++;
                }
            } else {


                for (int j = offset; j < nums2.length; j++) {
                    if (nums1[i] > nums2[j]) {
                        rstList.add(nums2[j]);
                        offset++;
                    } else {
                        rstList.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        System.out.println(rstList);
    }

    @Test
    public void test01() {
        System.out.println("junit test");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }


    @Test
    public void testMerge() {
        int m = 2;
        int n = 3;
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        nums1[0] = 0;
        nums1[1] = 6;

        nums2[0] = -4;
        nums2[1] = -2;
        nums2[2] = 0;

        merge1(nums1, m, nums2, n);

        //System.out.println(Arrays.asList(nums1));

    }

}
