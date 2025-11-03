//Write a program to Count how many even and odd numbers are present between 1 and N.
class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        if(n <= 0)
        {
            n = -n;
        }

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else 
            {
                iOdd++;
            }
        }
        System.out.println("There are "+iEven+" Even numbers between 1 and "+n);
        System.out.println("There are "+iOdd+" Odd numbers between 1 and "+n);
    }
}
class Program_21_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}