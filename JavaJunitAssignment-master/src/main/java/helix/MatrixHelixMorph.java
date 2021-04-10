package helix;

import java.util.ArrayList;
import java.util.List;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {

        int [][] ansMatrix = new int[inMatrix.length][inMatrix[0].length];

        List<Integer> ans = new ArrayList();
        if (inMatrix.length == 0)
            return ansMatrix;
        int row1 = 0, row2 = inMatrix.length - 1;
        int col1 = 0, col2 = inMatrix[0].length - 1;
        while (row1 <= row2 && col1 <= col2) {
            for (int col = col1; col <= col2; col++) ans.add(inMatrix[row1][col]);
            for (int row = row1 + 1; row <= row2; row++) ans.add(inMatrix[row][col2]);
            if (row1 < row2 && col1 < col2) {
                for (int col = col2 - 1; col > col1; col--) ans.add(inMatrix[row2][col]);
                for (int row = row2; row > row1; row--) ans.add(inMatrix[row][col1]);
            }
            row1++;
            row2--;
            col1++;
            col2--;
        }

        int listIndex = 0;

        for (int row = 0 ; row<inMatrix.length;row++){
            for (int col = 0 ; col<inMatrix[0].length;col++){
                ansMatrix[row][col] = ans.get(listIndex);
                listIndex++;
            }
        }



        return ansMatrix; //MODIFY THIS METHOD
    }
}