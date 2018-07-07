package com.myExpenses.myExpenses.expesnsescontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 7/7/18.
 */
@RestController
public interface IExpensesController {

    @ResponseStatus
    @PostMapping(path = "/expenses")

    void addExpense();
}
