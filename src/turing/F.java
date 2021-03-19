package turing;

public class F
{
	public static void main(String[] args) {
		int[][] a = new int[20][10];
		for (int i=0;i<20;i++) {
			for (int j=0;j<10;j++) {
				a[i][j] = (int)(10*Math.random()) / 2;
				System.out.println(a[i][j]);
			}
		}
	}
}
