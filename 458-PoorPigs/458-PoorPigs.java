// Last updated: 09/07/2026, 15:09:41
class Solution
{
    public int poorPigs(int buckets, int tdie, int ttest)
    {
        int test = ttest/tdie;
        int i=0;
        while(Math.pow(test+1,i)< buckets)
        {
            i++;
        }
        return i;
    }
}