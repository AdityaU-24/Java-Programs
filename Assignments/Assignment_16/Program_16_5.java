// Write a program to count the numbers of digits in a given number.
class Logic
{
    void CountDigits(int num)
    {
        int iDigit = 0;
        int iNoDigits = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            iNoDigits++;     
            num = num / 10;
        }
        System.out.println(iNoDigits);
    }
}
class Program_16_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CountDigits(7865);
    }
}