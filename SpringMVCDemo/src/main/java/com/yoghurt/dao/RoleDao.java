package com.yoghurt.dao;

import com.yoghurt.entity.Role;
import com.yoghurt.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RoleDao {
    @Resource private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addRole(Role role){
        this.getSession().save(role);
    }

}
