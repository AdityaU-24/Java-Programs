//Write a program to check whether a number is a palindrome or not.
class Logic
{
    void CheckPalindrome(int num)
    {
        int num2 = num;
        int iDigit = 0;
        int iRev = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;     
            num = num / 10;
        }
        
        if(num2 == iRev)
        {
            System.out.println("The number is Palindrome");
        }
        else
        {
            System.out.println("The number is not a Palindrome");
        }
    }
}
class Program_17_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
    }
} 