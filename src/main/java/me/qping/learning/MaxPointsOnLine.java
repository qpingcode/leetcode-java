package me.qping.learning;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Point;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class MaxPointsOnLine {

	public int maxPoints(Point[] points) {
		if(points.length == 1){
			return 1;
		}
		//循环两次，得到任意两个点的元组，组成直线
		int length = points.length;
		int max_result = 0;
		for(int i = 0; i < length; i++){
			for(int j = i + 1; j < length; j++){
				int res = 0;
				//循环所有点
				for(int k = 0; k < length; k++){
					//如果在这条直线上，这结果res值+1
					if(judge(points[i], points[j], points[k])){
						res++;
					}
				}
				//如果这点直线上的点比前面的多，则将点的数量赋值给 max_result;
				if(max_result < res){
					max_result = res;
				}
			}
		}
		return max_result;
	}



	/**
	 *  求方程式 y = kx + b 中的k和b
	 *  如果x2=x1 方程式为x=x1
	 *
	 *  先算出斜率 k = (y2-y1)/(x2-x1)
	 *  再算b = y1-k*x1
	 *
	 * 代入可得：
	 *  y-y1 = (y2-y1)*(x-x1)/(x2-x1)
	 *
	 */
	private boolean judge(Point p1, Point p2, Point p3) {
		if(p2.x == p1.x){
			return p3.x == p1.x;
		}else{
			int left = p3.y - p1.y;
			int right_1 = (p2.y - p1.y)*(p3.x - p1.x);
			int right_2 = p2.x - p1.x;

			int right = right_1 / right_2;
			int right_mod =  right_1 % right_2;

			return left == right & right_mod == 0;
		}
	}


}