package CrackCodeInterview;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyOwnSqrtFunc {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Sqrt of 5 is " + sqrt(5));
	}

	public static double myOwnSqrt(int n) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("output.txt");
		int i = 0;
		double j = 0;
		while (i * i <= n) {
			pw.println("i: " + i);
			i++;
		}
		if (i * i > n) {
			j = i - 1;
			double estimate = j * j;
			while (Math.abs((double) n - estimate) > 0.5) {
				pw.println("j = " + j + ",estimate = " + estimate);
				j += 0.01;
				estimate = j * j;
			}
		}
		pw.close();
		return j;
	}

	public static double sqrt(int number) {
		double t;

		double squareRoot = number / 2;

		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}
}
