package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Thực hiện phép cộng: {} + {}", a, b);
        int result = a + b;
        logger.debug("Kết quả là: {}", result);
        return result;
    }
}