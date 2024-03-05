import java.util.*;

class Program575
{
    public static float AreaOfRectangle(float fwidth,float fheight)
    {
        float Area = 0;

        Area = fwidth * fheight;
        return Area;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float fNo1 = 0.0f,fNo2 = 0.0f,fRet = 0.0f;

        System.out.println("Enter the width : ");
        fNo1 = sobj.nextFloat();

        System.out.println("Enter the Height : ");
        fNo2 = sobj.nextFloat();

        fRet = AreaOfRectangle(fNo1, fNo2);
        System.out.println("Area of Rectangle is : "+fRet);

    }
}