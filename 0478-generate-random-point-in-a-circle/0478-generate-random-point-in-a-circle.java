class Solution {
    double radius;
    double x;
    double y;
    public Solution(double radius, double x_center, double y_center) {
        this.radius=radius;
        x=x_center;
        y=y_center;
    }
    
    public double[] randPoint() {
        double minX=x-radius;
        double maxX=x+radius;
        double minY=y-radius;
        double maxY=y+radius;
        
        double[] ans= new double[2];
        ans[0]= minX + Math.random()*(maxX-minX);
        ans[1]= minY + Math.random()*(maxY-minY);
        
        while((x-ans[0])*(x-ans[0])+(y-ans[1])*(y-ans[1])> radius*radius){
            ans[0]= minX + Math.random()*(maxX-minX);
            ans[1]= minY + Math.random()*(maxY-minY);
        
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */