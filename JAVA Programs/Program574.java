import java.util.*;

class Program574
{
    public static float AreaOfCircle(float fRadius)
    {
        float fPI = 3.14f;
        float Area = 0;

        Area = fPI * fRadius * fRadius;

        return Area;

    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float fNo = 0.0f,fRet = 0.0f;
        System.out.println("Enter the number : ");
        fNo = sobj.nextFloat();

        fRet = AreaOfCircle(fNo);
        System.out.println("Area of circle is : "+fRet);

    }
}