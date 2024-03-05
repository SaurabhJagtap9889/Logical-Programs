/* 4)
  Write a program which accept one number and position from user and toggle that bit. Return modified number.
 */
import java.util.*;

class Assignment39Program4
{
    public static int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0x00000001;
        int iResult = 0;

        iMask = iMask << (iPos-1);
        iResult = iNo ^ iMask;

        return iResult;


        
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iPos = 0;
        int iRet = 0;
        

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the position :");
        iPos = sobj.nextInt();

        iRet = ToggleBit(iNo,iPos);

        System.out.println("Updated number is :"+iRet);
    }
}