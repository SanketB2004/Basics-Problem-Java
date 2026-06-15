public class factorialCalculate {
    public static void main(String[] args) {
        System.out.println("This Program is Used To Factorial Calculate");

        int yournum = 4;

        int i = 1;
        int store = 1;
        while (i <= yournum) {

            store*=i;
            

            i++;
           
        }
        System.out.println(store);
    }
}
