package kunal_recursion;

public class Basic_recursion_prgm {
	public static void main(String[] args) {
		System.out.println("Printing 1 to N:");
		print_1ton(5);
		System.out.println();
		System.out.println("Printing N to 1:");
		print_nto1(5);
		System.out.println();
		System.out.println("Factorial of N:");
		System.out.println(factorial(6));
		System.out.println();
		System.out.println("sum of N:");
		System.out.println(sum_of_digits(123456));
		System.out.println();
		System.out.println("product of N:");
		System.out.println(product_of_digits(1342));
		System.out.println();
		System.out.println("Reverse of N:");
		System.out.println(reverse_num(25635,0));
		System.out.println();
		System.out.println("count zero of N:");
		System.out.println(count_zero(10000035,0));
	}
	
	private static int count_zero(int n, int cnt) {
		// TODO Auto-generated method stub
		if(n==0) return cnt;
		if(n%10==0) return count_zero(n/10, ++cnt);
		else return count_zero(n/10, cnt);
			
	}

	private static int reverse_num(int n,int sum) {
		// TODO Auto-generated method stub
		if(n==0) return sum;
		//int rev=n%10;
		sum=sum*10+(n%10);
		return reverse_num(n/10,sum);
	}
	static int product_of_digits(int n) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		return (n%10)*product_of_digits(n/10);
	}
	static void print_nto1(int n) {
		// TODO Auto-generated method stub
		if(n==0) return;
		System.out.print(n+" ");
		print_nto1(n-1);
	}
	static void print_1ton(int n) {
		if(n==0) return;
		print_1ton(n-1);
		System.out.print(n+" ");
		
	}
	static int factorial(int n) {
		if(n==1) return n;
		return n*factorial(n-1);
	}
	static int sum_of_digits(int n) {
		if(n==0) return 0;
		return (n%10)+sum_of_digits(n/10);
	}
}
