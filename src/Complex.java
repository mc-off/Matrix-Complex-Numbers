/**
 * Class Complex and functions for them
 * @author mc_off
 * @version 0.3
 */
public class Complex
{
    /** Field
     */
    private double x,y;
    /** Constructor defailt
     * @see Complex#Complex(double,double)
     */
    public Complex()
    {
        this.x=0; this.y=0;
    }
    /** Constructor
     * @param x - ord path
     * @param y - iter path
     * @see Complex#Complex()
     */
    public Complex(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    /** Returning object of summ*/
    public Complex sum(Complex C1, Complex C2)
    {
        Complex C3 = new Complex(C1.x+C2.x,C1.y+C2.y);
        return (C3);
    }
    /** Returning object of subsctracking*/
    public Complex sub(Complex C1, Complex C2)
    {
        Complex C3 = new Complex(C1.x-C2.x,C1.y-C2.y);
        return (C3);
    }
    /** Returning object of multiplying*/
    public Complex mult(Complex C1, Complex C2)
    {
        Complex C3 = new Complex(C1.x*C2.x-C1.y*C2.y,C1.x*C2.y+C1.y*C2.x);
        return (C3);
    }
    /** Returning object of dividing*/
    public Complex dividing(Complex C1, Complex C2)
    {
        Complex C3 = new Complex((C1.x*C2.x-C1.y*C2.y)/(C2.x*C2.x + C2.y*C2.y),(C1.x*C2.y+C1.y*C2.x)/(C2.x*C2.x + C2.y*C2.y));
        return (C3);
    }
    /** Class print for printing matrix
     * @param C1 - complex object
     */
    public void print()
    {
        System.out.println(x + " + " +y+"i");
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
}
