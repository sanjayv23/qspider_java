package jun10;

public class CountReplacement {
	public static void main(String[] args) {
		String[] str= {"john123@gmail.com","alice@yahoo.com","bob@outlook.com","steve_09@gmail.com","mark99@hotmail.com"};
		int cnt=0;
		for(String s:str) {
			if(s.contains("@gmail.com")) cnt++;
		}
		System.out.println(cnt);
	}
}
