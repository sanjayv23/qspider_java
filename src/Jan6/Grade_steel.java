package Jan6;

public class Grade_steel {
	public static void main(String[] args) {
		
	}
	public static int grade(int hard,double carbon,int tensile) {
		if(hard>50 && tensile>5600 && carbon<0.7) return 10;
		else if(hard>50 && carbon<0.7) return 9;
		else if(hard>50 && tensile>5600) return 8;
		else if(tensile>5600 && carbon<0.7) return 7;
		else if(hard) return 6
		else if(hard<50 && tensile<5600 && carbon>0.7) return 5;
	}
}
