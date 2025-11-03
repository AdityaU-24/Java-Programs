// Write a program to print numbers from N down to 1 in reverse order.
class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt = 0;

        if(n <= 0)
        {
        System.out.println("Please enter a Positive number");
        }
        else
        {
            for(iCnt = n; iCnt >= 1; iCnt--)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Program_20_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}