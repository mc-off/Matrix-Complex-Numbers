import java.util.Scanner;
/**
 * Main class
 * @author mc_off
 * @version 0.2
 */
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Normal and Complex.java part of 1 num");
            int x = in.nextInt();
            int y = in.nextInt();
            Complex C1 = new Complex(x, y);
            System.out.println("Normal and Complex.java part of 2 num");
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            Complex C2 = new Complex(x1, y1);
            System.out.println("C1 + C2");
            Complex C3 = new Complex(x, y);
            C3 = C3.sum(C1, C2);
            C3.print();
            System.out.println("C1 - C2");
            C3 = C3.sub(C1, C2);
            C3.print();
            System.out.println("C1 x C2");
            C3 = C3.mult(C1, C2);
            C3.print();
            System.out.println("C1 / C2");
            C3 = C3.dividing(C1, C2);
            C3.print();
        }
        {
            System.out.println("row and column of 1 matrix");
            int x = in.nextInt();
            int y = in.nextInt();
            Matrix M1 = new Matrix(x, y);
            for (int i = 0; i < M1.getX(); i++)
                for (int j = 0; j < M1.getY(); j++) {
                    int a = in.nextInt();
                    int n = in.nextInt();
                    Complex num = new Complex(a, n);
                    M1.setNum(num, i, j);
                }
            M1.print();
            System.out.println("X and Y of 2 matrix");
            x = in.nextInt();
            y = in.nextInt();
            Matrix M2 = new Matrix(x, y);
            for (int i = 0; i < M1.getX(); i++)
                for (int j = 0; j < M1.getY(); j++) {
                    int a = in.nextInt();
                    int n = in.nextInt();
                    Complex num = new Complex(a, n);
                    M2.setNum(num, i, j);
                }
            M2.print();
            System.out.println("M1 + M2");
            Matrix M3 = new Matrix();
            M3 = M3.plus(M1, M2);
            M3.print();
            System.out.println("M1 * 3");
            M3 = M3.multi_int(M1, 3);
            M3.print();
            System.out.println("M2^T");
            M3 = M3.transp(M2);
            M3.print();
            System.out.println("M1 x M2");
            M3 = M3.mult(M1, M2);
            M3.print();
            System.out.println("Determinant of M1 = " + "\n");
            M3.det(M1).print();
        }
        System.out.println("Wow, so much code without errors ^_^");
    }
}