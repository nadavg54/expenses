package com.myExpenses.expenses;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nad on 7/7/18.
 */
@Data
@NoArgsConstructor
public class Expense {

    private String name;
    private int amount;
    private String type;
}
