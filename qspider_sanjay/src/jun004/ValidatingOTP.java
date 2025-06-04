package jun004;
import java.util.*;
public class ValidatingOTP {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the OTP to get Validate: " );
		String str=scan.nextLine();
		str=str.trim();
		if("".equals(str)) System.out.println("REJECTED OTP");
		else if(ValidateOTP(str)) System.out.println("CORRECT OTP");
		else System.out.println("REJECTED OTP");
			
	}
	public static boolean ValidateOTP(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') continue;
			else return false;
		}
		return true;
	}
}
