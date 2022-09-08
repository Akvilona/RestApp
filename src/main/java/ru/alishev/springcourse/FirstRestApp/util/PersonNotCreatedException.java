/**
 * Создал Андрей Антонов 07.09.2022 14:53
 **/
package ru.alishev.springcourse.FirstRestApp.util;

public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
