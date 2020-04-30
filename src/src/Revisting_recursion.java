package src;

public class Revisting_recursion {
	public static String remChar(String str, char ch) {
		if (str.indexOf(ch) == -1)
			return str;

		return remChar(str.substring(0, str.indexOf(ch)) + str.substring(str.indexOf(ch) + 1, str.length()), ch);

	}

	public static int zoogot(int[] arr) {
		return zoogot(arr, 0);
	}

	public static int zoogot(int[] arr, int k) {
		int s;
		if ((arr[k] + arr[k + 1]) % 2 == 0)
			s = 1;
		else
			s = 0;
		if (arr.length - k == 2)
			return s;
		return s + zoogot(arr, k + 2);
	}

	public static void main(String[] args) {
		System.out.println(remChar("lhellol", 'l'));
		int[] arr = { 10, 51, 12, 13, 14, 62, 31, 17 };
		System.out.println(zoogot(arr));
	}

}
