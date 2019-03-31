package me.qping.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * @ClassName CoinChage
 * @Description
 * You are given coins of different denominations and a total amount of money amount.
 * Write a function to compute the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * Example 1:
 *
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 *
 * @Author qping
 * @Date 2019/3/31 14:54
 * @Version 1.0
 **/
public class CoinChage {


    public int coinChange(int[] coins, int amount) {

        /**
         *
         * coins = [7, 5, 2, 1]
         * amount = 50
         * Explanation = 7 * 7 + 1 * 1;
         * output = 8
         *
         * 思考：
         * 1、类似于数学问题
         *          函数： a1 * m1 + a2 * m2 + ...... + an * mn = amount
         *          给定 m1、m2、....、mn 和 amount
         *          求 a1 + a2 + .... + an 的最小值
         *
         * 2、优先使用大额度的钞票，output才会是最小
         *    比如 coins = [1, 2, 5]  amount = 15
         *    可以得出： (3) * 5 = 15 ==> output = 3
         *
         * 3、如果大额的钞票不能凑整，则使用小额面值
         *    比如 coins = [1, 2, 5] amount = 14
         *    可以得出： (2) * 5 + (2) * 2 ==> output = 4
         *
         * 4、如果优先使用大额钞票后，剩下的无法凑成amount的问题，则 大额钞票数 -1 继续运算。
         *    比如 coins = [3, 13, 14] amount = 30
         *    可以得出： 30 除以 14 等于 2 余 2，无法凑整
         *    可以使用： (1) * 14 + (1) * 13 + (1) * 3 ==> output = 3
         *
         * 5、如果钞票面额相差过于接近，比如 coins = [15,14,1]  amount=28 ，
         *    优先使用大额，结果为 (1) * 15 + (13) * 1，期望结果应该是 (2) * 14，
         *    为解决这个问题，需要遍历所有的情况才能得出最终结果
         *
         * 6、如果当前计算的 output 大于之前计算的 output，可以终止循环，节省时间
         *
         */

        // 从小到排序
        Arrays.sort(coins);

        // 优先使用大额钞票，然后凑小额
        int[] results = new int[1];
        results[0] = -1;
        useCoin(coins, coins.length - 1, amount, 0, results);
        return results[0];
    }

    public static void useCoin(int[] coins, int coinIndex, int amount, int pre, int[] results){

        int m1 = coins[coinIndex];
        int a1 = amount / m1;
        int left = amount % m1;

        if(left == 0){
            int tempResult = a1 + pre;
            if(results[0] == -1 || results[0] > tempResult){
                results[0] = tempResult;
            }
        }

        if(coinIndex == 0){
            return;
        }

        for(int i = a1; i >= 0; i--){
            if(results[0] != -1 && results[0] <= (pre + i)){
                break;
            }
            useCoin( coins, coinIndex - 1, amount - (i * m1),pre + i, results);
        }
    }

    public static void main(String[] args) {

        int[] coins = {77,82,84,80,398,286,40,136,162};
        int amount = 9794;
        long begin = new Date().getTime();
        int result = new CoinChage().coinChange(coins, amount);
        long end = new Date().getTime();


        System.out.println("cost time : " + (end - begin));
        System.out.println("result : " + result);
    }

}
