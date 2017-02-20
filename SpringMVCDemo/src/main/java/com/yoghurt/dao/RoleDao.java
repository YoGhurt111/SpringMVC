package com.yoghurt.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yoghurt.commons.BaseDao;
import com.yoghurt.entity.Role;
import com.yoghurt.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RoleDao extends BaseDao{
    @Resource private SessionFactory sessionFactory;


    public void addRole(Role role){
        this.getSession().save(role);
    }

    @Override
    public void deleteById(Long id) {
        Role role = this.getSession().get(Role.class,id);
        this.getSession().delete(role);
    }

    @Override
    public String read(Long id) {
        return null;
    }
}
