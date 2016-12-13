package ArrDemo;

public class ArrDemo {
	public static void main(String[] args) {
		// ÄæĞòÊä³öÊı×é
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		for (int j = arr.length - 1; j > 0; j--) {
			System.out.println("arr[" + j + "]£º" + arr[j]);
		}
	}
}
