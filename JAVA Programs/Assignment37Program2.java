/* 2)
 Write a program which checks whether 5th and 18th bit is On or OFF.
 */

 import java.util.Scanner;

 class Assignment37Program2
 {
     public static boolean checkBit(int iNo)
     {
         int iMask = 0x00020010;
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
             System.out.println("5th and 18th Bit is ON");
         }
         else
         {
             System.out.println("5th and 18th Bit is OFF");
         }
     }
 }
 
 // 0000 0000 0000 0020 0000 0000 0001 0000
 // 0x00020010