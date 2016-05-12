package tr.model;

import java.util.List;

/**
 * Created by asy
 */
public interface BaseDAO {

    Person getPerson(long id);

    void savePerson(Person person);

    void deletePerson(Person p);

    List<Person> listPerson();
}
