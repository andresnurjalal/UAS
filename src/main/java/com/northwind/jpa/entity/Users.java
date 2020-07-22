/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

/**
 *
 * @author Andres Nur Jalal
 */
@Entity
@Table (name = "users")
 
public class Users implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userID;
    
    @Column(name = "name")
    @Max(40)
    private String name;
    
    @Column(name = "title")
    @Max(30)
    private String title;
    
    @Column(name = "birthdate")
    private Date birthDate;
    
    @Column(name = "hiredata")
    private Date hireData;
    
    @Column(name = "position")
    @Max(30)
    private String position;
    
    @Column(name = "email")
    @Max(30)
    private String email; 
    
    @Column(name = "password")
    @Max(60)
    private String password;

    public Users() {
    }

    public Users(Integer userID, String name, String title, Date birthDate, Date hireData, String position, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.title = title;
        this.birthDate = birthDate;
        this.hireData = hireData;
        this.position = position;
        this.email = email;
        this.password = password;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireData() {
        return hireData;
    }

    public void setHireData(Date hireData) {
        this.hireData = hireData;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
