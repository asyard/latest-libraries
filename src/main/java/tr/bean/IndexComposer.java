package tr.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import tr.model.Person;
import tr.util.SpringUtil;

import java.util.List;

/**
 * Created by asy
 */

@org.springframework.stereotype.Component
@Scope("prototype")
public class IndexComposer extends SelectorComposer {

    private static final Logger logger = LoggerFactory.getLogger(IndexComposer.class);

    @Wire("#nameTextbox")
    private Textbox nameTextbox;

    @Wire("#birthYearTextbox")
    private Textbox birthYearTextbox;

    @Autowired
    private BaseService baseService;         //TODO

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    @Listen("onClick =#addPersonButton")
    public void savePerson(Event event) {
        logger.debug("kaydedecek");
        baseService = SpringUtil.context.getBean(BaseService.class);

        Person person = new Person();
        person.setName(nameTextbox.getText());
        person.setBirthYear(Integer.parseInt(birthYearTextbox.getText()));
        baseService.savePerson(person);

        Messagebox.Button[] btn = {Messagebox.Button.OK};
        Messagebox.show("OK " + person.getPersonId(), "ok", btn, null, Messagebox.INFORMATION, null, null, null);

        List<Person> persons = baseService.listPerson();
        logger.debug("Person list size : " + persons.size());
    }


}
