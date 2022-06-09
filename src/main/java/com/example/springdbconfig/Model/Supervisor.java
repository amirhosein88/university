package com.example.springdbconfig.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supervisor {

    @Id
    public long Id;
    public String Name;


}
