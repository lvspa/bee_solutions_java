import java.util.Scanner;
public class Bee2840 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        int l=scanner.nextInt();
        double pot=Math.pow(r,3);
        double calc= ((pot*3.1415)*4)/3;
        double calc_quant=l/calc;
        int formt=(int)calc_quant;
        System.out.println(formt);
    }
}
