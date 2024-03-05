import java.util.*;

class Program619
{
    public static void DisplayPattern(int iRow,int iCol)
    {
        for(int i = 1;i <= iRow;i++)
        {
            if( i % 2 == 0)
            {
                int iCnt1 = -1;
                for(int j = 1;j <= iCol;j++)
                {
                    System.out.print(iCnt1 +"\t");
                    iCnt1 = iCnt1 + (-1);
                }
                
            }
            else
            {
                 int iCnt = 1;
                for(int j = 1;j <= iCol;j++)
                {
                    System.out.print(iCnt +"\t");
                    iCnt++;
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