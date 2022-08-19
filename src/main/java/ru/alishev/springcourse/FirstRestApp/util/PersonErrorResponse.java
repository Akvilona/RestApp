/**
 * Создал Андрей Антонов 19.08.2022 11:40
 **/
package ru.alishev.springcourse.FirstRestApp.util;

public class PersonErrorResponse {
    private String message;
    private long timestamp;

    public PersonErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
