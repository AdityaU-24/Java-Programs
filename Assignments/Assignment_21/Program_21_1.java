// Write a Program to calculate the product of digits of a number.
class Logic
{
    void ProductOfDigits(int num)    
    {
        int iDigit = 0;
        int iProd = 1;

        if(num <= 0)
        {
            num = -num;
        }

        while (num > 0)
        {
            iDigit = num % 10;
            iProd = iProd * iDigit;
            num = num / 10;
        }

        System.out.println(iProd+" is the Product of Digits.");
    }
}
class Program_21_1
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.ProductOfDigits(234);
    }
}