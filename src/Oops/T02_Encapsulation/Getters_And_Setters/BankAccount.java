package Oops.T02_Encapsulation.Getters_And_Setters;

public class BankAccount {

        private int accountNumber ;
        private String accountHolder ;
        private double balance ;


        public int setAccountNumber(int no) {
            if(no > 0) this.accountNumber = no;

            return accountNumber;
        }

        public String setAccountHolder(String name) {
            if(name != null) this.accountHolder = name;

            return accountHolder;
        }



    }


