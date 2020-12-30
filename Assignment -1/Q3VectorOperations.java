import java.util.Scanner;
import java.lang.Math;
public class Q3VectorOperations
{
public static void main(String[] args)
    {
    int exit = 5;
    Scanner in = new Scanner(System.in);
       while(exit != 0) 
       {
            System.out.println("Welcome to Vector Operator\nSelect a choice to continue\n1) Vector Addition\n2) Distance between two points\n3) Length of a vector\n4) Dot product of vectors");
            int choice = in.nextInt();
            switch(choice)
            {
                case 1 : 
                    double[] x,y,z;
                    double x_sum = 0, y_sum = 0, z_sum = 0;
                    int i;
                    System.out.println("How many vectors do you want to add? ");
                    int n = in.nextInt();
                    x = new double[n];
                    y = new double[n];
                    z  = new double[n];
                    for(i = 0 ; i < n ; i++)
                    {
                        System.out.println("Enter the i component (x - component) of the " + (i+1) + " vector");
                        x[i] = in.nextDouble();
                        System.out.println("Enter the j component (y - component) of the " + (i+1) + " vector");
                        y[i] = in.nextDouble();
                        System.out.println("Enter the k component (z - component) of the " + (i+1) + " vector");
                        z[i] = in.nextDouble();
                    }
                    for(i = 0 ; i < n ; i++)
                    {
                        x_sum = x[i] + x_sum;
                        y_sum = y[i] + y_sum;
                        z_sum = z[i] + z_sum;
                    }
                    System.out.println("The vectors after Addition is : " + x_sum + "i + " + y_sum + "j + " + z_sum + "k ");
                    break;

                case 2 : 
                    double[] v1,v2,dis;
                    double distance = 0;
                    System.out.println("Enter the dimension of space ");
                    Scanner scan = new Scanner(System.in);
                    n = scan.nextInt();
                    v1 = new double[n];
                    v2 = new double[n];
                    dis = new double[n];
                    System.out.println("Enter the vector elements ");
                    for(i = 0 ; i < n ; i++)
                      {
                        System.out.println("Enter the "+(i+1)+" dimension value of vector 1 : ");
                        v1[i] = scan.nextDouble();
                      }
                    for(i = 0 ; i < n ; i++)
                    {
                        System.out.println("Enter the "+(i+1)+" dimension value of vector 2 : ");
                        v2[i] = scan.nextDouble();
                    }
                    for(i = 0 ; i < n ; i++)
                    {
                        dis[i] = (v2[i] - v1[i])*(v2[i] - v1[i]);
                    }
                    for(i = 0 ; i < n ; i++)
                    {
                        distance = dis[i] + distance ;
                    }
                    distance = Math.sqrt(distance);
                    System.out.println("Distance or Length = " + distance);
                    break;
                
                case 3 : 
                    double xd,yd,zd;
                    System.out.println("Enter the i component (x - component) of the vector");
                    xd = in.nextDouble();
                    System.out.println("Enter the j component (y - component) of the vector");
                    yd = in.nextDouble();
                    System.out.println("Enter the k component (z - component) of the vector");
                    zd = in.nextDouble();
                    xd = xd * xd;
                    yd = yd * yd;
                    zd = zd * zd;
                    double sum = xd + yd + zd;
                    double length = Math.sqrt(sum);
                    System.out.println("The length of the vector you entered is : " + length);
                    break;

                case 4 : 
                    double[] xa,ya,za;
                    double x_dot = 1, y_dot = 1, z_dot = 1;
                    System.out.println("How many vectors do you want to multiply(DOT PRODUCT)? ");
                    n = in.nextInt();
                    xa = new double[n];
                    ya = new double[n];
                    za = new double[n];
                    for(i = 0 ; i < n ; i++)
                    {
                        System.out.println("Enter the i component (x - component) of the " + (i+1) + " vector");
                        xa[i] = in.nextDouble();
                        System.out.println("Enter the j component (y - component) of the " + (i+1) + " vector");
                        ya[i] = in.nextDouble();
                        System.out.println("Enter the k component (z - component) of the " + (i+1) + " vector");
                        za[i] = in.nextDouble();
                    }
                        for(i = 0 ; i < n ; i++)
                    {
                        x_dot = xa[i] * x_dot;
                        y_dot = ya[i] * y_dot;
                        z_dot = za[i] * z_dot;
                    }
                        System.out.println("The vector after Dot Product is : " + x_dot + "i + " + y_dot + "j + " + z_dot + "k ");
                        break;
                default : System.out.println("Invalid Option")
            }
            System.out.println("Enter any other key to do another operation or enter 0 to exit");
            exit = in.nextInt();
        }
    }
}




            