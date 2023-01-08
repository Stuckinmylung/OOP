package BTVN_T3;

import java.util.Scanner;

public class Matrix {

    public void createRandomMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
    }


    public void createRandomMatrix(int rows, int cols) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
    }


    public boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }


    public boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }


    public int[][] add(int[][] matrix1, int[][] matrix2) {

        if (haveSameDimension(matrix1,matrix2)|| (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't add two matrix");
            return null;
        }
        int[][] sum_Mat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum_Mat[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_Mat;
    }

    public double[][] add(double[][] matrix1, double[][] matrix2) {

        if (haveSameDimension(matrix1,matrix2)|| (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't add two matrix");
            return null;
        }
        double[][] sum_Mat = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum_Mat[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_Mat;
    }

    public int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't subtract two matrix");
            return null;
        }
        int[][] sub_Mat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub_Mat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub_Mat;
    }

    public double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't subtract two matrix");
            return null;
        }
        double[][] sub_Mat = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub_Mat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub_Mat;
    }

    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2[0].length && matrix1[0].length != matrix2.length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't multiply two matrix");
        }
        if (matrix1[0].length == matrix2.length) {
            int[][] mul_Mat = new int[matrix2[0].length][matrix1.length];
            for (int i = 0; i < mul_Mat.length; i++) {
                for (int j = 0; j < mul_Mat[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        mul_Mat[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        if (matrix1.length == matrix2[0].length) {
            int[][] mul_Mat = new int[matrix2.length][matrix1[0].length];
            for (int i = 0; i < mul_Mat.length; i++) {
                for (int j = 0; j < mul_Mat[0].length; j++) {
                    for (int k = 0; k < matrix1.length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        return null;


    }

    public double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2[0].length || matrix1[0].length != matrix2.length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't multiply two matrix");
        }
        else if (matrix1[0].length == matrix2.length) {
            double[][] mul_Mat = new double[matrix2[0].length][matrix1.length];
            for (int i = 0; i < mul_Mat.length; i++) {
                for (int j = 0; j < mul_Mat[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        mul_Mat[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        else if (matrix1.length == matrix2[0].length) {
            double[][] mul_Mat = new double[matrix2.length][matrix1[0].length];
            for (int i = 0; i < mul_Mat.length; i++) {
                for (int j = 0; j < mul_Mat[0].length; j++) {
                    for (int k = 0; k < matrix1.length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }

        return null;
    }
    public void printMatrix(int[][] matrix)
    {
        if(matrix != null) {
            for (int[] row : matrix) {
                for (int aInt : row) {
                    System.out.printf("%4d ", aInt);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Matrix aMatrix = new Matrix();

        int[][] a = new int[][]{{1, 2}, { 5, 6},{7,8}};
        int[][] b = new int[][]{{0, 1}, {2, 3}, {3, 5}};

        //
        System.out.println("Matrix A:");
        aMatrix.printMatrix(a);
        System.out.println("Matrix B:");
        aMatrix.printMatrix(b);
        System.out.println("Matrix C");
        aMatrix.printMatrix(aMatrix.multiply(b,a));
    }


}
