import java.util.Scanner;
class Abc
{
    public static void main(String args[])
    {
        Scanner abc=new Scanner(System.in);
        System.out.println("enter any number");
        int a = abc.nextInt();
        int b = a*a*a;
        System.out.println("volume of cube " + a +"  " +b);

    }
}