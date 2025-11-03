// Write a program to calculate the power of a number using loops.
class Logic 
{
    void CalculatePower( int base, int exp)
    {
        int iCnt = 0;
        int iPower = 1;

        if(exp < 0)
        {
            System.out.println("Please enter Positive Exponent");
        }
        else if(exp == 0)
        {
            System.out.println("1");
        }
        else 
        {
            for(iCnt = 1; iCnt <= exp; iCnt++)
            {
                iPower = iPower * base;
            }
                System.out.println(iPower);

        }
    }
}
class Program_19_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 5);
    }
}