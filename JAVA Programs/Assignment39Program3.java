/* 3)
  Write a program which accept one number and position from user and on that bit. Return modified number.
 */
import java.util.*;

class Assignment39Program3
{
    public static int ONBit(int iNo,int iPos)
    {
        int iMask = 0x00000001;

        iMask = iMask << (iPos-1);

        return iNo | iMask;


        
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

        iRet = ONBit(iNo,iPos);

        System.out.println("Updated number is :"+iRet);
    }
}