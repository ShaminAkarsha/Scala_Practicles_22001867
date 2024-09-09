// Basic functions: Deposit, Withdraw, Transfer
class Account(no: String, bal: Double) {
  def accNo = no
  def balance = bal
  override def toString(): String = "[" + accNo + ", " + balance + "]"
  def withdraw(amount: Double) = balance - amount
  def deposit(amount: Double) = balance + amount
  def transfer(toAccount: Account, amount: Double): Unit = {
    if (amount > balance) {
      println("Insufficient balance for transfer!")
    } else {
      this.withdraw(amount)
      toAccount.deposit(amount)
    }
  }
}

class Bank(var accs: List[Account]) {
  def this() = this(List())
  def accounts = accs
  def addAnAccount(accNo: String, bal: Double) =
    accounts :+ new Account(accNo, bal)
  // 4.1 List of accounts with negative balances (assuming overdraft possibility)
  def negativeBalanceAccounts: List[Account] = accounts.filter(_.balance < 0)

  // 4.2 Calculate the sum of all account balances
  def totalBalance: Double = accounts.map(_.balance).sum

  // 4.3 Apply interest and calculate final balances
  def applyInterest(): Unit = {
    accounts.foreach { acc =>
      if (acc.balance > 0) {
        acc.deposit(acc.balance * 0.05) // Positive balance interest
      } else {
        acc.deposit(acc.balance * 0.1) // Negative balance interest (overdraft)
      }
    }
  }

  override def toString(): String = accounts.mkString("\n")

}

object labsheet10_q2 {
  def main(args: Array[String]) = {
    // Create accounts
    val acc1 = new Account("001", 500)
    val acc2 = new Account("002", 300)
    val acc3 = new Account("003", -100)

    // Create a bank with a list of accounts
    val bank = new Bank(List(acc1, acc2, acc3))

    // 4.1 List of accounts with negative balances
    println("\nAccounts with negative balances:")
    bank.negativeBalanceAccounts.foreach(println)

    // 4.2 Total balance of all accounts
    println("\nTotal balance of all accounts: " + bank.totalBalance)

    // 4.3 Apply interest and show final balances
    bank.applyInterest()
    println("\nAfter applying interest:")
    println(bank)
  }
}
