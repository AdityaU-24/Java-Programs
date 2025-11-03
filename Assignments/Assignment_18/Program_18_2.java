// Write a Program to print all even numbers upto N.
class Logic
{
    void PrintEvenNumbers(int n)
    {
        int iNo = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }
    
        for(iNo = 1; iNo <= n; iNo++)
        {
            if(iNo % 2 == 0)
            {
                System.out.println(iNo);
            }    
        }
    }
}
class Program_18_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);
    }

}