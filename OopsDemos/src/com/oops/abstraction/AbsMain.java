package com.oops.abstraction;

public class AbsMain {

    public static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.eduLoan();

        Branch1 branch1 = (Branch1)bank;
        branch1.staffDetails();
        branch1.carLoan();
        branch1.eduLoan();
        bank = new SubBranch();
        bank.eduLoan();
        bank.carLoan();
        SubBranch subbranch = (SubBranch)bank;
        subbranch.subPay();
    }
}
