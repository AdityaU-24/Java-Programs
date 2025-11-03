// Write a Program to count total number of factors of a given number.
class Logic
{
    void CountFactors(int num)
    {
        int iCnt = 0;
        int iFact = 0;

        if(num <= 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= (num/2); iCnt++)
        {
            if(num % iCnt == 0)
            {
                iFact++;
            }
        }

        System.out.println(iFact);
    }
}
class Program_21_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}