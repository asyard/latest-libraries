package tr.bean;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tr.model.BaseDAO;
import tr.model.Person;

import java.util.List;

/**
 * Created by asy
 */

@Repository
public class HBaseDAO implements BaseDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    public Person getPerson(long id) {
        Person person = (Person) getSession().get(Person.class, id, LockOptions.NONE);
        return person;
    }

    public void savePerson(Person person) {
        getSession().saveOrUpdate(person);
    }

    public void deletePerson(Person p) {
          getSession().delete(p);
    }

    public List<Person> listPerson() {
        Query query = getSession().createQuery("select p from Person p");
        return query.list();
    }
}
