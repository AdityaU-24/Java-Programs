// Write a Program to find the minimum of three numbers.
class Logic
{
    void FindMin(int a, int b, int c)
    {
        if(a < b && a < c)
        { 
            System.out.println(a +" is Minimum");
        }
        else if (b < a && b < c)
        {
            System.out.println(b +" is Minimum");
        }
        else
        {
            System.out.println(c+" is Minimum");
        }
    }
}

class Program_17_4
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.FindMin(3, 7, 2);
    }
} 