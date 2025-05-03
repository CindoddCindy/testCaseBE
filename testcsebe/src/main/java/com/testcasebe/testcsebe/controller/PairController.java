package com.testcasebe.testcsebe.controller;
import com.testcasebe.testcsebe.dto.PairRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/pairs")
public class PairController {
  @PostMapping("/count")
  public int countPairs(@RequestBody PairRequest request) {
    int k = request.getK();
    List<Integer> arr = request.getArr();

    Set<Integer> numSet = new HashSet<>(arr);
    int count = 0;

    for (int num : arr) {
      if (numSet.contains(num + k)) {
        count++;
      }
    }

    return count;
  }
}
