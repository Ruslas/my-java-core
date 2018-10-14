package lesson7.homework;

public class Matrix {
    private int[][] array;
    private int rowsNumber, columnsNumber;

    public Matrix(int[][] array) {
        this.array = array;
        rowsNumber = array.length;
        columnsNumber = array[0].length;
    }

    public Matrix(int rowsNumber, int columnsNumber) {
        this.array = new int[rowsNumber][columnsNumber];
        this.rowsNumber = rowsNumber;
        this.columnsNumber = columnsNumber;
    }

    public Matrix() {

    }

    public void setArray(int[][] array) {
        this.array = array;
        rowsNumber = array.length;
        columnsNumber = array[0].length;
    }

    public int[][] getArray() {
        return array;
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public int getColumnsNumber() {
        return columnsNumber;
    }

    public Matrix sumMatrices(Matrix m2) {
        Matrix resultMatrix = new Matrix(this.getRowsNumber(), this.getColumnsNumber());
        if (this.getRowsNumber() == m2.getRowsNumber() && this.getColumnsNumber() == m2.getColumnsNumber()) {
            for (int i = 0; i < getRowsNumber(); i++)
                for (int j = 0; j < getColumnsNumber(); j++) {
                    resultMatrix.array[i][j] = this.array[i][j] + m2.array[i][j];
                }
        } else {
            System.out.println("Матрецы не могут быть просумированы");
        }
        return resultMatrix;
    }

    public Matrix multiplyMatrix(int num) {
        Matrix resultMatrix = new Matrix(this.getRowsNumber(), this.getColumnsNumber());
        for (int i = 0; i < getRowsNumber(); i++)
            for (int j = 0; j < getColumnsNumber(); j++) {
                resultMatrix.array[i][j] = num * this.array[i][j];
            }
        return resultMatrix;
    }

    public static Matrix multiplyMatrices(Matrix matrixA, Matrix matrixB) {
        int m = matrixA.getRowsNumber();
        int n = matrixB.getColumnsNumber();
        int o = matrixB.getRowsNumber();
        Matrix result = new Matrix(m, n);
        if (matrixA.getColumnsNumber() == matrixB.getRowsNumber()) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {
                        result.array[i][j] += matrixA.array[i][k] * matrixB.array[k][j];
                    }
                }
            }
        } else {
            System.out.println("Число столбцов матрицы А должно равнятся числу строк матрицы В");
        }
        return result;
    }

    public void printMatrix() {
        System.out.print("|\t");
        for (int i = 0; i < getColumnsNumber() * 3; i++) {
            System.out.print("-");
        }
        System.out.println("\t|");
        for (int i = 0; i < getRowsNumber(); i++) {
            System.out.print("|\t");
            for (int j = 0; j < getColumnsNumber(); j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.print("|\t");
        for (int i = 0; i < getColumnsNumber() * 3; i++) {
            System.out.print("-");
        }
        System.out.println("\t|");
    }
}
