package LambdaAssign_1;
public class LambdaExpression
{
    public static void main(String[] args)
    {
        System.out.println("Enter two integer one by one");
        Inputs obj=()-> System.out.println("The highest number is:- "+(Math.max(Inputs.a, Inputs.b)));
        obj.result();
    }
}