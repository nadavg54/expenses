package com.myExpenses.expenses;

import com.myExpenses.expenses.db.ExpenseEntity;
import com.myExpenses.expenses.db.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by nad on 7/7/18.
 */
@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepo expenseRepo;

    @Autowired
    private ExpenseEntityMapper expenseEntityMapper;

    public void addNewExpense(Expense data)
    {
        ExpenseEntity expenseEntity = expenseEntityMapper.fromDomain(data);
        expenseEntity.setTime(new Date(System.currentTimeMillis()));
        expenseRepo.save(expenseEntity);
    }

}
