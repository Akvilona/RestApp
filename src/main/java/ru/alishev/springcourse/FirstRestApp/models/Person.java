/**
 * Создал Андрей Антонов 08.08.2022 17:12
 **/
package ru.alishev.springcourse.FirstRestApp.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name shout  not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater then 0")
    private int age;

    @Column(name = "email")
    @Email
    @NotEmpty (message = "Email shout not be empty")
    private String email;

    /** пустой конструктор, который нужен для Spring */
    public Person() {
    }

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_who")
    @NotEmpty
    private String createdWho;



    /** Конструктор по значимым полям */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** геттеры и сеттеры */
    public int getId() {
        return id;
    }

    /** геттеры и сеттеры */
    public void setId(int id) {
        this.id = id;
    }

    /** геттеры и сеттеры */
    public String getname() {
        return name;
    }

    /** геттеры и сеттеры */
    public void setname(String name) {
        this.name = name;
    }

    /** геттеры и сеттеры */
    public int getAge() {
        return age;
    }

    /** геттеры и сеттеры */
    public void setAge(int age) {
        this.age = age;
    }

    /** геттеры и сеттеры */
    public String getemail() {
        return email;
    }

    /** геттеры и сеттеры */
    public void setemail(String email) {
        this.email = email;
    }

    /** геттеры и сеттеры */
    public String getName() {
        return name;
    }

    /** геттеры и сеттеры */
    public void setName(String name) {
        this.name = name;
    }

    /** геттеры и сеттеры */
    public String getEmail() {
        return email;
    }

    /** геттеры и сеттеры */
    public void setEmail(String email) {
        this.email = email;
    }

    /** геттеры и сеттеры */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /** геттеры и сеттеры */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /** геттеры и сеттеры */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /** геттеры и сеттеры */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** геттеры и сеттеры */
    public String getCreatedWho() {
        return createdWho;
    }

    /** геттеры и сеттеры */
    public void setCreatedWho(String createdWho) {
        this.createdWho = createdWho;
    }

    /** для отображения в консоли */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age ='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
