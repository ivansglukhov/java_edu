package ru.ivan.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private final String name;
    private final String midName;
    private final String lastName;
    private final String nickName;
    private final String phone;
    private final String email;
    private String group;

    public ContactData(int id, String name, String midName, String lastName, String nickName, String phone, String email, String group) {
        this.id = id;
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.phone = phone;
        this.email = email;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public ContactData(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.midName = null;
        this.lastName = lastName;
        this.nickName = null;
        this.phone = null;
        this.email = null;
        this.group = null;
    }


    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

}
