package com.example.springdbconfig.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    public long Id;
    public String Name;
    public String college;
}
