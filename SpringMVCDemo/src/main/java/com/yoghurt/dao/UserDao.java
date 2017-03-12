package com.yoghurt.dao;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.yoghurt.commons.BaseDao;
import com.yoghurt.entity.User;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class UserDao extends BaseDao{

    public void addUser(User user) {
        this.getSession().save(user);
    }

    @Override
    public void deleteById(Long id) {
        User user = this.getSession().get(User.class,id);
        this.getSession().delete(user);
    }

    @Override
    public String read(Long id) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        User user = this.getSession().get(User.class, id);
        return gson.toJson(user);
    }

    public boolean selectUser(User user){
        List<User> users = this.getSession().createQuery("from User where name=? and pwd=?")
                .setParameter(0,user.getName())
                .setParameter(1, user.getPwd()).list();
        if (!users.isEmpty()){
            return true;
        }
        return false;
    }
}
