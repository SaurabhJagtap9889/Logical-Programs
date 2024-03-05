import java.util.*;

class Program559
{
    public static int Percentage(int iTotal,int iobtained)
    {
        int iPercent = 1;
        
        iPercent = (iobtained * 100) / iTotal;

        return iPercent;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iRet = 0;

        System.out.println("Enter the total marks : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the obtained marks : ");
        iNo2 = sobj.nextInt();

        iRet = Percentage(iNo1,iNo2);
        System.out.println("Percentage is : "+iRet);
    }
}