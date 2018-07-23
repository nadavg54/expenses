package com.myExpenses.expenses;

import com.myExpenses.expenses.expesnsescontroller.AddExpenseDto;
import com.myExpenses.expenses.expesnsescontroller.ExpenseDto;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by nad on 7/7/18.
 */
@Mapper(componentModel = "spring")
public interface ExpensesMapper {

    Expense fromDto(AddExpenseDto dto);
    AddExpenseDto toDto(Expense data);
    List<ExpenseDto> toDto(List<Expense> expenses);
}
