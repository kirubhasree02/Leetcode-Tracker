// Last updated: 09/07/2026, 15:06:34
class Solution {
    public double[] convertTemperature(double celsius) {
        double K=celsius+273.15;
        double F=celsius*1.80+32.00;
        double[] res={K,F};
        return res;
    }
}