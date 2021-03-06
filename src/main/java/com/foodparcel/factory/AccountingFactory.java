package com.foodparcel.factory;

import com.foodparcel.entity.Accounting;

/**
 * Author: Amy Johnston (218188773)
 * AccountingFactory.java
 * Submission 6
 * Date: 6 July 2020
 */

public class AccountingFactory {
    public static Accounting createAccounting(double income, double expense, double budget, int incomeTransactionId, int expenseTransactionId) {
        Accounting accounting = new Accounting.Builder()
                .setIncome(income)
                .setExpense(expense)
                .setBudget(budget)
                .setIncomeTransactionId(incomeTransactionId)
                .setExpenseTransactionId(expenseTransactionId)
                .build();
        return accounting;
    }
}
