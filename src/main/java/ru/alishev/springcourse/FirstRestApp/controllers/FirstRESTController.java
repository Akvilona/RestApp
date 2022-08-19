/**
 * Создал Андрей Антонов 17.08.2022 17:15
 **/
package ru.alishev.springcourse.FirstRestApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Это тоже самое как @Controller + @ResponseBody на каждом методе
@RequestMapping("/api")
public class FirstRESTController {


    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
    }
}
