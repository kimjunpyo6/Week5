public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;

        while (a <= 100) {
            if (a % 2 != 0) {
                sum += 1;
            }
            a++;
        }
        System.out.println("1부터 100까지 홀수 합:"+sum);
    }
}