package com.example.calculator.controllers;

import com.example.calculator.services.VacationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Класс контроллера, имеющий единственный API - /calculate
 *
 * @author Александр Толоконников
 */
@Controller
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
public class VacationController {
    /**
     * Поле класса, инициализируемое классом сервиса для расчета отпускных
     */
    private final VacationService vacationService;

    /**
     * Метод, реализующий API /calculate и вызывающий поле сервиса
     *
     * @param averageSalary средняя зарплата, приходящая как параметр GET запроса
     * @param countOfDays   количество дней отпуска, приходящее как параметр GET запроса
     * @param model         модель данных, заполняемая в контроллере и возвращаемая обратно в HTML
     * @return возвращает название представления с моделью данных
     */

    @GetMapping("/calculate")
    public String calculate(@RequestParam(name = "averageSalary") Double averageSalary,
                            @RequestParam(name = "countOfDays") Integer countOfDays,
                            Model model) {
        double vacation = vacationService.calculateVacation(averageSalary, countOfDays);
        model.addAttribute("vacationValue", vacation);
        return "index";
    }
}











