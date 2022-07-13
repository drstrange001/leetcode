class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double slope=calcSlope(coordinates[0],coordinates[1]);
        
        for (int i=2; i<coordinates.length;i++){
            if(slope!=calcSlope(coordinates[0],coordinates[i])){
                return false;
            }
        }
        return true;
    }
    
    public double calcSlope(int[]p1, int[]p2) {
        int x1= p1[0], y1 = p1[1];
        int x2=p2[0], y2=p2[1];
        if (x2 == x1) {
            return Integer.MAX_VALUE;
        }
        return ((double)y2-y1)/(x2-x1);
    }
}