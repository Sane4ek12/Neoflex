package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Главный класс, из которого запускается Spring приложение
 *
 * @author Александр Толоконников
 */
@SpringBootApplication
public class CalculatorApplication {
    /**
     * Главный метод для запуска приложения
     *
     * @param args входные аргументы для приложения
     */
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

}
