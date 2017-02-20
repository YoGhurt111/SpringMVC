package com.yoghurt.commons;


import com.google.gson.JsonObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

public  abstract class BaseDao {
    @Resource
    private SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    public abstract void deleteById(Long id);
    public abstract String read(Long id);
}
