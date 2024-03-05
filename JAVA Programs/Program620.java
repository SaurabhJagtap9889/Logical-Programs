import java.util.*;

class Program620
{
    public static void DisplayPattern(int iRow,int iCol)
    {
        for(int i = 1;i <= iRow;i++)
        {
             
            for(int j = i;j < i + iCol;j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0;

        System.out.println("enter the number of Rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        iNo2 = sobj.nextInt();

        DisplayPattern(iNo1,iNo2);
    }
}