package lesson14.homework;


import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] array;
    private int rowsNumber, columnsNumber;

    public Matrix(T[][] array) {
        this.array = array;
        rowsNumber = array.length;
        columnsNumber = array[0].length;
    }

    public Matrix() {
    }

    public T[][] getArray() {
        return array;
    }

    public void setArray(T[][] array) {
        this.array = array;
        rowsNumber = array.length;
        columnsNumber = array[0].length;
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public void setRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
    }

    public int getColumnsNumber() {
        return columnsNumber;
    }

    public void setColumnsNumber(int columnsNumber) {
        this.columnsNumber = columnsNumber;
    }

    public Matrix sumMatrices(Matrix<?> m2) {
        Double[][] result = new Double[this.getRowsNumber()][this.getColumnsNumber()];
        if (this.getRowsNumber() == m2.getRowsNumber() && this.getColumnsNumber() == m2.getColumnsNumber()) {
            for (int i = 0; i < getRowsNumber(); i++)
                for (int j = 0; j < getColumnsNumber(); j++) {
                    result[i][j] = this.array[i][j].doubleValue() + m2.array[i][j].doubleValue();
                }
        } else {
            System.out.println("Матрецы не могут быть просумированы");
        }
        return new Matrix<Double>(result);
    }

    public Matrix multiplyMatrices(Matrix<?> matrixB) {
        int m = this.getRowsNumber();
        int n = matrixB.getColumnsNumber();
        int o = matrixB.getRowsNumber();
        Double[][] result = new Double[m][n];
        if (this.getColumnsNumber() == matrixB.getRowsNumber()) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = 0.0;
                    for (int k = 0; k < o; k++) {
                        result[i][j] += this.array[i][k].doubleValue() * matrixB.array[k][j].doubleValue();
                    }
                }
            }
        } else {
            System.out.println("Число столбцов матрицы А должно равнятся числу строк матрицы В");
        }
        return new Matrix<Double>(result);
    }

    public Matrix multiplyMatrix(int num) {
        Double[][] result = new Double[this.getRowsNumber()][this.getColumnsNumber()];
        for (int i = 0; i < getRowsNumber(); i++)
            for (int j = 0; j < getColumnsNumber(); j++) {
                result[i][j] = num * this.array[i][j].doubleValue();
            }
        return new Matrix<Double>(result);
    }

    public void printMatrix() {
        System.out.print("|\t");
        for (int i = 0; i < getColumnsNumber() * 2; i++) {
            System.out.print("-\t");
        }
        System.out.println("\t|");
        for (int i = 0; i < getRowsNumber(); i++) {
            System.out.print("|\t");
            for (int j = 0; j < getColumnsNumber(); j++) {
                if (array[i][j] instanceof Double || array[i][j] instanceof Float) {
                    System.out.printf("%-9.3f", array[i][j]);
                } else {
                    System.out.printf("%-7s", array[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.print("|\t");
        for (int i = 0; i < getColumnsNumber() * 2; i++) {
            System.out.print("-\t");
        }
        System.out.println("\t|");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix<?> matrix = (Matrix<?>) o;

        if (rowsNumber != matrix.rowsNumber) return false;
        if (columnsNumber != matrix.columnsNumber) return false;
        return Arrays.deepEquals(array, matrix.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(array);
        result = 31 * result + rowsNumber;
        result = 31 * result + columnsNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + Arrays.toString(array) +
                ", rowsNumber=" + rowsNumber +
                ", columnsNumber=" + columnsNumber +
                '}';
    }
}
