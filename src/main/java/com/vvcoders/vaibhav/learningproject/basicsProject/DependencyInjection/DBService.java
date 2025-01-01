package com.vvcoders.vaibhav.learningproject.basicsProject.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBService {

    //Field DI
    //@Autowired
    //DbData dbData;

    //Constructor DI
    //final DbData dbData;

    //@Autowired
    //DBService(DbData dbData){
    //    this.dbData = dbData;
    //}

    //Setter Injection
    DbData dbData;
    @Autowired
    public void setDbData(DbData dbData){
        this.dbData = dbData;
    }

    public String getData(){
        return  dbData.gettData();
    }

}
