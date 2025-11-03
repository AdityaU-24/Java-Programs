// Write a Program to check whether a number is divisible by 5 and 11 or not.
class Logic
{
    void CheckDivisible(int num)
    {
        if(num <= 0)
        {
            num = -num;
        }

        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num+" is Divisible by 5 and 11");
        }
        else
        {
            System.out.println(num+" is not Divisible by 5 and 11");
        }
    }
}
class Program_19_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
    }
}