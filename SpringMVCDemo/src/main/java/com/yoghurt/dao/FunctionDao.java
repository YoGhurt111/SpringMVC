package com.yoghurt.dao;

import com.yoghurt.commons.BaseDao;
import com.yoghurt.entity.Function;
import com.yoghurt.entity.Role;
import com.yoghurt.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class FunctionDao extends BaseDao{
    @Resource
    private SessionFactory sessionFactory;


    public void addFunction(Function function){
        this.getSession().save(function);
    }

    @Override
    public void deleteById(Long id) {
        Function function = this.getSession().get(Function.class,id);
        this.getSession().delete(function);
    }

    @Override
    public String read(Long id) {
        return null;
    }
}
