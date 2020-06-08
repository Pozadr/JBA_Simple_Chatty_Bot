import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNo = Long.parseLong(scanner.next());
        String operation = scanner.next();
        long secondNo = Long.parseLong(scanner.next());
        long result;
        //System.out.println(firstNo + " " + operation + " " + secondNo);
        switch (operation) {
            case "+": {
                result = firstNo + secondNo;
                System.out.println(result);
                break;
            }
            case "-": {
                result = firstNo - secondNo;
                System.out.println(result);
                break;
            }
            case "*": {
                result = firstNo * secondNo;
                System.out.println(result);
                break;
            }
            case "/": {
                if (secondNo == 0) {
                    System.out.println("Division by 0!");

                } else {
                    result = firstNo / secondNo;
                    System.out.println(result);
                }
                break;
            }
            default: {
                System.out.println("Unknown operator");
            }
        }
    }
}