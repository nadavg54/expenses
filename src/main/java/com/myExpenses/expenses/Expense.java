package com.myExpenses.expenses;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by nad on 7/7/18.
 */
@Data
@NoArgsConstructor
public class Expense {

    private String name;
    private int amount;
    private String type;
    private Date time;
    private String user;
}
