package LambdaAssign_1;

import java.util.Scanner;
@FunctionalInterface
public interface Inputs
{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        void result();
}
