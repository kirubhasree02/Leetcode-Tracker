// Last updated: 06/10/2026, 19:36:16
1class Solution {
2        public String tictactoe(int[][] moves) {
3        int[][] row = new int[2][3], col = new int[2][3];
4        int[] d1 = new int[2], d2 = new int[2];
5        for (int i = 0; i < moves.length; ++i) {
6            int r = moves[i][0], c = moves[i][1], id = i % 2;
7            if (++row[id][r] == 3 || ++col[id][c] == 3 || r == c && ++d1[id] == 3 || r + c == 2 && ++d2[id] == 3) 
8                return id == 0 ? "A" : "B";
9        }
10        return moves.length == 9 ? "Draw" : "Pending";        
11    }
12}