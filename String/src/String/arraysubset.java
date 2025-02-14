package String;

//Java program to check if an array is a subset of another array

import java.util.*;

public class arraysubset {
	static boolean subset_arrays(char[] arr1, char[] arr2, int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (arr2[i] == arr1[j])
					break;
			}

			if (j == m)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int m, n, i;
		char[] arr1 = new char[10];
		char[] arr2 = new char[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("�Enter the size of array 1 : �");
		m = sc.nextInt();
		System.out.print("�Enter the size of array 2 : �");
		n = sc.nextInt();
		System.out.print("�Input the array 1 elements : �");
		for (i = 0; i < n; i++) {
			arr1[i] = (char) sc.nextInt();
		}
		System.out.print("�Input the array 2 elements : �");
		for (i = 0; i < m; i++) {
			arr2[i] = (char) sc.nextInt();
		}

		if (subset_arrays(arr1, arr2, n, m))
			System.out.print("�\nArray 2 is a subset of array 1\n�");
		else
			System.out.print("�\nArray 2 is not a subset of array 1\n�");
	}
}
