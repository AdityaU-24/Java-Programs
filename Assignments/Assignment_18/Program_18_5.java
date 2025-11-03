// Write a program to check whether a number is positive, negative or zero.
class Logic
{
    void CheckSign(int num)
    {
        if(num > 0)
        {
            System.out.println("The number is Positive");
        }
        else if(num < 0)
        {
            System.out.println("The number is Negative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
    }
}
class Program_18_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }
}