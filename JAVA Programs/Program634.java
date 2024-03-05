import java.util.Scanner;

class Program634
{
    public static void Check(char cValue)
    {
        if(cValue == 'A' || cValue == 'a')
        {
            System.out.println("Exam at 7 AM");
        }
        else if(cValue == 'B' || cValue == 'b')
        {
            System.out.println("Exam at 8.30 AM");
        }
        else if(cValue == 'C' || cValue == 'c')
        {
            System.out.println("Exam at 9.20 AM");
        }
        else if(cValue == 'D' || cValue == 'd')
        {
            System.out.println("Exam at 10.30 AM");
        }
        else
        {
            System.out.println("Invalid Output");
        }
         
        
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        

        System.out.println("Enter the Division : ");
        ch = sobj.next().charAt(0);

        Check(ch);
         

    }
}