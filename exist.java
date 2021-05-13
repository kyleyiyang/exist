class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
                if (dfs(board,word,i,j)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int m,int n) {
        if (word.length()==0) return true;
        if (m<board.length && m>=0 && n>=0 && n<board[0].length && board[m][n]==word.charAt(0)) {
            board[m][n]='0';
            if (dfs(board,word.substring(1),m+1,n) || dfs(board,word.substring(1),m-1,n) || dfs(board,word.substring(1),m,n+1) || dfs(board,word.substring(1),m,n-1)) return true;
            board[m][n]=word.charAt(0);
        }
        return false;
    }
}
