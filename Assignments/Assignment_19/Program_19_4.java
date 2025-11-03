// Write a program to print each Digit of a number seperately.
class Logic
{
    void PrintDigits(int num)    
    {
        int iDigit = 0;
        int iRev = 0;

        if(num <= 0)
        {
            num = -num;
        }

        while (num > 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }

        iDigit = 0;

        while(iRev > 0)
        {
            iDigit = iRev % 10;
            System.out.println(iDigit);
            iRev = iRev /10;
        }
    }
}
class Program_19_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.PrintDigits(9876);
    }
}