package com.myExpenses.expenses.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nad on 7/7/18.
 */
@Repository
public interface ExpenseRepo extends CrudRepository<ExpenseEntity,Long>{
}
