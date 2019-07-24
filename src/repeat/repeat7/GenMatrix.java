package repeat.repeat7;

public class GenMatrix <T extends  Number> {
    private T[][] matr;
    private int columnsNumber;
    private int rowsNumber;

    public GenMatrix(T[][] matr) {
        this.matr = matr;
        this.columnsNumber = matr[0].length;
        this.rowsNumber = matr.length;
    }

    public T[][] getMatr() {
        return matr;
    }

    public void setMatr(T[][] matr) {
        this.matr = matr;
        this.columnsNumber = matr[0].length;
        this.rowsNumber = matr.length;
    }

    public int getColumnsNumber() {
        return columnsNumber;
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public GenMatrix sumMatrix(GenMatrix<?> matrix2){
        Double [][] resalt = new Double[rowsNumber][columnsNumber];
        if (isSameSize(this, matrix2)){
            for (int i = 0; i<this.rowsNumber; i++)
                for (int j = 0; j<this.columnsNumber; j++){
                    resalt[i][j] = this.getMatr()[i][j].doubleValue() +  matrix2.getMatr()[i][j].doubleValue();
                }
        } else {
            System.out.println("Матрицы не могут быть просумированы");
        }
        return new GenMatrix<>(resalt);
    }

    public boolean isSameSize(GenMatrix<?> matrix1, GenMatrix<?> matrix2){
        return matrix1.columnsNumber == matrix2.columnsNumber &&
                matrix1.rowsNumber == matrix2.rowsNumber;
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
                if (matr[i][j] instanceof Double || matr[i][j] instanceof Float) {
                    System.out.printf("%-9.3f", matr[i][j]);
                } else {
                    System.out.printf("%-7s", matr[i][j]);
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
}
