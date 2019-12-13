package org.academiadecodigo.lavidaloca.services;

import org.academiadecodigo.lavidaloca.persistence.dao.JpaCategoryDao;
import org.academiadecodigo.lavidaloca.persistence.dao.JpaEventDao;
import org.academiadecodigo.lavidaloca.persistence.dao.JpaProviderDao;
import org.academiadecodigo.lavidaloca.persistence.dao.JpaUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private JpaUserDao userDao;
    private JpaCategoryDao categoryDao;
    private JpaEventDao eventDao;
    private JpaProviderDao providerDao;

    @Autowired
    public void setUserDao(JpaUserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setCategoryDao(JpaCategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Autowired
    public void setEventDao(JpaEventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Autowired
    public void setProviderDao(JpaProviderDao providerDao) {
        this.providerDao = providerDao;
    }
}
