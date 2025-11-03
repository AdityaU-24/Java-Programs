// write a program to display the grade of a student based on marks.
//90-100 :- A+
//80-90 :- A
//70-80 :- B
//60-70 :- C
//50-60 :- D
//40-50 :- E
//30-40 :- -E
//less than 30 :- Fail

class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks <= 0)
        {
            marks = -marks;
        }

        if(marks > 100)
        {
            System.out.println("Invalid Input");
        }
        else if(marks > 90)
        {
            System.out.println("Grade Obtained is: A+");
        }
        else if(marks > 80)
        {
            System.out.println("Grade Obtained is: A");
        }
        else if(marks > 70)
        {
            System.out.println("Grade Obtained is: B");
        }
        else if(marks > 60)
        {
            System.out.println("Garde Obtained is: C");
        }
        else if(marks > 50)
        {
            System.out.println("Garde Obtained is: D");
        }
        else if(marks > 40)
        {
            System.out.println("Garde Obtained is: E");
        }
        else if(marks > 30)
        {
            System.out.println("Garde Obtained is: -E");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}
class Program_19_2
{
    public static void main(String Arr[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}