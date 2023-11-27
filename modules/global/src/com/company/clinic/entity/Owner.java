package com.company.clinic.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CLINIC_OWNER")
@Entity(name = "clinic_Owner")
@NamePattern("%s [%s]|name,phoneNumber")
public class Owner extends StandardEntity {
    private static final long serialVersionUID = 6104745886016046780L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}