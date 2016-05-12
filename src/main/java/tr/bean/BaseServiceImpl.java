package tr.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.model.BaseDAO;
import tr.model.Person;

import java.util.List;

/**
 * Created by asy
 */
@Service
public class BaseServiceImpl implements BaseService {

    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    private BaseDAO baseDAO;

    @Transactional
    public Person getPerson(long id) {
        logger.debug("Reading personnel : " + id);
        return baseDAO.getPerson(id);
    }

    @Transactional
    public void savePerson(Person person) {
        logger.debug("Saving personnel");
        baseDAO.savePerson(person);
        logger.debug("Person save completed");
    }

    @Transactional
    public void deletePerson(long id) {
        logger.debug("Reading personnel to be deleted : " + id);
        Person person = baseDAO.getPerson(id);
        logger.debug("Person is going to be deleted");
        baseDAO.deletePerson(person);
        logger.debug("Person delete completed");
    }

    @Transactional
    public List<Person> listPerson() {
        logger.debug("Listing all person");
        List<Person> persons = baseDAO.listPerson();
        logger.debug("Person list : " + persons);
        return persons;
    }
}
