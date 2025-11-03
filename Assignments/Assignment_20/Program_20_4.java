// Write a program to find the largest digit in a given number.
class Logic
{
    void FindLargestDigit(int num)    
    {
        int iDigit = 0;
        int iLDigit = 0;

        if(num <= 0)
        {
            num = -num;
        }

        while (num > 0)
        {
            iDigit = num % 10;
            if(iDigit > iLDigit)
            {
                iLDigit = iDigit;
            }
            num = num / 10;
        }

        System.out.println(iLDigit+" is the largest Digit.");
    }
}
class Program_20_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}