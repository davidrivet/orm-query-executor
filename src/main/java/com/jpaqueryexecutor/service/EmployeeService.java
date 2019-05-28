package com.jpaqueryexecutor.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaqueryexecutor.entity.Employee;

public class EmployeeService {

    public void createEmployee(Employee employee) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction( ).begin( );
        em.persist( employee );
        em.getTransaction( ).commit( );

        em.close();
        emf.close();
        
    }
}