package tr.model;

import javax.persistence.*;

/**
 * Created by asy
 */

@Entity
@Table(name = "person_data")
public class Person {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "PERSON_ID")
    private long personId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BIRTH_YEAR")
    private int birthYear;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
