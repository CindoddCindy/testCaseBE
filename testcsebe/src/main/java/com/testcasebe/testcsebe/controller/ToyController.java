package com.testcasebe.testcsebe.controller;
import com.testcasebe.testcsebe.dto.ToyRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/toys")
public class ToyController {
  @PostMapping("/maximum")
  public int getMaximumToys(@RequestBody ToyRequest request) {
    List<Integer> prices = request.getPrices();
    int k = request.getBudget();

    // Sort prices ascending
    Collections.sort(prices);

    int count = 0;
    int total = 0;

    for (int price : prices) {
      if (total + price <= k) {
        total += price;
        count++;
      } else {
        break;
      }
    }

    return count;
  }
}
