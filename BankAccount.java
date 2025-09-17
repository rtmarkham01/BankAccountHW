public class BankAccount{
  private String name;
  private int accountnum;
  private double balence;
  private String pin;
  private boolean loggedin;

  public BankAccount (String name, int accountnum, double balence, String pin, boolean loggedin){
    this.name=name;
    this.accountnum=accountnum
    this.balence=balence
    this.pin=pin
    this.loggedin=false;
  }
  public double getBalence(){
    if (loggedin == true)
      return balence;
    else
      throw new IllegalStateExeption("Login Error")
  }
  public static void main(String[] args){
    BankAccountUser111 account1 = new bankAccount("Checking", 111, 1000.00, "8888");
    System.out.println()
    
  }
}
