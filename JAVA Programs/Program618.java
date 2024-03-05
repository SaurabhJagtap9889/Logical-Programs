import java.util.*;

class Program618
{
    public static void DisplayPattern(int iRow,int iCol)
    {
        int iCnt = 1;
        char ch = '\0';
         
        for(int i = 1;i <= iRow;i++)
        {
            if( i % 2 == 0)
            {
                iCnt = 1;
                for(int j = 1;j <= iCol;j++)
                {
                    System.out.print(iCnt +"\t");
                    iCnt++;
                }
                
            }
            else
            {
                ch = 'a';
                for(int j = 1;j <= iCol;j++)
                {
                    System.out.print(ch +"\t");
                    ch++;
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