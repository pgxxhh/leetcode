package com.leetcode.coding.BinarySearch;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 */
public class SearchA2DMatrix {

    //consider border
    public static boolean searchA2DMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int start = 0;
        int end = matrix.length*matrix[0].length;
        int colNum = matrix[0].length;
        while (start < end) { //end condition
            int mid = start + (end-start)/2;

            if (matrix[mid/colNum][mid%colNum] < target) {
                start = mid+1;
            } else if (matrix[mid/colNum][mid%colNum] > target) {
                end = mid;
            } else {
                return true;
            }
        }

        return false;
    }
}
