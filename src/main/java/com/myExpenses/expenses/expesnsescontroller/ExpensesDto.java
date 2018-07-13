package com.myExpenses.expenses.expesnsescontroller;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nad on 7/7/18.
 */
@Data
@NoArgsConstructor
public class ExpensesDto {

    private int amount;
    private String name;
    private String type;

}
