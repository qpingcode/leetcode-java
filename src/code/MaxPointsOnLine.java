package code;

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
    	//ѭ�����Σ��õ������������Ԫ�飬���ֱ��
    	int length = points.length;
    	int max_result = 0;
    	for(int i = 0; i < length; i++){
    		for(int j = i + 1; j < length; j++){
    			int res = 0;
    			//ѭ�����е�
    			for(int k = 0; k < length; k++){
    				//���������ֱ���ϣ�����resֵ+1
    				if(judge(points[i], points[j], points[k])){
    					res++;
    				}
    			}
    			//������ֱ���ϵĵ��ǰ��Ķ࣬�򽫵��������ֵ�� max_result;
    			if(max_result < res){
    				max_result = res;
    			}
    		}
    	}
    	return max_result;
    }
    
    
    
    /**
	 *  �󷽳�ʽ y = kx + b �е�k��b
	 *  ���x2=x1 ����ʽΪx=x1
	 *  
	 *  �����б�� k = (y2-y1)/(x2-x1) 
	 *  ����b = y1-k*x1
	 *  
	 * ����ɵã�
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
