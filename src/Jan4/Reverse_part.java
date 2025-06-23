package Jan4;

public class Reverse_part {
	public static void main(String[] args) {
		int num=12345;
		int temp=num;
		int cnt=0;
		while(temp!=0) {
			cnt++;
			temp/=10;
		}
		int first=num%(pow(10,cnt/2));
		//System.out.println(first);
		System.out.println(first+""+num/(pow(10,cnt/2)));
	}

	private static int pow(int i, int cnt) {
		// TODO Auto-generated method stub
		int num=1;
		while(cnt!=0) {
			cnt--;
			num=num*i;
		}
		return num;
	}
}
