package com.example.WebTest;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component

public class Data {
    int ID;
    String name;
    String password;
    Date date;
    String gender;

    public int getID()
    {
        return ID;
    }
    public void setID(int id)
    {
        this.ID=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    // Data( int ID,String name,String password,String gender)
    // {

    // }

}
