package com.yoghurt.dao;


import com.yoghurt.entity.User;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class UserDao {
    @Resource
    private SessionFactory sessionFactory;


    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addUser(User user){
        this.getSession().save(user);
    }

    public void deleteUserById(Long id){
        this.getSession().delete("id", id);
    }


}
