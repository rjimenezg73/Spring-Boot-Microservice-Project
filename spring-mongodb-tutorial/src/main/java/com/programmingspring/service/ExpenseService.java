package com.programmingspring.service;

import com.programmingspring.model.Expense;
import com.programmingspring.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
   private final ExpenseRepository expenseRepository;

   public ExpenseService(ExpenseRepository expenseRepository) {
      this.expenseRepository = expenseRepository;
   }

   public void addExpense(Expense expense){
      expenseRepository.insert(expense);
   }

   public void updateExpense(Expense expense){
      Expense saveExpense = expenseRepository.findById(expense.getId())
              .orElseThrow(() -> new RuntimeException(
                      String.format("Cannot find by ID %s", expense.getId())
              ));
      saveExpense.setExpenseName(expense.getExpenseName());
      saveExpense.setExpenseCategory(expense.getExpenseCategory());
      saveExpense.setExpenseAmount(expense.getExpenseAmount());

      expenseRepository.save(expense);
   }

   public List<Expense> getAllExpenses(){
      return expenseRepository.findAll();
   }

   public void getExpenseByName(){}

   public void deleteExpense(){}
}
