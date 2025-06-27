package marquee_jun25;

import jun004.Palindrome;

public class RecursionSampe {
	public static void main(String[] args) {
		printodd(16);
		System.out.println();
		printDivisibleBy2_3(12);
		System.out.println();
		System.out.println("POWER: "+pow(3,19));
		System.out.println();
		System.out.println(mul(3,2));
		
		System.out.println();
		System.out.println(reverse("sanjay"));
	
		System.out.println();
		System.out.println(palindrome("sas"));
		
		System.out.println();
		int[] arr= {11,12,13,16,18,21};
		System.out.println(binarySearch(arr, 12, 0, arr.length-1));
	}
	
	static String reverse(String str) {
		if(str.length()==0) return "";
		return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
	}
	
	static boolean palindrome(String str) {
		if(str.length()<=1) return true;
		if(str.charAt(0)!=str.charAt(str.length()-1)) return false;
		return str.charAt(0)==str.charAt(str.length()-1) && palindrome(str.substring(1,str.length()-1));
		
	}
	
	static boolean binarySearch(int[] arr,int key,int st,int end) {
		if(st>end) return false;
		int mid=(st+end)/2;
		if(arr[mid]==key) return true;
		if(arr[mid]<key) return binarySearch(arr, key, mid+1, end);
		return binarySearch(arr, key, st, mid-1);
		
 	}
	
	
	static int mul(int a,int b) {
		if(b<=0) return 0;
		return a+mul(a,b-1);
	}
	
	static int pow(int base,int power) {
		if(power==1) return base;
		return base*pow(base,--power);
	}

	static void printodd(int n) {
		if(n==0) return;
		printodd(n-1);
		if(n%2!=0) System.out.print(n+" ");
		
	}
	
	static void printDivisibleBy2_3(int n){
		if(n==0) return;
		printDivisibleBy2_3(n-1);
		if(n%2==0 && n%3==0) System.out.print(n+" ");
	}
}
