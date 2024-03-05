import java.util.*;

class Program558
{
    public static int Mult(int ivalue1,int ivalue2,int ivalue3)
    {
        int imult = 1;
        
        imult = ivalue1 * ivalue2 * ivalue3;

        return imult;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iNo3 = 0,iRet = 0;

        System.out.println("Enter the number 1 : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number 2 : ");
        iNo2 = sobj.nextInt();

        System.out.println("Enter the number 3 : ");
        iNo3 = sobj.nextInt();

        iRet = Mult(iNo1,iNo2,iNo3);
        System.out.println("Multiplication is : "+iRet);
    }
}