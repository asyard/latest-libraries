DROP TABLE  person_data;
DROP SEQUENCE     HIBERNATE_SEQUENCE;

CREATE TABLE person_data (
  PERSON_ID INTEGER PRIMARY KEY,
  NAME VARCHAR(30),
  BIRTH_YEAR  INTEGER
);



create SEQUENCE HIBERNATE_SEQUENCE;