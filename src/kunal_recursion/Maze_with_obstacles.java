package kunal_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze_with_obstacles {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		boolean[][] mazearr= {{true,true,true},{true,true,true},{true,true,true}};
		maze_with_obs("",mazearr,0,0,2,2,list);
		
		System.out.println("list: "+maze_allpaths_backtracks("", mazearr, 0, 0, 2, 2));
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int[][] path=new int[3][3];
		System.out.println("list: "+maze_all_paths_matrix("", mazearr, 0, 0, 2, 2,1,path));
		
	}
	public static void maze_with_obs(String ans,boolean[][] mazearr,int r,int c,int target_row,int target_col,List<String> list) {
		if(r==target_row && c==target_col) {
			System.out.println(ans);
			list.add(ans);
			return;
		}
		if(!mazearr[r][c]) return ;
		if(r<mazearr.length-1) {
			maze_with_obs(ans+"DOWN ",mazearr,r+1,c,target_row,target_col,list);
		}
		if(c<mazearr[0].length-1) {
			maze_with_obs(ans+"RIGHT ",mazearr,r,c+1,target_row,target_col,list);
		}
		
	}
	public static List<String> maze_allpaths_backtracks(String ans,boolean[][] mazearr,int r,int c,int target_row,int target_col) {
		if(r==target_row && c==target_col) {
			List<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		List<String> list=new ArrayList<>();
		if(!mazearr[r][c]) return list;
		mazearr[r][c]=false;
		if(r<mazearr.length-1) {
			list.addAll(maze_allpaths_backtracks(ans+"DOWN ",mazearr,r+1,c,target_row,target_col));
		}
		if(c<mazearr[0].length-1) {
			list.addAll(maze_allpaths_backtracks(ans+"RIGHT ",mazearr,r,c+1,target_row,target_col));
		}
		if(r>0) {
			list.addAll(maze_allpaths_backtracks(ans+"UPPER ",mazearr,r-1,c,target_row,target_col));
		}
		if(c>0) {
			list.addAll(maze_allpaths_backtracks(ans+"LEFT ",mazearr,r,c-1,target_row,target_col));
		}
		//backtracking
		mazearr[r][c]=true;
		
		return list;
		
	}
	public static List<String> maze_all_paths_matrix(String ans,boolean[][] mazearr,int r,int c,int target_row,int target_col,int step,int[][] path) {
		if(r==target_row && c==target_col) {
			path[r][c]=step;
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			List<String> list=new ArrayList<>();
			list.add(ans);
			System.out.println(list);
			return list;
		}
		List<String> list=new ArrayList<>();
		if(!mazearr[r][c]) return list;
		mazearr[r][c]=false;
		path[r][c]=step;
		if(r<mazearr.length-1) {
			list.addAll(maze_all_paths_matrix(ans+"DOWN ",mazearr,r+1,c,target_row,target_col,step+1,path));
		}
		if(c<mazearr[0].length-1) {
			list.addAll(maze_all_paths_matrix(ans+"RIGHT ",mazearr,r,c+1,target_row,target_col,step+1,path));
		}
		if(r>0) {
			list.addAll(maze_all_paths_matrix(ans+"UPPER ",mazearr,r-1,c,target_row,target_col,step+1,path));
		}
		if(c>0) {
			list.addAll(maze_all_paths_matrix(ans+"LEFT ",mazearr,r,c-1,target_row,target_col,step+1,path));
		}
		//backtracking
		mazearr[r][c]=true;
		path[r][c]=0;
		
		return list;
		
	}
}
