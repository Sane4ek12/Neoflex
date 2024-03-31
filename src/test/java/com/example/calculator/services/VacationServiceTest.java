package com.example.calculator.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования подсчета отпускных
 *
 * @author Александр Толоконников
 */
class VacationServiceTest {
    /**
     * Поле экземпляра класса подсчета отпускных
     */
    private VacationService vacationService;

    /**
     * Метод, инициирующий поле сервиса перед каждым тестом
     */
    @BeforeEach
    void setUp() {
        vacationService = new VacationService();
    }

    /**
     * Метод, тестирующий подсчет в CalculateVacation
     */
    @Test
    void whenCalculatingVacation() {
        double expected = 38225.2559;
        double result = vacationService.calculateVacation(480000.0, 28);
        assertEquals(expected, result, 0.0001);
    }
}