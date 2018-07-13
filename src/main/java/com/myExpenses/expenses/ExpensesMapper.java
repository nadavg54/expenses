package com.myExpenses.expenses;

import com.myExpenses.expenses.expesnsescontroller.ExpensesDto;
import org.mapstruct.Mapper;

/**
 * Created by nad on 7/7/18.
 */
@Mapper(componentModel = "spring")
public interface ExpensesMapper {

    Expense fromDto(ExpensesDto dto);
    ExpensesDto toDto(Expense data);
}
