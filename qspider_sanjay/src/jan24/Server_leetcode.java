package jan24;

public class Server_leetcode {
	public static void main(String[] args) {
		int[][] grid= {{1,0},{0,1}};
		System.out.println("Final answer: "+countServers(grid));
	}
	public static int countServers(int[][] grid) {
        int tot=0,nc=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    tot++;
                    System.out.println("tot  at: "+i+" "+j);
                    boolean nc_cond_row=true,nc_cond_col=true;
                    for(int k=0;k<grid.length;k++){
                        if(k!=i &&grid[k][j]==1 ) {
                            nc_cond_col=false;
                            break;
                        }
                        if(k!=i && k==grid.length-1 && grid[k][j]!=1) nc_cond_row=true;
                    }
                    for(int k=0;k<grid[i].length;k++){
                        if(k!=j &&grid[i][k]==1 ) {
                        	nc_cond_col=false;
                        	break;
                        }
                        if(k!=j &&k==grid[i].length-1 && grid[i][k]!=1) nc_cond_col=true;
                    }
                    System.out.println("nc at: "+i+" "+j+"rowcond: "+nc_cond_row+" colcond: "+nc_cond_col);
                    if(nc_cond_row && nc_cond_col) {
                        System.out.println("nc at: "+i+" "+j);
                        nc++;
                    }
                } 
            }
        }
        System.out.println("nc: "+nc+" tot:"+tot);
        return (tot-nc);
    }
}
