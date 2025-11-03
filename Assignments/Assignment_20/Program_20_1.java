//Write a program to find the sum of all even numbers up to N.
class Logic
{
    void SumEvenNumbers(int n)
    {
        int iSum = 0;
        int iCnt = 0;

        if(n <= 0)
        {
            n = -n;
        }

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
            iSum = iSum + iCnt;
            }
        }
        System.out.println(iSum);
    }
}
class Program_20_1
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}