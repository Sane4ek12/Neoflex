package com.example.calculator.services;

import org.springframework.stereotype.Service;

/**
 * Класс сервиса для подсчета отпускных
 *
 * @author Александр Толоконников
 */
@Service
public class VacationService {
    /**
     * Метод для подсчета отпускных
     *
     * @param averageSalary средняя зарплата, поступающая из контроллера
     * @param countOfDays   количество дней отпуска
     * @return возвращает сумму отпускных за расчетный период
     */
    public double calculateVacation(Double averageSalary, Integer countOfDays) {
        final double averageDaysInMonth = 29.3;
        double averageDaySalary = averageSalary / (averageDaysInMonth * 12);
        return averageDaySalary * countOfDays;
    }
}
