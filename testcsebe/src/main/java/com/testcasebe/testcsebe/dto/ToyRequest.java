package com.testcasebe.testcsebe.dto;

import java.util.List;

public class ToyRequest {
  private List<Integer> prices;
  private int budget;

  // Getters and Setters
  public List<Integer> getPrices() {
    return prices;
  }

  public void setPrices(List<Integer> prices) {
    this.prices = prices;
  }

  public int getBudget() {
    return budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }
}
