package com.myExpenses.expenses;

import com.myExpenses.expenses.db.ExpenseEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

/**
 * Created by nad on 7/7/18.
 */
@Mapper(componentModel = "spring")
@Service
public interface ExpenseEntityMapper {

    ExpenseEntity fromDomain(Expense data);
    Expense toDomain(ExpenseEntity entity);
}
