public class BankAccount{
  private String name;
  private int accountnum;
  private double balence;
  private String pin;
  private boolean loggedin;

  public BankAccount (String name, int accountnum, double balence, String pin){
    this.name=name;
    this.accountnum=accountnum;
    this.balence=balence;
    this.pin=pin;
    this.loggedin=false;
  }
  public double getBalence(){
    if (loggedin == true)
      return balence;
    else
      throw new IllegalStateException("Login Error");
  }
  public void login(String pin){
    if (pin == this.pin)
      loggedin = true;
    else
      throw new IllegalStateException("Login Error");
}


  public void deposite(double amount){
    if (loggedin == true)
      balence += amount;
    else
      throw new IllegalStateException("Login Error");
  }
  public void withdraw(double amount){
    if (loggedin == true)
      balence -= amount;
    else
      throw new IllegalStateException("Login Error");
  }
public String toString(){
  return ("Account number: " + accountnum + ", balence: $" + balence);
}

  public static void main(String[] args){
    BankAccount account1 = new BankAccount("Checking", 111, 1000.00, "8888");
    account1.login("8888");
    System.out.println(account1.getBalence());

    account1.deposite(500.00);
    System.out.println(account1);
    account1.withdraw(500.00);
    System.out.println(account1);
    System.out.println("YERT");
  }

}