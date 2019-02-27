package com.剑指Offer;

import java.util.ArrayList;

/**
 * @description: 顺时针打印矩阵
 * @author: KimJun
 * @date: 2/27/19 09:13
 */
public class Page161 {

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length - 1;
        int columns = matrix[0].length - 1;

        if (row == 0 && columns == 0) {
            return null;
        }

        for (int i = 0; i << 1 <= row && i << 1 <= columns; i++) {
            Page161.printMatrixInCirle(list, i, row - i, columns - i, matrix);
        }

        return list;

    }

    public static void printMatrixInCirle(ArrayList<Integer> list, int start,
                                          int row, int columns, int [][] matrix) {
        for (int i = start; i < columns; i++) {
            list.add(matrix[start][i]);
        }
        if (start == row)
            return;
        for (int i = start + 1; i <= row; i++) {
            list.add(matrix[i][columns]);
        }
        if (start == columns)
            return;
        for (int i = columns - 1; i >= start; i--) {
            list.add(matrix[row][i]);
        }
        for (int i = row - 1; i >= start; i--) {
            list.add(matrix[i][start]);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        ArrayList<Integer> list = Page161.printMatrix(arr);
        for (Integer list1 : list) {
            System.out.println(list1);
        }
    }

}
