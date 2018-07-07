package com.myExpenses.myExpenses;

import com.myExpenses.myExpenses.ExpenseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nad on 7/7/18.
 */
@Repository
public interface ExpenseRepo extends CrudRepository<ExpenseEntity,Long>{
}
