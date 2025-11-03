// Write a program to print all odd numbers up to N.
class Logic
{
    void PrintOddNumbers(int n)
    {
        int iNo = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }
    
        for(iNo = 1; iNo <= n; iNo++)
        {
            if(iNo % 2 != 0)
            {
                System.out.println(iNo);
            }    
        }
    }
}
class Program_18_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.PrintOddNumbers(20);
    }

}