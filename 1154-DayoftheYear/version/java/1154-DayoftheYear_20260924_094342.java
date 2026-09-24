// Last updated: 24/09/2026, 09:43:42
1import java.time.LocalDate;
2
3class Solution {   
4    public int dayOfYear(String date) {
5        return LocalDate.parse(date).getDayOfYear();
6    }
7}