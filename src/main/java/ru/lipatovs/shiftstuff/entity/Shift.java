package ru.lipatovs.shiftstuff.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shifts")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int number;
    public String type;
    public int personId;
    public Date data;

    public Shift (int id, int number, String type, int personId, Date data) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.personId = personId;
        this.data = data;
    }

    public Shift() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
