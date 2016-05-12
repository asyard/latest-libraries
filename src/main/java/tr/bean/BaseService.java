package tr.bean;

import tr.model.Person;

import java.util.List;

/**
 * Created by asy
 */
public interface BaseService {

    Person getPerson(long id);

    void savePerson(Person person);

    void deletePerson(long id);

    List<Person> listPerson();

}
