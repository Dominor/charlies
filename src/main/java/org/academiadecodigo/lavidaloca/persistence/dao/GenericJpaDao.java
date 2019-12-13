package org.academiadecodigo.lavidaloca.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class GenericJpaDao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    //  CONSTRUCTOR

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }


    //  GETTERS AND SETTERS

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }

}
