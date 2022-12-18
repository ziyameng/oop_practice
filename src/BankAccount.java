public class BankAccount {

    //create fields
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNo;

    //create constructor
    public BankAccount(){
        System.out.println("empty constructor called");
    }


    public BankAccount(String customerName, String email, String phoneNo) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // getter
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    //setter

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //function methods
    public void depositing(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of $" +depositAmount +"made. New balance is $" + accountBalance);

    }

    public void withdrawing(double withdrawAmount){
        if(accountBalance - withdrawAmount<0){
            System.out.println("Insufficient Funds! You only have $" +accountBalance+"in your account");
        } else{
            accountBalance-=withdrawAmount;
            System.out.println("withdrawal of $" + withdrawAmount + " processed, Remaining balance = $" + accountBalance);
        }

    }
}
