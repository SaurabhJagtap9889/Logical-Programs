/* 3)
 Write a program which checks whether 7th and 15th and 21st and 28th bit is On or OFF.
 */

 import java.util.Scanner;

 class Assignment37Program3
 {
     public static boolean checkBit(int iNo)
     {
         int iMask = 0x08104040;
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
             System.out.println("7th & 15th & 21st & 28th Bit is ON");
         }
         else
         {
             System.out.println("7th & 15th & 21st & 28th Bit is OFF");
         }
     }
 }
 
 // 0000 8000 0001 0000 0400 0000 0400 0000
 // 0x08104040