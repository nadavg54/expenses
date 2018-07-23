package com.myExpenses.expenses;

import com.myExpenses.expenses.db.ExpenseEntity;
import com.myExpenses.expenses.db.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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

    public List<Expense> getAllExpenses()
    {
        Iterable<ExpenseEntity> all = expenseRepo.findAll();
        Iterator<ExpenseEntity> iterator = all.iterator();
        List<Expense> expensesList = new ArrayList<>();
        while (iterator.hasNext())
        {
            ExpenseEntity expenseEntity = iterator.next();
            expensesList.add(expenseEntityMapper.toDomain(expenseEntity));
        }
        return expensesList;

    }

}
