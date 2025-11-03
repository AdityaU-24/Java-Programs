// Write a Program to find the sum of even and Odd digits seperately in a number.
class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iESum = 0;
        int iOSum = 0;

        if(num <= 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            iDigit = num % 10;
            
            if(iDigit % 2 == 0)
            {
                iESum = iESum + iDigit;
            }
            else
            {
                iOSum = iOSum + iDigit;
            }

            num = num / 10;
        }

        System.out.println("The Sum of Even Digits is: "+iESum);
        System.out.println("The Sum of Odd Digits is: "+iOSum);
    }
}
class Program_18_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }
}