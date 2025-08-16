class BankAccount{
     constructor(accountNumber, balance = 0) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    if (amount > 0) {
      this.balance += amount;
      console.log(`Deposited ₹${amount}. New balance: ₹${this.balance}`);
    } else {
      console.log("Deposit amount must be positive.");
    }
  }

  withdraw(amount) {
    if (amount <= 0) {
      console.log("Withdrawal amount must be positive.");
    } else if (amount > this.balance) {
      console.log("Insufficient balance.");
    } else {
      this.balance -= amount;
      console.log(`Withdraw ₹${amount}. Remaining balance: ₹${this.balance}`);
    }
  }
}
const myAccount = new BankAccount("1234567890", 5000);
myAccount.deposit(1500);     
myAccount.withdraw(2000);  
myAccount.withdraw(5000);  

  