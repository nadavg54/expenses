package com.myExpenses.expenses.expesnsescontroller;

import com.myExpenses.expenses.ExpenseService;
import com.myExpenses.expenses.ExpensesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 7/7/18.
 */

@RestController
public class ExpnesesController  {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private ExpensesMapper mapper;


    @PostMapping("/expenses")
    @ResponseStatus(HttpStatus.CREATED)
    public void addExpense(@RequestBody ExpensesDto dto) {
        expenseService.addNewExpense(mapper.fromDto(dto));
    }
}
