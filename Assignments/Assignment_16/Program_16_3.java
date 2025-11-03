// write a program to find the factorial of a number using for loop.
class Logic
{
    void FindFactorial(int num)
    {
        int iFact = 1;
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= num ; iCnt--)
        {
            iFact = iFact * num;
        }
    
    System.out.println("The Factorial of "+ num +" is: \n" + iFact);
    
    }
}

class Program_16_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.FindFactorial(5);
    }
}