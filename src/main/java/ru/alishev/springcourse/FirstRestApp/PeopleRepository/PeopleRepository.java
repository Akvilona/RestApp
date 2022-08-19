/**
 * Создал Андрей Антонов 08.08.2022 18:03
 **/
package ru.alishev.springcourse.FirstRestApp.PeopleRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.springcourse.FirstRestApp.models.Person;
import java.util.Optional;

/** работает с базой данных */
@Repository
public interface  PeopleRepository extends JpaRepository<Person, Integer> {
//    Optional<Person> findByUsername(String username);
}