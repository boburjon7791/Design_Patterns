package org.example.adapter_design_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter account holder name ");
            String customerName = br.readLine();

            System.out.print("\nEnter account number ");
            long accountNumber = Long.parseLong(br.readLine());

            System.out.print("\nEnter bank name ");
            String bankName = br.readLine();

            setBankHolderName(customerName);
            setAccountNumber(accountNumber);
            setBankName(bankName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accountNumber = getAccountNumber();
        String accountHolderName = getBankHolderName();
        String bankName = getBankName();
        return ("The account number "+accountNumber+" of "+accountHolderName+" in "+bankName+
                "bank is valid and authenticated for issuing the credit card.");
    }
}
