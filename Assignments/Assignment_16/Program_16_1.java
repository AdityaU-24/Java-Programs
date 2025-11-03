// write a program t calculate the sum of first N natural numbers.
class Logic
{
    void CalculateSum(int n)
    {
        int iNo = 0;
        int iSum = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }
    
        for(iNo = 1; iNo <= n; iNo++)
        {
            iSum = iSum + iNo;
        }
        System.out.println(iSum);
    }
}
class Program_16_1
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CalculateSum(10);
    }

}