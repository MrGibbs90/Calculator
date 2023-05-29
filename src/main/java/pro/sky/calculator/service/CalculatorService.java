package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {

    String hello();

    int plus(int x, int y);
    int minus(int x, int y);

    int multiply(int x, int y);

    double divide(int x, int y);

}
