class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int count=0;
        Queue<int[]> q= new LinkedList<>();
        int[][] a={{0,1},{1,0},{-1,0},{0,-1}};
        
        q.offer(entrance);
        
        boolean[][] vis= new boolean[maze.length][maze[0].length];
        
        vis[entrance[0]][entrance[1]]=true;
        
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
                int[] f=q.poll();
                
                for(int[] b:a){
                    int x=b[0]+f[0];
                    int y=b[1]+f[1];
                    
                    if(x<0 || y<0 || x>=maze.length || y>=maze[0].length || vis[x][y] || maze[x][y]=='+') continue;
                    
                    if(x==0 || y==0 || x==maze.length-1 || y==maze[0].length-1) return count;
                    
                    q.add(new int[]{x,y});
                    vis[x][y]=true;
                }
                
            }
        }
        
        return -1;
        
        
        
    }
}