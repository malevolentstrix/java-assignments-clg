import java.util.Scanner;
public class Q1SumOfDigits 
{	public static void main(String[] args) 
	{	
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        int someValue = ob.nextInt();
        boolean result = checkSumOfDigit(x,someValue);
        System.out.println(result);
	}
    public static boolean checkSumOfDigit(int x,int someValue)
        {
            int sum = 0, temp ;
            while(x>0)
            {
                temp = x % 10 ;
                sum = sum + temp ;
                x = x / 10 ;
            }
            return sum <= someValue ;
        }                                                           
}
