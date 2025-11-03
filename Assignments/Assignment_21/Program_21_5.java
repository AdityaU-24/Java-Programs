// Write a Program to Print all numbers from 1 to N that are divisible by both 2 and 3.
class Logic
{
    void PrintDivisibleBy2and3(int n)
    {
        int iCnt = 0;

        if(n <= 0)
        {
            n = -n;
        }

    System.out.println("The numbers divisible by both 2 and 3 between 1 to "+n+" are: ");
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Program_21_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.PrintDivisibleBy2and3(30);
    }
}