package test;

import util.Point;
import code.MaxPointsOnLine;
import junit.framework.TestCase;

public class MaxPointsOnLineTest extends TestCase {
	
	public void testMaxPoints() {
		MaxPointsOnLine m = new MaxPointsOnLine();
		
		Point[] points2 = new Point[2];
		points2[0] = new Point(1, 1);
		points2[1] = new Point(1, 2);
		int test2 = m.maxPoints(points2);
		assertEquals(test2, 2);
		
		
		Point[] points3 = new Point[2];
		points3[0] = new Point(2, 1);
		points3[1] = new Point(2, 3);
		int test3 = m.maxPoints(points2);
		assertEquals(test3, 2);
		
		
		
		
		Point[] points = new Point[4];
		points[0] = new Point(1, 1);
		points[1] = new Point(2, 1);
		points[2] = new Point(2, 2);
		points[3] = new Point(3, 3);
		int test = m.maxPoints(points );
		assertEquals(test, 3);
		
		
		Point[] points4 = new Point[4];
		points4[0] = new Point(3, 10);
		points4[1] = new Point(0, 2);
		points4[2] = new Point(0, 2);
		points4[3] = new Point(3, 10);
		int test4 = m.maxPoints(points4 );
		assertEquals(test4, 4);
		
		Point[] points5 = new Point[4];
		points5[0] = new Point(3, 1);
		points5[1] = new Point(12, 3);
		points5[2] = new Point(3, 1);
		points5[3] = new Point(-6, -1);
		int test5 = m.maxPoints(points5);
		assertEquals(test5, 4);
		
		Point[] points6 = new Point[98];
		points6[0]= new Point(560,248);
		points6[1]= new Point(0,16);
		points6[2]= new Point(30,250);
		points6[3]= new Point(950,187);
		points6[4]= new Point(630,277);
		points6[5]= new Point(950,187);
		points6[6]= new Point(-212,-268);
		points6[7]= new Point(-287,-222);
		points6[8]= new Point(53,37);
		points6[9]= new Point(-280,-100);
		points6[10]= new Point(-1,-14);
		points6[11]= new Point(-5,4);
		points6[12]= new Point(-35,-387);
		points6[13]= new Point(-95,11);
		points6[14]= new Point(-70,-13);
		points6[15]= new Point(-700,-274);
		points6[16]= new Point(-95,11);
		points6[17]= new Point(-2,-33);
		points6[18]= new Point(3,62);
		points6[19]= new Point(-4,-47);
		points6[20]= new Point(106,98);
		points6[21]= new Point(-7,-65);
		points6[22]= new Point(-8,-71);
		points6[23]= new Point(-8,-147);
		points6[24]= new Point(5,5);
		points6[25]= new Point(-5,-90);
		points6[26]= new Point(-420,-158);
		points6[27]= new Point(-420,-158);
		points6[28]= new Point(-350,-129);
		points6[29]= new Point(-475,-53);
		points6[30]= new Point(-4,-47);
		points6[31]= new Point(-380,-37);
		points6[32]= new Point(0,-24);
		points6[33]= new Point(35,299);
		points6[34]= new Point(-8,-71);
		points6[35]= new Point(-2,-6);
		points6[36]= new Point(8,25);
		points6[37]= new Point(6,13);
		points6[38]= new Point(-106,-146);
		points6[39]= new Point(53,37);
		points6[40]= new Point(-7,-128);
		points6[41]= new Point(-5,-1);
		points6[42]= new Point(-318,-390);
		points6[43]= new Point(-15,-191);
		points6[44]= new Point(-665,-85);
		points6[45]= new Point(318,342);
		points6[46]= new Point(7,138);
		points6[47]= new Point(-570,-69);
		points6[48]= new Point(-9,-4);
		points6[49]= new Point(0,-9);
		points6[50]= new Point(1,-7);
		points6[51]= new Point(-51,23);
		points6[52]= new Point(4,1);
		points6[53]= new Point(-7,5);
		points6[54]= new Point(-280,-100);
		points6[55]= new Point(700,306);
		points6[56]= new Point(0,-23);
		points6[57]= new Point(-7,-4);
		points6[58]= new Point(-246,-184);
		points6[59]= new Point(350,161);
		points6[60]= new Point(-424,-512);
		points6[61]= new Point(35,299);
		points6[62]= new Point(0,-24);
		points6[63]= new Point(-140,-42);
		points6[64]= new Point(-760,-101);
		points6[65]= new Point(-9,-9);
		points6[66]= new Point(140,74);
		points6[67]= new Point(-285,-21);
		points6[68]= new Point(-350,-129);
		points6[69]= new Point(-6,9);
		points6[70]= new Point(-630,-245);
		points6[71]= new Point(700,306);
		points6[72]= new Point(1,-17);
		points6[73]= new Point(0,16);
		points6[74]= new Point(-70,-13);
		points6[75]= new Point(1,24);
		points6[76]= new Point(-328,-260);
		points6[77]= new Point(-34,26);
		points6[78]= new Point(7,-5);
		points6[79]= new Point(-371,-451);
		points6[80]= new Point(-570,-69);
		points6[81]= new Point(0,27);
		points6[82]= new Point(-7,-65);
		points6[83]= new Point(-9,-166);
		points6[84]= new Point(-475,-53);
		points6[85]= new Point(-68,20);
		points6[86]= new Point(210,103);
		points6[87]= new Point(700,306);
		points6[88]= new Point(7,-6);
		points6[89]= new Point(-3,-52);
		points6[90]= new Point(-106,-146);
		points6[91]= new Point(560,248);
		points6[92]= new Point(10,6);
		points6[93]= new Point(6,119);
		points6[94]= new Point(0,2);
		points6[95]= new Point(-41,6);
		points6[96]= new Point(7,19);
		points6[97]= new Point(30,250);
		int test6 = m.maxPoints(points6);
		assertEquals(test6, 22);
		
	}

}
