package ArrDemo1;

import java.applet.Applet;
import java.awt.Graphics;

public class ArrDemo1 extends Applet {

	private static final long serialVersionUID = 2409528814974068747L;

	public void paint(Graphics g) {
		// arr1,3行4列
		int[][] arr1 = new int[3][4];
		// arr2,3行
		int[][] arr2 = new int[3][];
		// arr3
		int[][] arr3 = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		int i, j, k = 0;
		g.drawString("arr1:", 20, 20);
		// arr1赋值
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				// 后++，先加1后使用
				arr1[i][j] = k++;
				g.drawString("" + arr1[i][j], 20 + 20 * j, 40 + 20 * i);
			}
		}
		g.drawString("arr2:", 130, 20);
		// arr2赋值
		for (i = 0; i < 3; i++) {
			arr2[i] = new int[i + 3];// arr2每一行是边长的，3,4,5
			for (j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = k++;
				g.drawString("" + arr2[i][j], 130 + 20 * j, 40 + 20 * i);
			}
		}

		g.drawString("arr3:", 240, 20);
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				g.drawString("" + arr3[i][j], 240 + 20 * j, 40 + 20 * i);
			}
		}
	}
}