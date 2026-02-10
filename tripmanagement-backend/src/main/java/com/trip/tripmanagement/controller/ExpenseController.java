package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.Expense;
import com.trip.tripmanagement.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // CREATE expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        expense.setLastUpdated(LocalDateTime.now());
        return expenseRepository.save(expense);
    }

    // READ all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
