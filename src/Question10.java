import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;

        while(true){
            System.out.print("숫자를 입력 :");
            n = scanner.nextInt();

            for (int i = 1; i < n; i++) {
                sum += i;

            }
        if(n >=100){
            System.out.println("1부터 " +n+ "까지의 합 :"+ sum);
            break;
        }

        else{
            System.out.println("입력하신 숫자가 100보다 작습니다.");
        }
        }
    }
}
