package com.company;

import java.util.Random;

public class Matrix {
    public int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix() {
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void getRandomNums() {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(20);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public Matrix getSum(Matrix matrix1, Matrix matrix2) {
        Matrix result =new Matrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               matrix1.matrix[i][j] +=matrix2.matrix[i][j];
            }
        }
        result=matrix1;
        return result;
    }

    public Matrix getSubtraction(Matrix matrix1, Matrix matrix2) {
        Matrix result =new Matrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1.matrix[i][j] -= matrix2.matrix[i][j];
            }
        }result=matrix1;
        return result;
    }

    public Matrix getMultiplication(Matrix matrix1, Matrix matrix2) {
        Matrix result=null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1.matrix[i][j] *= matrix2.matrix[j][i];
            }
        }
        result=matrix1;
        return result;
    }

    public void getTrans(Matrix matrix1) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + "   ");
            }
            System.out.println();
        }

}
}
