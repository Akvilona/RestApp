/**
 * Создал Андрей Антонов 17.08.2022 17:49
 **/
package ru.alishev.springcourse.FirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alishev.springcourse.FirstRestApp.models.Person;
import ru.alishev.springcourse.FirstRestApp.services.PeopleService;

import java.util.List;

/** возвращает список из объектов класса Person */
@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> getPeople () {
        return peopleService.findAll(); // Jackson конвертирует эти объекты в JSON
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id); // Jackson конвертирует этот объект в JSON
    }
}