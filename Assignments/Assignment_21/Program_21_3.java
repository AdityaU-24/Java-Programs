// Write a Program to display all factors of a given number.
class Logic
{
    void DisplayFactors(int num)
    {
        int iCnt = 0;

        if(num <= 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= (num/2); iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Program_21_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }

}