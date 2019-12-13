package org.academiadecodigo.lavidaloca.persistence.dao;

import org.academiadecodigo.lavidaloca.persistence.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public class JpaCategoryDao extends GenericJpaDao<Category> {

    public JpaCategoryDao() {
        super(Category.class);
    }
}
