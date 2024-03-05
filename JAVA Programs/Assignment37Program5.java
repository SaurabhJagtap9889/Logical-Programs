/* 5)
Write a program which checks whether first and last bit is On or
OFF. First bit means bit number 1 and last bit means bit number 32.

*/

import java.util.Scanner;

class Assignment37Program5
{
    public static boolean checkBit(int iNo)
    {
        int iMask = 0x80000001;
        int iResult = 0;
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        bRet = checkBit(iNo);

        if(bRet == true)
        {
            System.out.println("1st and Last Bit is ON");
        }
        else
        {
            System.out.println("1st and Last Bit is OFF");
        }
    }
}

 // 8000 0000 0000 0000 0000 0000 0000 0001
 // 0x80000001