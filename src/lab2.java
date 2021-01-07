import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);
        System.out.println("Moi nhap A: ");
        int A = dang.nextInt();
        System.out.println("Moi nhap B: ");
        int B = dang.nextInt();
        if (B==0){
            System.out.println("Error: Devide by zero");
        }else{
            int C = A/B;
            System.out.println(C);
        }
    }
}
