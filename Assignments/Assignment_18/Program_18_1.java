// Write a Program to check whether a number is prime or not.
class Logic
{
    void CheckPrime(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num+" is a Prime number");
        }
        else
        {
            System.out.println(num+" is a not Prime number");
        }
    }
}
class Program_18_1
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}