/**
 * Matrix class
 * @author mc_off
 * @version 0.3
 */

public class Matrix
{
    /** Pole */
    private int x,y;
    /** Matrix
     * @see Complex#Complex() */
    private Complex matrix[][];
    /** Default class
     * @see Matrix#Matrix(int, int)
     */
    Matrix()
    {
        x=1; y=1;
        matrix = new Complex [1][1];
    }
    /** Object constructor
     * @param x - row count
     * @param y - line count
     * @see Matrix#Matrix() */
    Matrix(int x,int y)
    {
        this.x = x;
        this.y = y;
        matrix = new Complex[x][y];
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++)
                matrix[i][j]=new Complex(0,0);
    }
    /** Returning Complex object of determinant
     * @param M1 - matrix for determinirovanie
     * @see Complex#Complex() */
    public Complex det(Matrix M1)
    {
        Complex sum = new Complex();
        Complex sum1 = new Complex();
        if (M1.x==M1.y) {
            for (int i = 0; i < M1.x;i++) {
                if (M1.x == 1) return M1.matrix[0][0];
                else
                {
                    Matrix M3 = new Matrix(M1.x-1, M1.x-1);
                    for (int j = 0; j < M3.x; j++) {
                        for (int k = 0; k < i; k++)
                            M3.matrix[j][k] = M1.matrix[j + 1][k];
                        for (int k = i; k < M3.x; k++)
                            M3.matrix[j][k] = M1.matrix[j + 1][k + 1];
                    }
                    sum1 = sum1.mult(new Complex((int)Math.pow((-1), i),0),M1.matrix[0][i]);
                    sum1 = sum1.mult(sum1,det(M3));
                    sum = sum.sum(sum,sum1);
                }
            }
        }
        else
        {
            System.out.println(M1.x+"!="+M1.y+" I will return -1");
            return(new Complex());
        }
        return(sum);
    }
    /** Extra class for multiplying
     * @param M1 - matrix for sum
     * @param M2 - matrix for sum
     * @param a  - line count
     * @param b - row count
     * @see Matrix#mult(Matrix, Matrix)  */
    public Complex summ(Matrix M1, Matrix M2, int a, int b)
    {
        Complex sum = new Complex();
        Complex sum1 = new Complex();
        for (int i=0; i<M1.y; i++) {
            sum1 = sum1.mult(M1.matrix[a][i], M2.matrix[i][b]);
            sum = sum.sum(sum, sum1);
        }
        return (sum);

    }
    /** Extra class for multiplying
     * @param M1 - matrix for mult
     * @param M2 - matrix for mult
     * @see Matrix#summ(Matrix, Matrix, int, int) */

    public Matrix mult(Matrix M1, Matrix M2) throws  IllegalArgumentException {
        {
            if ((M1.y != M2.x)) throw new IllegalArgumentException("Matrix size error: " + M1.x + "!=" + M2.x);
        }

        Matrix M3 = new Matrix(M1.x, M2.y);
            {
                for (int i = 0; i < M1.x; i++)
                    for (int j = 0; j < M2.y; j++)
                        M3.matrix[i][j] = summ(M1,M2,i,j);
            }
        return (M3);
    }

    /** Extra class for sum
     * @param M1 - matrix for sum
     * @param M2 - matrix for sum*/
    public Matrix plus(Matrix M1, Matrix M2) throws  IllegalArgumentException {
    {
        if ((M1.x != M2.x) || (M1.y != M2.y)) throw new IllegalArgumentException("Matrix size error: " + M1.x + "!=" + M2.x);
    }
        Complex sum = new Complex();
        Matrix M3 = new Matrix(M1.x, M1.y);
            {
                for (int i = 0; i < M1.x; i++)
                    for (int j = 0; j < M1.y; j++)
                        M3.matrix[i][j] = sum.sum(M1.matrix[i][j],M2.matrix[i][j]);
            }
        return (M3);
    }
    /** Extra class for mult on int
     * @param M1 - matrix for mult
     * @param x - int for mult*/
    public Matrix multi_int(Matrix M1, int x)
    {
        Complex s = new Complex();
        Matrix M3 = new Matrix(M1.x, M1.y);
        for (int i = 0; i < M1.x; i++)
            for (int j = 0; j < M1.y; j++)
                M3.matrix[i][j] = s.mult(M1.matrix[i][j], new Complex(x,0));
        return (M3);
    }
    /** Extra class for transp
     * @param M1 - matrix for transp
     */
    public Matrix transp(Matrix M1)
    {
        Matrix M3 = new Matrix(M1.x, M1.y);
        for (int i = 0; i < M1.x; i++)
            for (int j = 0; j < M1.y; j++)
                M3.matrix[i][j] = M1.matrix[j][i];
        return (M3);
    }
    /** Printing matrix
     */
    public void print()
    {
        for (int i = 0; i<x;i++) {
            for (int j = 0; j<y; j++) {
                System.out.print(matrix[i][j].getX() + " + " +matrix[i][j].getY()+"i");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setNum(Complex num, int i, int j)
    {
        this.matrix[i][j] = num;
    }

}