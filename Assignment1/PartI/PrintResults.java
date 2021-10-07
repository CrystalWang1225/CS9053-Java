
public class PrintResults {
	

	public static int maximum(int[] array, int l, int r) {
		int ll = l + 1;
		int rr = r + 1;
		System.out.println("index"+ ll+ " "+ rr);
		if (r-l == 0) {
			return array[r];
		}
		System.out.println("hi");
		int lmax = maximum(array, l, (int)(l+r)/2);
		System.out.println("yo");
		int rmax = maximum(array, (int)(l+r)/2 + 1, r);
		System.out.println("after");
		System.out.println(rmax + " " + lmax);
		if (rmax < lmax)
		return lmax;
		else
			return rmax;
	}
	
	public static void main(String[] args) {
		int[] A = {10,8,6,4,2};
		maximum(A, 0,4);
//		System.out.println("The value of 1+1 is " + (1+1));
//		int a = 10 + 5;
//		int b = 50 - 23;
//		int c = 12 * 13;
//		double d = 20.0 / 3.0;
//		int e = 100 % 7;
//		double f = Math.pow(4, 3);
//		
//		System.out.println("the value of a is " + a);
//		System.out.println("the value of b is " + b);
//		System.out.println("the value of c is " + c);
//		System.out.println("the value of d is " + d);
//		System.out.println("the value of e is " + e);
//		System.out.println("the value of f is " + f);
		
	}
}
