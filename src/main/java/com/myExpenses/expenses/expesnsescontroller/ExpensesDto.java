package com.myExpenses.expenses.expesnsescontroller;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by nad on 7/18/18.
 */
@Data
@NoArgsConstructor
public class ExpensesDto {
    private  List<ExpenseDto> expenses;
}
