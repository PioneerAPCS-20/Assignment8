/**
 * This class runs the program for managing a checking account.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        // create CheckingAccount object with starting deposit of
        // $1000, 1.2% interest rate, and an account owner.
        CheckingAccount acct1 = new CheckingAccount(1000.0, 0.012, "Mr. King");        
        
        // create CheckingAccount object with an account owner (no initial deposit).
        
        
        // print account info for both accounts
        acct1.printInfo();
        acct2.printInfo();

        
        // make one month pass for both accounts
        acct1.runMonth();

        
        // print account info for both accounts

        
        // make three months pass for both accounts
        
        
        // deposit $300 into both accounts
        
        
        // make eight months pass for both accounts
        
        
        // print account info for both accounts
        
        
        // withdraw $75 from both accounts
        
        
        // print account info for both accounts
    }
}
