package helix;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class MatrixHelixMorphTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1
     * @param matrix2
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        //assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test1x1() {
        int[][] inMatrix  = { {1} };
        int[][] expOutput = { {1} };
        //assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test3X3(){
        int[][] inMatrix = {{1,2,3} , {4,5,6} , {7,8,9}};
        int[][] expOutput = {{1,2,3} , {6,9,8} , {7,4,5}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test4X4(){
        int[][] inMatrix = {{1,3,5,7} , {6,9,8,10} , {14,15,18,19} ,{21,22,17,2} };
        int[][] expOutput = {{1,3,5,7} , {10,19,2,17} , {22,21,14,6},{9,8,18,15}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test5X5(){
        int[][] inMatrix = {{1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} ,{16,17,18,19,20},{21,22,23,24,25} };
        int[][] expOutput = {{1,2,3,4,5} , {10,15,20,25,24} , {23,22,21,16,11},{6,7,8,9,14},{19,18,17,12,13}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test2X3(){
        int[][] inMatrix = {{1,2,3} , {4,5,6}};
        int[][] expOutput = {{1,2,3} , {6,5,4}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test3X2(){
        int[][] inMatrix = {{1,2} , {3,4},{5,6}};
        int[][] expOutput = {{1,2} , {4,6},{5,3}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test4X3(){
        int[][] inMatrix = {{1,2,3} , {4,5,6},{7,8,9},{10,11,12}};
        int[][] expOutput = {{1,2,3} , {6,9,12},{11,10,7},{4,5,8}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test3X4(){
        int[][] inMatrix = {{1,2,3,4} , {5,6,7,8},{9,10,11,12}};
        int[][] expOutput = {{1,2,3,4} , {8,12,11,10},{9,5,6,7}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test5X3(){
        int[][] inMatrix = {{1,2,3} , {4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        int[][] expOutput = {{1,2,3} ,{6,9,12},{15,14,13},{10,7,4},{5,8,11}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }
    @Test
    public void test3X5(){
        int[][] inMatrix = {{1,2,3,4,5} , {6,7,8,9,10},{11,12,13,14,15}};
        int[][] expOutput = {{1,2,3,4,5} ,{10,15,14,13,12},{11,6,7,8,9}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test5X2(){
        int[][] inMatrix = {{1,2} , {3,4},{5,6},{7,8},{9,10}};
        int[][] expOutput = {{1,2},{4,6},{8,10},{9,7},{5,3}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }

    @Test
    public void test2X5(){
        int[][] inMatrix = {{1,2,3,4,5},{6,7,8,9,10}};
        int[][] expOutput = {{1,2,3,4,5},{10,9,8,7,6}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }
    @Test
    public void test0X0(){
        int[][] inMatrix = {{}};
        int[][] expOutput = {{}};
        assertArrayEquals(expOutput,MatrixHelixMorph.helix(inMatrix));
    }


    // ADD TESTS TO CHECK PARTITIONS
}
