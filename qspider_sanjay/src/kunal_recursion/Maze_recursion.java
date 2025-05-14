package kunal_recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze_recursion {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		maze("",3,3,list);
		System.out.println(list);
		System.out.println(maze_path_cnt("", 3, 3, list));
	}
	public static void maze(String ans,int r,int c,List<String> list) {
		if(r==1 && c==1) {
			list.add(ans);
		}
		if(r>1) {
			maze(ans+"DOWN ",r-1,c,list);
		}
		if(c>1) {
			maze(ans+"RIGHT ",r,c-1,list);
		}
		if(r>1 && c>1) {
			maze(ans+"DIAGONAL ", r-1, c-1, list);
		}
	}
	public static int maze_path_cnt(String ans,int r,int c,List<String> list) {
		if(r==1 || c==1) {
			list.add(ans);
			return 1;
		}
		
		return maze_path_cnt(ans+'D',r-1,c-1,list)+maze_path_cnt(ans+'D',r-1,c,list)+maze_path_cnt(ans+'R',r,c-1,list);
		
		
	}
	
}
