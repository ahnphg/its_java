public class bankAccount{
    private String accountNumber;
    private double balance;

    public bankAccount() {
    }


    public bankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Đã gửi: " + amount);
        } else {
            System.out.println("Số tiền phải lớn hơn 0.");
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Đã rút: " + amount);
        } else {
            System.out.println("Số tiền không hợp lệ.");
        }
    }

    public void check(){
        System.out.println("Số dư hiện tại: " + balance);
    }
}