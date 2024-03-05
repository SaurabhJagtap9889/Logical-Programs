/* 2)
Write a program which accept one number from user and Toggle 7th bit and 10th bit of that
number if it is on. return modified number
*/

import java.util.*;

class Assignment38Program4
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0x00000240;
        int iResult = 0;
        iResult = iNo ^ iMask;

        return iResult;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iRet = ToggleBit(iNo);

        System.out.println("Updated number is : "+iRet);
    }
}

 // 0000 0000 0000 0000 0000 0020 0400 0000
 // 0x00000240