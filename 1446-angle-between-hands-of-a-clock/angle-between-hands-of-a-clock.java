class Solution {
    public double angleClock(int hour, int minutes) {
        
   double total_angle = Math.abs(30 * hour - 5.5 * minutes);
    
    return Math.min(total_angle, 360 - total_angle);
    }
}