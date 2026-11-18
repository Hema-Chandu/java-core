package exceptionhandling;

class exp1 {

    static void withdraw(int balance, int amount) throws Exception {

        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance!");
            }

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + (balance - amount));
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Thank you for using ATM");
        }
    }

    public static void main(String[] args) throws Exception {

        withdraw(3000, 7000);
    }
}
