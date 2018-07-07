package com.myExpenses.myExpenses;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nad on 7/7/18.
 */
@Entity
@Data
public class ExpenseEntity {

    @Id
    private long time;

    private String name;

    private int amount;

}
