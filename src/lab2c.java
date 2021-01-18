import java.util.Scanner;

public class lab2c {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);
        System.out.println("Moi nhap N>2 : ");
        int N = dang.nextInt();
        int M = 2;

        for(int i =2 ;i<=N; i++){
            int R=N%i;
            M+=1;
            if(R==0&&M>=N-1){
                System.out.println("N is Not a prime number ");
                }
            }
        }

}
