// Write a program to find the maximum of two numbers.
class Logic
{
    void FindMax(int a, int b)
    {
        if(a > b)
        { 
            System.out.println(a +" is Maximum");
        }
        else
        {
            System.out.println(b +" is Maximum");
        }
    }
}

class Program_17_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.FindMax(20,15);
    }
} 