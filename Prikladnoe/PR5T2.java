import java.util.Scanner;
import java.util.Formatter;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt() ,b = input.nextInt();
        Formatter f = new Formatter();
        f.format("Сумма: %d\nРазность: %d\nПроизведение: %d", a+b,a-b,a*b);
        System.out.print(f);
    }
}
