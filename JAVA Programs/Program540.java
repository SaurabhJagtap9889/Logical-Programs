

import java.util.*;

class Program540
{
    public static int Divide(int iValue1,int iValue2)
    {
        int iAns = 0;

        iAns = iValue1 / iValue2;
        return iAns;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int ino1 = 0,ino2 = 0,iRet = 0;

        System.out.println("Enter the first number ");
        ino1 = sobj.nextInt();

        System.out.println("Enter the second number ");
        ino2 = sobj.nextInt();

        iRet = Divide(ino1, ino2);
        System.out.println("Dividation is : "+iRet);
        
    }
}