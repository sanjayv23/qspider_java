package methods;

public class Dec31_while {
	public static void main(String[] args) {
		char ch='A';
		while (ch<='Z') {
			System.out.print(ch+++" ");
		}
		System.out.println();
		
		//reverse the number
		System.out.println();
		int num=156;
		int org=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		System.out.println("Reverse of number: "+rev);	
		
		//palindrome
		System.out.println();
		if(org==rev)System.out.println("palindrome");
		else System.out.println("not plaindrome");
		
		//Sum of digit
		System.out.println();
		int num1=5864;
		int sum=0;
		while(num1!=0) {
			int rev1=num1%10;
			sum+=rev1;
			num1/=10;
			
		}
		System.out.println("sum of digit: "+sum);
		
		System.out.println();
		int spy=123;
		int add=0,mul=1;
		while(spy!=0) {
			int last=spy%10;
			add+=last;
			mul*=last;
			spy=spy/10;
			
		}
		if(add==mul) System.out.println("spy number");
		else System.out.println("not spy number");
		System.out.println();
	}
}
