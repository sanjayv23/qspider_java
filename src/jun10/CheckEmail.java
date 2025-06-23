package jun10;

public class CheckEmail {
	public static void main(String[] args) {
		//System.out.println('0');
		String[] str= {"sanjayvelu2311@gmail.com","ss2311_2004@gmail.com","sanjay@google.com","sanjay@yahoo"};
		for(String s:str) {
			if(check(s)) System.out.println(s);
		}
	}
	static boolean check(String s) {
			if(s.contains("@")) {
				String local=s.substring(0,s.indexOf('@'));
				for(char ch:local.toCharArray()) {
					if( (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) continue;
					else return false;
				}
				String domain=s.substring(s.indexOf('@')+1);
				if(domain.equals("gmail.com") || domain.equals("yahoo.com") || domain.equals("hotmail.com")) return true;
				else return false;
			}
			return false;
	}
}
