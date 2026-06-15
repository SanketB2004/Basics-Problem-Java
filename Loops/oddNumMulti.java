public class oddNumMulti {
    public static void main(String[] args) {

        System.out.println("This Program is a 1 to given number sum all odd numbers ");

        int givenNum = 15;
        int sum = 0;

        for (int i = 1; i <= givenNum; i += 2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
