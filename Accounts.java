public class Accounts {
  // Instance variables
    	    private int ac_no;
	        private String name; 
                    private String ac_name;
                    private double balance;
	
	// Constructors
                    public Accounts( ) {
      	            ac_no = 0;
                    name = "";
                    ac_name = "";
                    balance = 0.0;
                }

                    public Accounts(int ac_no, String name, String ac_name) {
                    this.ac_no = ac_no;
                    this.name = name;
                    this.ac_name = ac_name;
                    balance = 0.0;
               }

	 // @1st Method => withdrwal( )
	    public void withdrawal(double amount) {
    	      if (amount > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                      balance =balance - amount;
                      System.out.println("Withdrawal successful");
                      System.out.println("Updated balance: " + balance);
                    }
       }

    // @2nd Method  => deposit( )
      public void deposit(double amount) {
                     balance = balance + amount;
                     System.out.println("Deposit successful");
                     System.out.println("Updated Balance: " + balance);
       }

	  //@ 3rd Method => display( )
	   public void display( ) {
                    System.out.println("Account number: " + ac_no);
                    System.out.println("Customer name: " + name);
                    System.out.println("Account name: " + ac_name);
                    System.out.println("Balance: " + balance);
       }


public static void main(String[ ] args) {
    // Create an instance of the Accounts class
    Accounts account0 = new Accounts(0001, "Sushant Joshi", "Savings");
    Accounts account1 = new Accounts(0002, "Aditi  Dogra", "Current");
    // Deposit money into the account
    account0.deposit(800.0);
    account1.deposit(1600.0);
    // Withdraw money from the account
    account0.withdrawal(100.0);
    account1.withdrawal(400.0);
    // Display the account details
    account0.display();
    account1.display();
  }
}