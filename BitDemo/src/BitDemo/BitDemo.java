package BitDemo;

import java.util.Random;

/**
 * 
 * @author 金盼盼
 * 
 */
public class BitDemo {
	public static void main(String[] args) {
		Random random = new Random();
		// 用二进制表示-1,1，random
		toBin(-1);
		toBin(+1);
		toBin(random.nextInt());
	}

	private static void toBin(int a) {
		System.out.println("\n整型数：" + a + "，二进制表示：");
		// ----用二进制表示整型数a-----------//
		/*
		 * 一个整型数有32位，用一个循环逐步判断整型数上的每一位是否为1，如果是则输出1否则输出0
		 */
		for (int i = 31; i >= 0; i--) {
			if (((1 << i) & a) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
		System.out.print("\n");
	}
}
