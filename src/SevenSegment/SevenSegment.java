package SevenSegment;
import java.util.Scanner;

public class SevenSegment {
    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  value you want to print");
        int value = input.nextInt();
        String valtoValue = String.valueOf(value);
        printValue(valtoValue);
        display();
    }
    private static final int [][] oneArray = new int[5][4];

    static  void a() throws InterruptedException{
        oneArray[0][0] = 1;
        oneArray[0][1] = 1;
        oneArray[0][2] = 1;
        oneArray[0][3] = 1;

//        for (int [] i: oneArray){
//            for (int j : i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

    }
    static  void b() throws InterruptedException {
        oneArray[0][3] = 1;
        oneArray[1][3] = 1;
        oneArray[2][3] = 1;

    }

    static  void c() throws InterruptedException {
        oneArray[2][3] = 1;
        oneArray[3][3] = 1;
        oneArray[4][3] = 1;

    }

    static  void d() throws InterruptedException {
        oneArray[4][0] = 1;
        oneArray[4][1] = 1;
        oneArray[4][2] = 1;
        oneArray[4][3] = 1;


    }
    static  void e() throws InterruptedException {
        oneArray[2][0] = 1;
        oneArray[3][0] = 1;
        oneArray[4][0] = 1;

    }

    static  void f() throws InterruptedException {
        oneArray[0][0] = 1;
        oneArray[1][0] = 1;
        oneArray[2][0] = 1;


    }
    static  void g() throws InterruptedException {
        oneArray[2][0] = 1;
        oneArray[2][1] = 1;
        oneArray[2][2] = 1;
        oneArray[2][3] = 1;

    }
    static void display() throws InterruptedException {
        for (int[] i : oneArray) {
            for (int j : i) {
                if (j == 1) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
                Thread.sleep(300);
            }
            System.out.println();
        }

    }

    static void printValue(String value) throws IllegalAccessError, InterruptedException, InterruptedException, IllegalAccessException {
        if (value.length() > 9){
            value = value.substring(0,9);
        }
        char[] array = value.toCharArray();

        for (char i: array){
            if (!(i == '1' || i == '0')){
                throw new IllegalAccessException("Input must be 1 or 0");
            }
        }
        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) == '1' && value.charAt(7) == '1'){
                switch (i){
                    case 0 -> a();
                    case 1 -> b();
                    case 2 -> c();
                    case 3 -> d();
                    case 4 -> e();
                    case 5 -> f();
                    case 6 -> g();
                }
            }
        }

    }
}
