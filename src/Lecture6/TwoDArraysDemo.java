package Lecture6;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		// System.out.println(arr);

		// arr=new int[][3];// Not Valid
		arr = new int[3][];
		// System.out.println(arr[0][0]);//null pointer exception
		// arr[0][0]=1;

		arr[0] = new int[2];
		arr[0][0] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);
		System.out.println(arr[1].length);
		arr[1] = new int[3];
		System.out.println(arr[0]);
		// System.out.println(arr[0][4]);
		System.out.println(arr[1][0]);
		//
		System.out.println(arr[0].length);

		arr = new int[4][3];
		arr[0][2] = 20;
		System.out.println(arr[0][2]);
		System.out.println(arr[2]);

		System.out.println(arr.length);

	}

}
