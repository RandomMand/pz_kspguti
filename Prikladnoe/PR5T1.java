public class Sqrt {
    static void sqrt(long a){
        double b=a;
        int i=0;
        while((b*b>a)&&(i<200)) {
            b=(b+a/b)/2;
            i++;
        }
        System.out.print(b);
    }
    public static void main(String[] args)
    {
        sqrt(121);
    }
}
