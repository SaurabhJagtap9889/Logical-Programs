/* 3)
 Write a program which checks whether 7th and 8th and 9th bit is On or OFF.
 */

 import java.util.Scanner;

 class Assignment37Program4
 {
     public static boolean checkBit(int iNo)
     {
         int iMask = 0x000001c0;
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
             System.out.println("7th & 8th & 9th Bit is ON");
         }
         else
         {
             System.out.println("7th & 8th & 9th Bit is OFF");
         }
     }
 }
 
 // 0000 0000 0000 0000 0000 0001 8400 0000
 // 0x000001c0