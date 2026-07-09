// Last updated: 09/07/2026, 15:08:28
class Solution {
    public int numRookCaptures(char[][] board) {
        int attack=0;;
        int row=0,col=0;
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
         int r=row;
         int c=col;
        //upward
        while(r>=0&&board[r][c]!='B'){
            if(board[r][c]=='p'){
                attack++;
                break;
            }
            r--;
        }
        //downwrd
         r=row;
         c=col;
        while(r<=7&&board[r][c]!='B'){
            if(board[r][c]=='p'){
                attack++;
                break;
            }
            r++;
        }
         r=row;
         c=col;
         //right
        while(c<=7&&board[r][c]!='B'){
            if(board[r][c]=='p'){
                attack++;
                break;
            }
            c++;
        }
        //left
        r=row;
        c=col;
        while(c>=0&&board[r][c]!='B'){
            if(board[r][c]=='p'){
                attack++;
                break;
            }
            c--;
        }
        return attack;
    }
}