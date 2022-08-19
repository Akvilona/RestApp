/**
 * Создал Андрей Антонов 08.08.2022 17:12
 **/
package ru.alishev.springcourse.FirstRestApp.models;

import javax.persistence.*;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    /** пустой конструктор, который нужен для Spring */
    public Person() {
    }

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
