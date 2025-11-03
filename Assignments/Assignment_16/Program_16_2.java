// Write a program to check whether a given number is even or odd.
class Logic
{
    void CheckEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("The number is Even\n");
        }
        else
        {
            System.out.println("The number is Odd\n");
        }
    }
}
class Program_16_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}