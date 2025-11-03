// Write a program to find the largest digit in a given number.
class Logic
{
    void FindSmallestDigit(int num)    
    {
        int iDigit = 9;
        int iSDigit = 10;

        if(num <= 0)
        {
            num = -num;
        }

        while (num > 0)
        {
            iDigit = num % 10;
            if(iDigit < iSDigit)
            {
                iSDigit = iDigit;
            }
            num = num / 10;
        }

        System.out.println(iSDigit+" is the Smallest Digit.");
    }
}
class Program_20_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
    }
}