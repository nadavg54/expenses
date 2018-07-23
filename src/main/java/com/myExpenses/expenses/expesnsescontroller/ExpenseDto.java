package com.myExpenses.expenses.expesnsescontroller;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by nad on 7/22/18.
 */
@Data
@NoArgsConstructor
public class ExpenseDto {

    private int amount;
    private String name;
    private String type;
    private Date time;
}
