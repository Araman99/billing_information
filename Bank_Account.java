package billing_information;
/**
 *
 * @author araman
 */
class Bank_Account {
    private String Name,Ac_No;
    private double Amount;
    
    Bank_Account(){
        Name = "Amanur Rahman";
        Ac_No = "192002117";
        Amount = 454154;
    }
    Bank_Account(String Name, String Ac_No , double Amount){
        this.Name = Name;
        this.Ac_No = Ac_No;
        this.Amount = Amount;
    }
    Bank_Account(Bank_Account ob){
        Name = ob.Name;
        Ac_No = ob.Ac_No;
        Amount = ob.Amount;
    }
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Account No: "+Ac_No);
        System.out.println("Amount: "+Amount);
    }
}
