package lesson14.homework;


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

    public Matrix sumMatrices(Matrix m2) {
        Double[][] result = new Double[this.getRowsNumber()][this.getColumnsNumber()];
        if (this.getRowsNumber() == m2.getRowsNumber() && this.getColumnsNumber() == m2.getColumnsNumber()) {
            for (int i = 0; i < getRowsNumber(); i++)
                for (int j = 0; j < getColumnsNumber(); j++) {
                    result[i][j] = this.array[i][j].doubleValue() + m2.array[i][j].doubleValue();
                }
        } else {
            System.out.println("Матрецы не могут быть просумированы");
        }

        Matrix<Double> resultMatr = new Matrix<Double>(result);

        return resultMatr;
    }


}
