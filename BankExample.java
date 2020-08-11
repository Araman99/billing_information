package billing_information;

/**
 *
 * @author araman
 */
public class BankExample {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws java.lang.Exception 
    {
	  Bank_Account Nahid = new Bank_Account("Atikur Rahman","192002118",40000);
	  Bank_Account Hasan = new Bank_Account(Nahid);
          Bank_Account Aman = new Bank_Account();
	  
	  Nahid.display();
          Hasan.display();
          Aman.display();
          
          
    }
    
}
