class branch_bank{

    int networth = 50000;
    int no_of_account = 0;
    String customer_name;
    int customer_no;
    int account_balance;
    int loan_sanctioned = 0;
    int count;
    
    branch_bank(String cust_name,int cust_no,int acc_balance){

        this.customer_name = cust_name;
        this.customer_no = cust_no;
        this.account_balance = acc_balance;

        networth = networth + account_balance;
        no_of_account = no_of_account + 1;
    }
    
    void loan_sanctioned(int amount){
        
        if((amount < 2*(this.account_balance)) && this.loan_sanctioned < networth){

            System.out.println("Loan Granted Successfully");
            networth = networth - amount;
            this.loan_sanctioned += amount;
        }

        else{
            System.out.println("Loan doesn't granted");
        }
        
    }

    void repays(int repay_amount){

        networth = networth + repay_amount;
        this.loan_sanctioned = this.loan_sanctioned - repay_amount;
        int diff = repay_amount-this.loan_sanctioned;
        
        if(repay_amount>this.loan_sanctioned){

            
            this.account_balance = this.account_balance + diff;
            this.account_balance += diff;
            this.count+=1;

        }

        else if(repay_amount == this.loan_sanctioned){

            this.count+=1;
        }

        else{

            int amountleft = this.loan_sanctioned - repay_amount;
            this.count+=1;
            System.out.println("Amount left to pay is: " + amountleft);


        }

    }

    void view(){

        System.out.println("Bank Balance is : " + this.account_balance);
        System.out.println("No of instalments = " + this.count);

    }

    void inspection(){

        System.out.println("Networth is : " + networth);
        System.out.println("No of accounts = " + no_of_account);
        System.out.println("Total loan amount sanctioned : " + loan_sanctioned);
    }

}

class assign1{

    public static void main(String []args){

        branch_bank b1 = new branch_bank("patel",1,20000);
        branch_bank b2 = new branch_bank("abc",2,30000);

        b1.view();
        b1.inspection();
        b1.loan_sanctioned(30000);
        b1.repays(20000);
        b1.view();
        b1.inspection();

    }
}