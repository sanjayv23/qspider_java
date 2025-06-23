package jun09;

import java.util.ArrayList;
import java.util.List;

public class SprialTraversal {
	public static void main(String[] args) {
		int[][] nums= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list=new ArrayList<>();
        int top=0,left=0;
		int bottom=nums.length-1,right=nums[0].length-1;
		
		while(top<=bottom && left<=right) {
			
			for(int i=left;i<=right;i++) {
				System.out.print(nums[top][i]+" ");
                list.add(nums[top][i]);
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				System.err.print(nums[i][right]+" ");
                list.add(nums[i][right]);
			}
			right--;
			
			if(top>bottom || right<left) break;
            
            for(int i=right;i>=left;i--) {
                System.out.print(nums[bottom][i]+" ");
                list.add(nums[bottom][i]);
            }
		    bottom--;    
            
			for(int i=bottom;i>=top;i--) {
				System.out.print(nums[i][left]+" ");
                list.add(nums[i][left]);
			}
			left++;
		}
		//System.out.println("Sprial Traversal: "+list);
		
	}
}
