import java.util.Scanner;
public class ComplexOperations{
    public static void main(String args[]){
        double x1,y1,x2,y2;
        double[] pdtAnswer = new double[2];
        Scanner in = new Scanner(System.in);
        Complex a = new Complex();
        System.out.println("Enter the real part");
        x1 = in.nextDouble();
        System.out.println("Enter the imaginary part");
        y1 = in.nextDouble();
        Complex b = new Complex(x1,y1);
        System.out.println("1st Complex Number");
        System.out.println("Enter the real part");
        x1 = in.nextDouble();
        System.out.println("Enter the imaginary part");
        y1 = in.nextDouble();
        System.out.println("2nd Complex Number");
        System.out.println("Enter the real part");
        x2 = in.nextDouble();
        System.out.println("Enter the imaginary part");
        y2 = in.nextDouble();
        a.display(x1,y1,x2,y2);
        System.out.println("Operation - Addition");
        a.addition(x1,y1,x2,y2);
        System.out.println("Operation - Subtraction");
        a.subtraction(x1,y1,x2,y2);
        System.out.println("Operation - Multiplication");
        pdtAnswer = Complex.multiply(x1,y1,x2,y2);
        System.out.println("The Product of Complex Numbers: " + pdtAnswer[0]+"+"+pdtAnswer[1]+"i");
        System.out.println("Number of Objects Created : " + Complex.noofobjects + "\n");
        System.out.println("Enter the new real part");
        x1 = in.nextDouble();
        System.out.println("Enter the new imaginary part");
        y1 = in.nextDouble();
        a.real_setter(x1);
        a.img_setter(y1); 
        System.out.println("Real Part = "+a.real_getter());
        System.out.println("Imaginary part = "+a.img_getter());
        System.out.println("Complex Number = "+a.real_getter() +" + " + a.img_getter() + "i");
        in.close(); 
    }
}
 class Complex{
    private  double complex_real;
    private  double complex_img;
        public double real_getter() 
       {
        return complex_real;
       }
       public double img_getter()
      {
        return complex_img;
      }
      public void real_setter(double x1) 
       {
        this.complex_real = x1;
       }
      public void img_setter(double y1)
      {
        this.complex_img = y1;
      }
    static int noofobjects = 0;
    {
        noofobjects = noofobjects + 1; 
    }
    public Complex()
    {    
      complex_real = 0.0;
      complex_img = 0.0; 
      System.out.println("Complex Number(no value) "+ complex_real + "+"+complex_img+"i");

    }
    public Complex(double complex_real, double complex_img){
        this.complex_real = complex_real;
        this.complex_img = complex_img;
        System.out.println("Complex Number "+ complex_real + "+"+complex_img+"i");
    }  
    public void addition(double x1, double y1, double x2, double y2)
    {
        double real_addition = x1 + x2;
        double img_addition = y1 + y2;
        System.out.println("Added Complex Number " + real_addition + "+" + img_addition+"i");
    }  
    public void subtraction(double x1, double y1, double x2, double y2)
    {
        double real_addition = x1 - x2;
        double img_addition = y1 - y2;
        System.out.println("Subtracted Complex Number " + real_addition + "+" + img_addition+"i");
    }  
    public void display(double x1, double y1, double x2, double y2)
    {
        System.out.println("Complex Number 1 "+ x1 + "+"+y1+"i");
        System.out.println("Complex Number 2 "+ x2 + "+"+y2+"i");
    }  
    public static double[] multiply(double x1,double y1,double x2,double y2)
    {   
        double[] pdt = new double[2];
        pdt[0] = ((x1*x2)-(y1*y2));
        pdt[1] = ((x1*y2)+(y1*x2));
        return pdt;
    }
}