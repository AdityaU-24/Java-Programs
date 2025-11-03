// Write a program to check whether a given year is a leap year or not.
class Logic
{
    void CheckLeapYear(int year)
    {
        if(year <= 0)
        {
            year = -year;
        }

        if(year % 4 == 0)
        {
            System.out.println(year+" is a Leap Year!");
        }
        else
        {
            System.out.println(year+" is not a Leap Year!");
        }
    }
}
class Program_19_1
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}