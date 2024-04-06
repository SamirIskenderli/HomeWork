import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        for (int i=1;i < 100;i++){
            System.out.println("Choose an operation:\n1:Add\n2:Subtract\n3:Multiplay\n4:Divide");
            Scanner sc = new Scanner(System.in);
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
            }
        }

    }
    public static void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Result:" + result);
        System.out.println("Continue?\n1:YES\n2:NO");
        int yesOrNo = scan.nextInt();
        switch (yesOrNo){
            case 1:
                return;
            case 2:
        }

    }public static void subtract(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();
        int result = firstNumber - secondNumber;
        System.out.println("Result:" + result);
        System.out.println("Continue?\n1:YES\n2:NO");
        int yesOrNo = scan.nextInt();
        switch (yesOrNo) {
            case 1:
                return;
            case 2:
                System.out.println("Goodbye");
        }

    }
    public static void multiply(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();
        int result = firstNumber * secondNumber;
        System.out.println("Result:" + result);
        System.out.println("Continue?\n1:YES\n2:NO");
        int yesOrNo = scan.nextInt();
        switch (yesOrNo) {
            case 1:
                return;
            case 2:
                System.out.println("Goodbye");
        }
    }
    public static void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();
        int result = firstNumber / secondNumber;
        System.out.println("Result:" + result);
        System.out.println("Continue?\n1:YES\n2:NO");
        int yesOrNo = scan.nextInt();
        switch (yesOrNo) {
            case 1:
                return;
            case 2:
                System.out.println("Goodbye");
        }
    }
}
