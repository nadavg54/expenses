package com.myExpenses.expenses.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by nad on 7/7/18.
 */
@Entity
@Data
@NoArgsConstructor
public class ExpenseEntity {


    @Id
    private String name;

    private int amount;

    private String type;

    private Date time;

}
