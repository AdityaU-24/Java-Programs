// Write a program to reverse a number.
class Logic
{
    void ReverseNumber(int num)
    {
        int iDigit = 0;
        int iRev = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;     
            num = num / 10;
        }
        System.out.println(iRev);

    }
}
class Program_16_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.ReverseNumber(1234);
    }
}