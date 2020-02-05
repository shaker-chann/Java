package LeetCode;

/**
 * @description: 79 单词搜索
 * @author: csc
 * @create: 2020/2/4 21:43
 */
public class Exist {
    public static void main(String[] args) {
//        exist(new char[][]{{'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}},"ABCCED");
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (bfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean bfs(char[][] board, String word, int i, int j, int len) {
        if (len >= word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || word.charAt(len) != board[i][j])
            return false;

        board[i][j] += 27;
        boolean ans = bfs(board, word, i - 1, j, len+1)
                || bfs(board, word, i + 1, j, len+1)
                || bfs(board, word, i, j - 1, len+1)
                || bfs(board, word, i, j + 1, len+1);
        board[i][j] -= 27;
        return ans;
    }
}
