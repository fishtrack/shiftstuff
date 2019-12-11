package ru.lipatovs.shiftstuff.entity;


import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String login;
    public String password;
    public String role;
    public String name;
    public String surname;
    public int id_card;

    public Person(int id, String login, String password, String role, String name, String surname, int id_card) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.id_card = id_card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public Person() {
    }
}
