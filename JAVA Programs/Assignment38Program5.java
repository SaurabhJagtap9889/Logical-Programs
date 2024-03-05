/* 5)
Write a program which accept one number from user and on its first 4 bits. Return modified number.
*/

import java.util.*;

class Assignment38Program5
{
    public static int ONBit(int iNo)
    {
        int iMask = 0x0000000f;

        return iNo | iMask;
     
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = ONBit(iNo);

        System.out.println("Updated number : "+iRet);

    }
}

// 0000 0000 0000 0000 0000 0000 0000 0000
// 0x0000000f