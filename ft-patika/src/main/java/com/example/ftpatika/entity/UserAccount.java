package com.example.ftpatika.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String number;

    public UserAccount() {

    }


    public UserAccount(String firstName, String lastName, String email, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, firstName='%s', lastName='%s', email='%s', number='%s']",
                id, firstName, lastName, email, number);
    }

}
