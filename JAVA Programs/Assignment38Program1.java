/* 1)
Write a program which accept one number from user and off 7th bit of that
number if it is on. return modified number
*/

import java.util.*;

class Assignment38Program1
{
    public static int OFFBit(int iNo)
    {
        int iMask = 0x00000040;
        int iResult = 0;
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return (iNo ^ iMask);
        }
        else
        {
            return iNo;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iRet = OFFBit(iNo);

        System.out.println("Updated number is : "+iRet);
    }
}

 // 0000 0000 0000 0000 0000 0000 0400 0000
 // 0x00000040