import java.util.*;

class Program614
{
    public static void DisplayPattern(int iRow,int iCol)
    {
        char CapitalCh = 'A';
        char SmallCh = 'a';
        for(int i = 1;i <= iRow;i++)
        {
            for(int j = 1;j <= iCol;j++)
            {
                if((i % 2 == 0))
                {
                    System.out.print((char)(SmallCh+j-1)+"\t");
                }
                else
                {
                    System.out.print((char)(CapitalCh+j-1) +"\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0;
        System.out.println("Enter the number of Rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        iNo2 = sobj.nextInt();

        DisplayPattern(iNo1,iNo2);
    }
}