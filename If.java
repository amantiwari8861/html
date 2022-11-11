import java.util.Scanner;
class demo
{
    public static void main(String anj[])
    {
        System.out.println("enter any number");
        Scanner abc=new Scanner(System.in);
        int marks=abc.nextInt();
        if(marks<=100 && marks>90)
        {
            System.out.println("your grade is A1");
        }
        if(marks>=80 && marks<90)
        {
            System.out.println("your grade is A2");
        }
        if(marks>=70 && marks<80)
        {
            System.out.println("your grade is B1");
        }
        if(marks>=60 && marks<70)
        {
            System.out.println("your grade is B2");
        }
        if(marks>=40 && marks<60)
        {
            System.out.println("your grade is C1");
        }
        if(marks>=33 && marks<40)
        {
            System.out.println("your grade is C2");
        }
        if(marks>=0 && marks<33)
        {
            System.out.println("you are failed");
        }
    }
}