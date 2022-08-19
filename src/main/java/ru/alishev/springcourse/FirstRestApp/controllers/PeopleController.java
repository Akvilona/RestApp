/**
 * Создал Андрей Антонов 17.08.2022 17:49
 **/
package ru.alishev.springcourse.FirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.alishev.springcourse.FirstRestApp.models.Person;
import ru.alishev.springcourse.FirstRestApp.services.PeopleService;
import ru.alishev.springcourse.FirstRestApp.util.PersonErrorResponse;
import ru.alishev.springcourse.FirstRestApp.util.PersonNotFoundException;

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

    /** создаем текст сообщения об ошибке и возвращаем его в случае если идентификатор записи не найден */
    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handleException (PersonNotFoundException e) {
        PersonErrorResponse response = new PersonErrorResponse(
                "Person with this id wasn't found!",
                System.currentTimeMillis()
        );

        // В HTTP ответе будет тело ответа (response) и статус в заголовке
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); // NOT_FOUND - 404 статус
    }
}
