import java.util.Scanner;  
public class Q2CumulativeSum 
{
	public static void main(String[] args) 
	{
	double[] anArray;
	double[] result;
	int n;  
    Scanner scan=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");  
    n=scan.nextInt();   
    anArray = new double[100];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
        { 
            anArray[i]=scan.nextDouble();  
        } 
		result=getCumulativeSum(anArray);
		
        for (int i=0; i<n; i++)   
        {  
        System.out.print(result[i] + " ");  
        }  

	}
	public static double[] getCumulativeSum(double[] anArray)
	{
        double[] cumSum;
        double total = 0;
		cumSum=anArray;
        for (int i = 0; i < anArray.length; i++) 
        {
            total += anArray[i];
            cumSum[i] = total;
        }
		return cumSum;
		
	}
}