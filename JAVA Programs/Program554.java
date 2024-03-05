import java.util.*;

class Program554
{
    public static int sumfact(int ivalue)
    {
        int isum = 0;
        for(int i = 1;i <= ivalue;i++)
        {
            if((ivalue % i) != 0)
            {
                isum = isum + i;
            }
        }
        return isum;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = sumfact(iNo);
        System.out.println("Summation of non factorial is : "+iRet);
    }
}