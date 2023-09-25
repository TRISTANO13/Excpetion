import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10");
            try {
                int num = input.nextInt();
                int factorial = factorial(num);
                
              
                System.out.println("the factoriel of " + num + " is " + factorial + "");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            
        }


        public static int factorial(int num)throws Exception {
            if (num < 1 || num > 10) {
                    
                throw new Except();
                }
                int factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }
                return factorial;
            }

        
    }