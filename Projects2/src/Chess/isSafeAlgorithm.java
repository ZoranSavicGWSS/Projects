/*
Author: Zoran Savic
Date: 27/02/2017
Description: Determines wether it is safe to move in chess.
 */
package Chess;

/**
 *
 * @author 1SAVICZOR
 */
public class isSafeAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] board = {
            {'r','h','b','q','k','b','h','r'},
            {'p','p','p','p','p','p','p','p'},
            {},
            {},
            {},
            {},
            {'p','p','p','p','p','p','p','p'},
            {'r','h','b','q','k','b','h','r'}
        };
        /*
        pawn
        rook
        bishop
        horse
        queen
        king
        */
        /*
        [X]|[0][1][2][3][4][5][6][7]|[X]
        --------------------------------
        [7]|[r][h][b][q][k][b][h][r]|[7]
        [6]|[p][p][p][p][p][p][p][p]|[6]
        [5]|[ ][ ][ ][ ][ ][ ][ ][ ]|[5]
        [4]|[ ][ ][ ][ ][ ][ ][ ][ ]|[4]
        [3]|[ ][ ][ ][ ][ ][ ][ ][ ]|[3]
        [2]|[ ][ ][ ][ ][ ][ ][ ][ ]|[2]
        [1]|[p][p][p][p][p][p][p][p]|[1]
        [0]|[r][h][b][q][k][b][h][r]|[0]
        --------------------------------
        [X]|[0][1][2][3][4][5][6][7]|[X]
        */
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                System.out.print(board[r][c] + " ");
            }
            System.out.println("");
        }
    }
    
}
