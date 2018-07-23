package com.myExpenses.expenses.expesnsescontroller;

import com.myExpenses.expenses.ExpenseService;
import com.myExpenses.expenses.ExpensesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void addExpense(@RequestBody AddExpenseDto dto) {
        expenseService.addNewExpense(mapper.fromDto(dto));
    }

    @GetMapping("/expenses")
    @ResponseStatus(HttpStatus.OK)
    public ExpensesDto getAllExpenses()
    {
        List<ExpenseDto> allExpenses = mapper.toDto(expenseService.getAllExpenses());
        ExpensesDto expensesDto = new ExpensesDto();
        expensesDto.setExpenses(allExpenses);
        return expensesDto;
    }
}
