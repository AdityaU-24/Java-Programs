// Write a program to check whether the number is perfect number or not.
class Logic
{
    void CheckPerfect(int num)
    {
        int iSum = 0;
        int iCnt = 0;

        if(num <= 0)
        {
        System.out.println("Please enter a Positive number");      
        }
        else
        {
            for(iCnt = 1; iCnt <= (num / 2); iCnt++)
            {
                if(num % iCnt == 0)
                {
                    iSum = iSum + iCnt;
                }
            }

            if(num == iSum)
            {
                System.out.println(num+" is a Perfect number");
            }
            else
            {
                System.out.println(num+" is not a Perfect number");
            }
        }
    }
}
class Program_20_3
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
    }
}