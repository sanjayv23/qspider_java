package jan22;

public class Distinction_sum {
	public static void main(String[] args) {
		System.out.println("Output: "+helper(3, 10));
	}
	static int helper(int m,int n){
        int total_not_div=0,total_div=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0) total_not_div+=i;
            else total_div+=i;
        }
        return total_not_div-total_div;
    }
	
}
