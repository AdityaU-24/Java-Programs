// Write a progarm to print the multipliacation table of a number.
class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 0;
        
        System.out.println("Multiplication Table of "+num+" is:");

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(num*iCnt);    
        }
    }
} 
class Program_17_5
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
    }
}