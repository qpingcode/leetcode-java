package me.qping.learning;

import java.util.Arrays;

/**
 * @ClassName ProductOfArrayExceptSelf
 * @Description
 *     Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *     Example:
 *     Input:  [1,2,3,4]
 *     Output: [24,12,8,6]
 *     Note: Please solve it without division and in O(n).
 *     Follow up:
 *     Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 * @Author qping
 * @Date 2019/3/17 15:54
 * @Version 1.0
 **/
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        // 最简单方法的是两层嵌套循环，或者求出所有值的乘积，然后再循环除以数组中的每个数
        // 题目要求不能使用除法，并且算法复杂度要为O(n)
        // 解题思路是第一次从左到右，依次累积得到 left[] ，第二次从右到左依次累计得到 right[]，除了自己以外的相乘 = left[i] * right[i]
        int len = nums.length;
        int [] output = new int[len];
        output[0] = 1;

        for(int i = 1; i < len; i++){
            output[i] = output[i - 1] * nums[i - 1];
        }

        int right = 1;
        for(int j = len - 1; j >= 0; j --){
            output[j] = output[j] * right;
            right = right * nums[j];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,4
        };


        int [] oupt = new ProductOfArrayExceptSelf().productExceptSelf(arr);
        System.out.println(Arrays.toString(oupt));
    }


}
