package ru.ivan.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String midName;
    private final String lastName;
    private final String nickName;
    private final String phone;
    private final String email;

    public ContactData(String name, String midName, String lastName, String nickName, String phone, String email) {
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.phone = phone;
        this.email = email;
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
}
